function add(num1,num2,operation){
    let result = num1+num2;
    operation(result)
}



let timer = (()=> console.log("setTimeout function is running"),7000)


console.log(add(45,78,process))
console.log(timer)