/*a=10
  a++
  console.log(a)*/      //this will give 11 coz 10+1 //         //post incerment//

a=10
b=a++   //b=++a will gives the 11//   //a-- is a decrement operator//
//b=++a gives the output as 11// 
console.log(b)     //will give 10 coz it doesnt see a again//         //pre increment//
console.log(a)     //this see the "a" and gives output as 11//



//add or equal to operator
x=5
y=3
y+=x  //+= refers to y=y+x
console.log(y)


//power_operator
let f=5
let d=Math.pow(f,2) //here f is base and two is the power value  f**2 this can also do the job
console.log(d)

//exponential notation
let h=1234e5 //refers to 123400000
let i=1234e-5 //refers to 123400000
console.log(h)
console.log(i)