let pens =["Parker","Reynolds","Claro","Flair","Hero","Hausen","Cello","Claro","Linc"]
let rank = [1,2,3,4,5,6,7,8,9,10]
console.log(pens.indexOf("Claro"))      //+1 for exact explanation
console.log(pens.lastIndexOf("Claro"))    //tells the last  occurence of the element in the array
console.log(pens.includes("Claro"))     //tells is it in or what
console.log(pens.find(function(element,index,array)
{
    return element==="Hero"                         //returns or find the element in the array
}))
console.log(pens.findIndex(function(element,index,array)
{
    return element==="Cello"                         //returns index of particular array
}))
console.log(rank.some(function(element,index,array)
{
    return element%2==0                             //returns even if any one condition satisfies
}))

let findlast = rank.findLast(x => x > 7)
console.log(findlast)                               //returns  or find the elem in the array from the last index or right side

let findlastindex = rank.findLastIndex(x => x > 7)
console.log(findlastindex)                           //returns  or find the index of the last elem in the array from the last index or right side

































