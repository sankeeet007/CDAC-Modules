const express = require('express');
const path = require('path')
const morgan = require("morgan")
const app = express()
const PORT = 3000;

app.use(express.json());
app.use(morgan('short'));
app.use(express.static('public'));
app.use(express.urlencoded({extended: true}));

app.post('/server', (req, res) => {
    const userData = req.body;

    console.log('Data received from client: ', req.body);

    res.send("Got data");
});

app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});