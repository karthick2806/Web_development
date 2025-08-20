const arr = [
  "Heisenberg",
  "Hank schrader",
  "Tuco salamanca",
  "Gustavo fring",
  "Skylar white",
];
const got = ["Jon snow", "Bran stark", "Arya stark", "Jon snow"];
console.log(arr.length); //and also print the length of the array
//arr.length=2       //we can also set length to array which gives only give two names
var a = arr.toString();
console.log(a);
console.log(arr.at(0)); //give the value at 0th index
console.log(arr.join(" $ ")); //joins array with any symbols inside " "
arr.pop(); //defaultly removes last element
console.log(arr);
arr.push("Mike ehrmantraut"); //defaultly add new element in last index
console.log(arr);
arr.shift(); //defaultly removes first element
console.log(arr);
arr.unshift("Jesse pinkman"); //defaultly adds first element
console.log(arr);
arr[3] = "Walter white"; //displaces the element on the specific index
console.log(arr);
delete arr[0]; //leaves undefined spacein the array-
console.log(arr);
let goated = arr.concat(got); //concats two arrays desnt change the content
console.log(goated);             //we can more arrays like this arr.concat(got,brba,)


