function add(operation,num1,num2){
    let count = 0
    let timer = setInterval(()=>{
        count++ ;
        console.log("Please wait for "+count+" seconds...."); 
        
        /*
        if u dont want those 5 lines spamming on console.log
        then

        // Clear the previous line and rewrite
        process.stdout.clearLine(0);   // clear current line
        process.stdout.cursorTo(0);    // move cursor to start
        process.stdout.write("Please wait for " + count + " seconds...");
        */


        if (count==5){
            clearInterval(timer)                                
            console.log("Stopped after 5 secs using clearinterval")
        }

    },1000)
    operation(num1,num2)
}

function process(a,b){
    let num = 0
    let timer2 = setTimeout(()=>{
        let result = a+b;
        console.log("This is the result: "+result)},6000)
        
        if(a==0 && b==0){
            clearTimeout(timer2)
            console.log("Stopped using cleartimeout() coz given inputs are 0")
        }

    }

add(process,45,78)



/*

-----------------number of ways to delay the settimeout------------------

1. Delay the whole process function

You wrap the entire logic in setTimeout (what you already did):

function process(a, b) {
    setTimeout(() => {
        let result = a + b;
        console.log("This is the result: " + result);
    }, 2000);
}


---

2. Delay only the printing part

You calculate immediately, but delay the console output:

function process(a, b) {
    let result = a + b;
    setTimeout(() => {
        console.log("This is the result: " + result);
    }, 2000);
}


---

3. Delay return with a callback (control outside)

Instead of printing inside process, you send result later via another callback:

function process(a, b, callback) {
    setTimeout(() => {
        let result = a + b;
        callback(result);
    }, 2000);
}

// Usage:
add((x, y) => process(x, y, (res) => console.log("This is the result: " + res)), 45, 78);


---

4. Delay using a separate helper function

Make another function that only delays, then use it in process:

function delayPrint(text) {
    setTimeout(() => console.log(text), 2000);
}

function process(a, b) {
    let result = a + b;
    delayPrint("This is the result: " + result);
}


---

5. Delay with multiple steps

Maybe you want different parts delayed separately:

function process(a, b) {
    console.log("Calculation started...");
    setTimeout(() => {
        let result = a + b;
        console.log("This is the result: " + result);
    }, 2000);
}

*/



/*
let count = 0
let timer = setInterval(() => {
  let d = new Date();
  console.log(
    d.getHours() + ":" +
    d.getMinutes() + ":" +
    d.getSeconds()
  );

  count++;

  // stop after 5 times
  if (count === 5) {
    clearInterval(timer);
    console.log("Timer stopped!");
  }
}, 1000);
*/