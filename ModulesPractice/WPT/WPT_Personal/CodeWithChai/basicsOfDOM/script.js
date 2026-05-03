// let x = document.querySelector("h1");
// setTimeout(function(){
//     x.style.color = "rgb(216, 160, 47)";
//     x.style.backgroundColor = "yellow";
//     x.style.fontFamily = "Gill Sans";
// },1000);
// // console.log(x); // prints on console
// // console.log(y); // prints on console

// let y = document.querySelector(".yes1");
// setTimeout(function(){
//     y.innerHTML = "New Text";
//     y.style.backgroundColor = "blue";
//     y.style.fontFamily = "Sans";
// },2000);

// setTimeout(function(){
//     document.querySelector(".yes2").innerHTML = "New Text 2";
//     document.querySelector(".yes2").style.backgroundColor = "green";
// },3000);

// // --------------> EVENT LISTENER


// let z = document.querySelector("p");
// setTimeout(function () {
//     z.style.fontFamily = "Georgia"
//     z.style.fontSize = "25px"
//     z.style.fontWeight = "bold"
//     z.style.color = "rgba(169, 0, 0, 0.47)"
// }, 4000);


let doc = document.querySelector("body");
let x = document.getElementById("ele1");

x.addEventListener("click",function(){
    // x.innerHTML = "Jigglpuff";
    x.style.color = "yellow";
    x.style.backgroundColor = "red"
})
x.addEventListener("mouseleave",function(){
    // x.innerHTML = "Jigglpuff";
    x.style.color = "black";
    x.style.backgroundColor = "white"
})

let y = document.getElementById("ele2");
y.addEventListener("mouseenter", function(){
    y.style.color = "rgb(188, 106, 12)";
    y.style.backgroundColor = "yellow";
});

y.addEventListener("mouseleave", function(){
    y.style.color = "black";
    y.style.backgroundColor = "white";
});



let z = document.getElementById("ele3");
y.addEventListener("click", function(){
    z.style.color = "green";
    z.style.border = "3px solid red"
});

let yz = document.querySelector("p");
doc.addEventListener("mouseenter", function(){
    yz.style.color = "red";
    yz.style.border = "5px solid blue";
});




