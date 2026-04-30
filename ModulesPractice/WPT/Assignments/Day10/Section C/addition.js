const fs = require('fs');

fs.readFile('./Day10/Section C/listofnumbers.txt', 'utf8', (err, data) => {
    if (err) {
        console.log("Error reading file:", err.message);
        return;
    }

    const numbers = data.split(',')
        .map(num => parseFloat(num.trim()))
        .filter(num => !isNaN(num));

    const sum = numbers.reduce((acc, curr) => acc + curr, 0);
    const output = "The total sum is: " + sum;

    fs.writeFile('./Day10/Section C/result.txt', output, (err) => {
        if (err) {
            console.log("Error writing file:", err.message);
            return;
        }
        
        console.log("File written successfully!");
        console.log("Result:", sum);
    });
});