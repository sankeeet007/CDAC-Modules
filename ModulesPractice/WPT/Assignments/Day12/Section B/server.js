const express = require('express');
const path = require('path')
const morgan = require("morgan")
const app = express();
const PORT = 3000;

app.use(express.json());
app.use(express.static('public')); 
app.use(morgan('short'));
app.use(express.urlencoded({extended: true}));

app.get("/",(req,res)=>{
    res.sendFile(path.join(__dirname,"public","addition.html"))
});

app.post('/server', (req, res) => {
    const { num1, num2, operation } = req.body;
    const n1 = parseFloat(num1);
    const n2 = parseFloat(num2);
    let result = 0;

    switch (operation) {
        case 'add': result = n1 + n2; break;
        case 'subtract': result = n1 - n2; break;
        case 'multiply': result = n1 * n2; break;
        case 'divide': 
            result = n2 !== 0 ? n1 / n2 : "Cannot divide by zero"; 
            break;
    }
    res.json({ result });
});

app.listen(PORT, () => console.log(`Server: http://localhost:${PORT}`));