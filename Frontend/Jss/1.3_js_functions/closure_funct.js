function outerFunction(start) {
  let count = start; //  count is created here

  function innerFunction(step) { // step comes only when called
    count += step; // (C) update count with step
    console.log(count);
  }

  return innerFunction;  //this inner function goes to or assigned to counter variable
}

let counter = outerFunction(10); // (1)
counter(1); // (2)    these are the actual step args
counter(2); // (3)
