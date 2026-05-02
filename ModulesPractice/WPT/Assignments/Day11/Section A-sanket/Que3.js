async function sumOfArray(arr) {
    
    let sum=0;
    for(let i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    console.log(sum);
    
}

async function square(array) {
    
    let arr = []  
     array.forEach(element => {
        // console.log(element*element);
        arr.push(element*element);
        
    });
      return arr;
    
}


let ans = [1,2,3]

square(ans)
    .then(data => sumOfArray(data))
    .catch(err => console.log("Error: ", err))




