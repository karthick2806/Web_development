let abcd="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
console.log(abcd.indexOf("GHIJ"))   //gives index of the str
console.log(abcd.lastIndexOf("WXYZ"))  //gives the last indexof the str
console.log(abcd.search("KLMN"))   //gives the index number
console.log(abcd.match("PQR"))   //matches the word with the mainstring
console.log(abcd.startsWith("ABCD",0))  //checks if the str starts with given str or not with a specified index value like 0 here
console.log(abcd.endsWith("ABCD",4))  //same goes with the ends with will return false or true