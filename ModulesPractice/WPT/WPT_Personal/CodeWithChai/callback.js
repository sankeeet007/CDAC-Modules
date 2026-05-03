// // *** Callback is function which is passed in a function
// // *** Function calling another Function

// function sumOfProduct(a,b,c) {
//     return a*b*c;
// }
// // console.log(sumOfProduct(1,2,3)); // Function call

// function fun(x,y) {
//     return (x-y);
// }

// // calling fun() using sumOfProduct()
// console.log(fun(sumOfProduct(2,3,4), 7));

function Product(a,b,c) {
    return a*b*c;
}

function fun2(x,y){
        let a = x(2,3,4);
        console.log(a-y);
}

console.log(Product, 7);



