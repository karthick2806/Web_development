function display(process,name){     // in arrow format  ///// let or const display=(process,name) => process(name)) ///////
    return process(name)           //used return in all function coz used console.log to call those funct 
}                                  // or else wwe cado it in arrow funct like in the above 1st line comments 


function greets(name){
    return ("Hey Good eve! "+name)
     
}

function talks(name){
     return ("How was your day today? "+name)
   
}

console.log(display(greets,"Karthik"))    //greeets goes like process and takes 
console.log(display(talks,"Karthik"))     
