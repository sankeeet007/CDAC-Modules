async function square(array) {
    const arr=[];   
     array.forEach(element => {
        arr.push(element*element);
    });
    return arr;
}


var res = square([1,2,3])
  .then(data => console.log("Squared Data: ", data))
  .catch(err => console.log("Error: ", err))
