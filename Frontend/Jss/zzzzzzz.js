let a = [1,2,3]
let b = [4,5,6]
let c = [...a] // shallow copy
a.push(8)
console.log(a);
console.log(c);

let exteded =[...b,7,8]
console.log(b);
console.log(exteded);

// Destructing Array
const[first,...rest] = [10,20,30,40];
console.log(first);
console.log(rest);

// Desrructing Object
const users = {name:'Ram',age:24,city:'chennai'}
const job ={job:'Developer',sal:500000}

let details ={...users,...job}
console.log(details);
const{name,...others}=users;
console.log(name);
console.log(others);