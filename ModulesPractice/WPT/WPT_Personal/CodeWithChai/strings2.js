// // *** slice() --> gives substring

// let s = "Sanket Solanke";
// console.log(s.slice(4)) // return string form 4th index onwords
// console.log(s.slice(4,8)) // return string form 4th to 7th (8 is exclusive)


// // CONCAT String
// let s2 = s.slice(4,8) // stores string form 4th to 7th (8 is exclusive)
// console.log(s,s2);      // Concats both strings


let newStr = "Hello everyone! I'am Sanket Solanke From B2 Batch AC course";
console.log(newStr);

let arr = newStr.split(' ');
for (const element of arr) {
    console.log(element);
}
