// Use Promises(then and catch):
// 2.Create a async function which square each elements of the array and return the array
async function SquareOfAll(array) {
    return array.map(element => element*element)
}
SquareOfAll([1,2,3])
.then((data)=> console.log(data))
.catch((error)=> console.log("error"));

