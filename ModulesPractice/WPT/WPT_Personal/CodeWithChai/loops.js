// <---- FOR LOOP ---->

// for(var i=0; i<5; i++) {
//     console.log(i);
// }


// <---- WHILE LOOP ---->
// var i = 0;
// while(i <= 5) {
//     console.log(i++)
// }


// <---- DO-WHILE LOOP ---->
// var i = 0;
// do{
//     console.log(i++);
// }while(i<5)

// <---- NESTED LOOPS ---->
// var k = 1;
// for(var i=0; i<5; i++){
//     for(var j=0; j<5; j++){
//         console.log(k++);
//     }
// }


// // <---- FOR OF LOOP----> 
// let arr = [2,4,6,7,9,8];
// for (const iterator of arr) {
//     console.log(iterator);
// }

// *** Gives error iterator is const
// *** even if we changes it to let it gives error
// *** iterator stores the data from array one by one
// *** and we are changing the iterator and not the actual data in array
// *** if we want to do that we have to use normal for loop.
// let brr = [2,4,6,7,9,8];
// for (let iterator of brr) {
//     iterator *=2;
//     console.log(iterator);
// }
// console.log(brr);

// <---- FOR EACH LOOP---->
crr = [3,5,2,6,8,1];

crr.forEach((ele, i) => {   // i is index
    console.log(ele, i);
});