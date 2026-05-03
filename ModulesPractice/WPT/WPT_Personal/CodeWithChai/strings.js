// *** String is a object in JS

// let a = "Sanket is a coder";

// // Printing String
// console.log(a);

// // Printing Length of String
// console.log(a.length);

// // Printing Specific Char 
// console.log(a[0]);

// // *** FOR EACH NOT WORKED FOR STRING CHAR PPRINTING
// // a.forEach(element => {
// //     console.log(element);
// // });

// // *** WORKS OF CHAR PRINTING FROM STRING
// for (const char of a) {
//     console.log(char);
// }


let s = "Sanket";

console.log(s.toLowerCase());   // Returns a new LowerCased String
console.log(s.toUpperCase());   // Returns a new UpperCased String

let str = "  aaKETSan  ";
console.log(str.length);
console.log(str.trim().length);
console.log(str.indexOf('a'));
console.log(str.lastIndexOf('a'));

// Both are same 
console.log(str.charAt(5));
console.log(str[5]);




