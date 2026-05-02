async function sumOfArray( arr) {
    let sum=0;
    for(let i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum
}


sumOfArray([1,1,1])
        .then(data => console.log("Data: ",data))
        .catch(err => console.log("Err: ", err))