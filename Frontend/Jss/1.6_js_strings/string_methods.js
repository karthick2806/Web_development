let alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
console.log(alphabets.charAt(5))   //index position as i/p
console.log(alphabets.charCodeAt(0))  //binary or code value
console.log(alphabets.codePointAt(10))  // same like the previous
console.log(alphabets.at(-5))   //negative str from the reverse it will give "v"
console.log("Hello".concat(" "+"World"))  //concat and + to add strings
console.log(alphabets.slice(5,10))  //slices a specific part of a string
console.log(alphabets.substr(7,13))  //same like slice but if 13 is not given it might cut the previous elem before 7
console.log(alphabets.toLowerCase())   //in lower case
console.log(alphabets.toUpperCase())  //in upper case
