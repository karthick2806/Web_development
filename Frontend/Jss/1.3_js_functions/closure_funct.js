function outerFunction(start) {
  let count = start; //  count is created here

  function innerFunction(step) { // step comes only when called
    count += step; // (C) update count with step
    console.log(count);
  }

  return innerFunction;  //this inner function goes to or assigned to counter variable
}

let counter = outerFunction(10); //  tis step is completed and 10 got updated
counter(1); // (2)    these are the actual step args
counter(2); // (3)

//the inner funct remembers outer funct values and that is called closure 
