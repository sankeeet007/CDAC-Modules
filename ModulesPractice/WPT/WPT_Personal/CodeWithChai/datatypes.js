const a = 20
var b = 10
let c = "Sanket"
let d = true
var e = undefined
var z = "3399"

console.log(b + "---->>" + typeof b)
console.log(c + "---->>" + typeof c)
console.log(a + "---->>" + typeof a)
console.log(d + "---->>" + typeof d)
console.log(e + "---->>" + typeof e)
console.log(z + "---->>" + typeof z)

let StringToNumber = Number(z)

console.log(StringToNumber + "---->>" + typeof StringToNumber)

let BooleanToNumber = Number(d)

console.log(BooleanToNumber + "---->>" + typeof BooleanToNumber)

d = false   // modifying value of d
let BooleanToNumber2 = Number(d)

console.log(BooleanToNumber2 + "---->>" + typeof BooleanToNumber2)


y = 0   // y is number
let NumberToBoolean = Boolean(y)

console.log(NumberToBoolean + "---->>" + typeof NumberToBoolean)