// // *** Object in JS in more like Map/Dictoonary
// // *** It stored key value pairs

// //normal array
// var details = ["Sanket", 29.3, 4, false];

// // Object [Personal Records]
// let obj = {
//     name: "Sanket", // name is key and "Sanket" is value
//     age: "22",
//     percentage: "93.6",
//     isMarried: false
// };

// Car details object
// let car = {
//     "company" : "VolksWagan", // we can store key as a String
//     model: "Virtus GT",
//     mileage: 14.5,
//     engine: "V8",
//     "isUsed": true,
// };

// console.log(car);

// console.log(car.engine);

// // Accessing Object's DataFields 
// console.log(car.engine, car.isUsed, car["isUsed"]);
// console.log(car['company']);


// // Modifying Object data
// car.engine = "V12";
// car['age'] = 4;        // Added new dataField in Car Object
// console.log(car);

// // FOR-IN LOOP TO ITERATE car OBJECT
// for (const key in car) {
//         console.log(key);
// }


let car = {
    "company" : "VolksWagan", // we can store key as a String
    "model": "Virtus GT",
    "mileage": 14.5,
    "engine": "V8",
    "isUsed": true,
};

// FOR-OF LOOP TO ITERATE car OBJECT
for (const key in car) {
    console.log(`${key} --> ${car[key]}`);
}


