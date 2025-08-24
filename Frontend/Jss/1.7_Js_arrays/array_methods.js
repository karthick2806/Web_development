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
//delete arr[0]; //leaves undefined space or holes in the array-
console.log(arr);
let goated = arr.concat(got); //concats two arrays desnt change the content
console.log(goated);             //we can more arrays like this arr.concat(got,brba,)
arr.copyWithin(3,0,1)     //copies the element (target index , start element , end element)
console.log(arr)
let two_dim_arr = [[1,2],[3,4],[5,6]]
console.log(two_dim_arr)
console.log("flated array : "+two_dim_arr.flat())
let mny_hst = ["Professor","Tokyo","Nairobi","Berlin","Helsinki","Moscow"]
var A = mny_hst.splice(2,1,"Rio","Denver")      //adds element in target space (target , no.of.elements deleted , elems to added)
console.log(mny_hst)
console.log("This splice method returns the deleted element "+A)
//mny_hst.spliced or toSpliced(target,1)  //used to delete one element from the arr without leaving any undefined space
console.log("\nSliced from 2 index "+mny_hst.slice(2))    //slices from second index and forms a new array
console.log("\nSlice a specific part from a arr "+mny_hst.slice(1,4))    //cutout particular element
console.log("\n"+mny_hst.toString())   //converts into string
console.log(Array.isArray(mark))        //tells whether a array is array or not



