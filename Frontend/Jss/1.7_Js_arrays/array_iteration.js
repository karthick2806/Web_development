let grades = [56,24,76,45,35,79,24,9,8]
let txt =" "
console.log(grades.forEach(value => console.log(value)))
console.log(grades.filter(value=> value < 18))
console.log(grades.reduce((total,value)=>total + value))    //reduces all array elems as single elem as added or subbed value
 //total - value will give -254             //////////////(total,value) takes into one value//////////////
                                                    /////////////                  ////////////////


//console.log(grades.reduceRight((total,value)=>total + value))      reduces from right left                                                          ///////////////////
console.log(grades.every((value)=> value < 8 ))   //gives T or F by checking every elems in array wid a specific condition




