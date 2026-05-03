// // # Map --> Map in JS basically used to recrate an (array) using existing array with some specific changes



// function twice(ele) {
//     return 2*ele;
// }


// function square(ele) {
//     return ele*ele;
// }

// function add10(ele) {  
//     return ele+10;
// }

// let arr = [1,2,3,4];
// let brr = arr.map(twice);
// let crr = brr.map(square);
// let drr = crr.map(add10);
// console.log(`Arr (Original) --> `, arr);
// console.log(`Brr (Twiced)--> `, brr);
// console.log(`Crr (Squared)--> `, crr);
// console.log(`Drr (Add 10)--> `, drr);


function twice(ele) {
    return 2*ele;
}


function square(ele) {
    return ele*ele;
}

function add10(ele) {  
    return ele+10;
}


// Changes are made in original Array 
// Used Arrow Function
let arr = [1,2,3,4];
console.log(`Arr (Original) -->`, arr);
arr = arr.map(ele => ele*ele);

console.log(`Brr (Cubed) -->`, arr);