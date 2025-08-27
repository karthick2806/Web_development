function display(process,name){     // in arrow format  ///// let or const display=(process,name) => process(name)) ///////
    return process(name)           //used return in all function coz used console.log to call those funct 
}                                  // or else wwe cado it in arrow funct like in the above 1st line comments 


function greets(name){
    return ("Hey Good eve! "+name)
     
}

function talks(name){
    return ("How was your day today? "+name)  
/*
-->if widout display (callback function) means the calllback will be here in talks() like
callback() or a param with it like process (name) that too coz return keyword

-->then the name value goes back to the arg process (the process name is user defined)

-->then the name value(name) got shared by the function marked process here but called as greet() or talk() down there

-->then coz of return the funct call wrapped inside console.log


*/
   
}

console.log(display(greets,"Karthik"))    //greeets goes like process and takes 
console.log(display(talks,"Karthik"))     //if talk() and greet() built with console.log means here there is no need


/*
basically here this is the syntax
*/

