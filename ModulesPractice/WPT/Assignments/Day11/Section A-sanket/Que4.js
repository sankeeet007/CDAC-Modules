var arra = [
[1,2,3],
[3,4,5],
[7,8,9]
]

async function square(array) {
    let arr = []
    array.forEach(element => {
        let sum = 0
        element.forEach(element => {
          sum += element
        })
        arr.push(sum)
    });

    return arr;
}

square(arra)
    .then(data => console.log("data: ", data))
    .catch(err => console.log("Err: ", err))

