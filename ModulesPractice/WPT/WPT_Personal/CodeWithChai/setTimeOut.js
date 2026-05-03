// // // *** Print 1 to 10 but with delay of 1 sec 
// // // after each number gets printed

// // for(let i=1;i<=10; i++) {
// //     console.log(i);
// // }

// function h() {  
//     console.log("hello");
// }

// function m() {  
//     console.log("mello");
// }

// setTimeout(h, 2*1000);     // sets delay of 2 sec
// setTimeout(m,1*1000);     // sets delay of 1 sec


// setTimeout(function() {  
//     console.log("hello");
// }, 2*1000);     // sets delay of 2 sec
// setTimeout(function() {  
//     console.log("mello");
// },1*1000);     // sets delay of 1 sec


// setTimeout(function(){
//     console.log("Heyy there")
// }, 5*1000);

// Creating Timer 
for(let i=1; i<=20; i++){
    setTimeout(function(){
        console.log(i);
    }, i*1000);
}

