// Use Promises(then and catch):
// 1.Create a async function which takes an array and return sum of all elements of array
async function SumOfAll(array) {
    var sum = 0
    array.forEach(element => {
       sum+=element 
    });
    return sum
}
SumOfAll([1,2,3])
.then((data)=> console.log(data))
.catch((error)=> console.log("error"));

