// // # Filtering array based on some condition

// // filter out odd elements

// // ----> using other function


let arr = [1,2,3,4,5,6,7,8,9,10];
console.log(`Original Arr --> `, arr);

// let brr = arr.filter(function(ele) {
//     if(ele%2!=0) return true;
//     else return false;
// })
// console.log(`Filtered (Odd) Brr --> `, brr);

// ----> Using Arrow Function

// For even elements
let brr = arr.filter(ele => {
    // return (ele%2==0) ? true : false;
    return (ele%2==0);
})
console.log(`Filtered (Even) Brr --> `, brr);



