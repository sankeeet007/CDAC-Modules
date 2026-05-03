let arr = [1,3,2,1,3,9,11,-1];

console.log(`Original Arr ---> `, arr);

arr = arr.sort();   
// the .sort() method converts elements into strings and compares them based on their UTF-16 code unit values (alphabetical order).
console.log(`Sorted Arr ---> `, arr); // Gotcha moment :-(  

// correct way to use .sort()

arr = arr.sort((a,b) => a-b);
console.log(`Corrected Sort Arr ---> `, arr); 


// Custom sort Decreasing 
arr = arr.sort((a,b) => b-a);
console.log(`Decreased Sort Arr ---> `, arr); 


