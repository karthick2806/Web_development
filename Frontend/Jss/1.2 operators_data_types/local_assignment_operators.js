//&&= logical AND assignment
let name = true //if name=false then karthik will,nt executed coz AND wont give 1 as o/p until both are true
name &&="Karthik"
console.log(name)

//||= logical OR assignment
let a = false
a ||="Karthik" //even one is true then op will be true
console.log(a)

//=?? nullish coalescing assignment
let c = null 
c ??="Karthik" //will only assign c=karthick if the c=null or undefined not on 0 or " "
console.log(c)


//difference btwn == and ===
console.log(10 === 10);      // true (same value, same type - number)
console.log(10 === "10");    // false (same value, but different types - number vs string)
console.log(true === 1);     // false (different values and different types - boolean vs number)
console.log(null === undefined); // false (different types)



