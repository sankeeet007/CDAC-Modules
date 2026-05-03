let arr = [1,22,4,2,5,8,34,8,9];

console.log(`Original Arr ---> `, arr);


let x = arr.reduce(function(a,b){
    return a+b;
})
console.log(x);