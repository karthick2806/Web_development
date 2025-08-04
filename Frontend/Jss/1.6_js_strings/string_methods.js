let alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
let trimming="    Hello World    "
let notwellformed="\uD800"
console.log(alphabets.charAt(5))   //index position as i/p
console.log(alphabets.charCodeAt(0))  //binary or code value
console.log(alphabets.codePointAt(10))  // same like the previous
console.log(alphabets.at(-5))   //negative str from the reverse it will give "v"
console.log("Hello".concat(" "+"World"))  //concat and + to add strings
console.log(alphabets.slice(5,10))  //slices a specific part of a string
console.log(alphabets.substr(7,13))  //same like slice but if 13 is not given it might cut the previous elem before 7
console.log(alphabets.toLowerCase())   //in lower case
console.log(alphabets.toUpperCase())  //in upper case
console.log(alphabets.isWellFormed())  //well formed checks is the str formed widout any illegal chars will return true or false
console.log(notwellformed.toWellFormed())  //will change into well formed if its 
console.log(trimming.trim())  //cuts whitespace
console.log(trimming.trimEnd())  //cuts only end's whitespace trimStart trims on initial
console.log(alphabets.padEnd(30,"P"))  //pads words with a specific size here 5
console.log(alphabets.includes("L", 3))  //checks whether the substr is there or not in the mainstr the 3 is index here if L is before 3 then false
console.log(alphabets.padStart(30,"P"))  //pads words in start with a specific size here 5
console.log(alphabets.repeat(4))  //repeat the whole str
console.log(alphabets.replace("GHIJKL","GEETHA"))  //replace the str with another one "case sensitive & equal length must
console.log(alphabets.split(","))  //will split the str with , or | or " "