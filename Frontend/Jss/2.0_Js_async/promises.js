let mypromise = new Promise(function(resolve,reject){    //creating a promise that returns either Resolve or Reject
    let sum = 0                  //promises will be usefull in fetching API and making decisions in it in a async time nature 
    if (sum == 0){
        resolve("Accepted");    //we can also delay it like settimeout(resolve,4000)
    }
    else{
        reject("Rejected");
    }
})

mypromise
    .then(function(value) { console.log(value); })      //the value will defaultly execute and take the value when the promise got resolved  
    .catch(function(error) { console.log(error); })
    .finally(() => { console.log("this will executed either the promise resolved or rejected"); }); 


//static methods in js promise











/*
-----Using it on a function------

function check(a){
    return new Promise((resolve,reject) =>{
        let num = a;
        if (num%2==0) {
            resolve("even")
        }else{
            reject("odd")
        }
    })


    .then((even)=>{console.log(`the given number is`,even)})
    .catch((odd)=>{console.log(`the given number is`,odd)})

    
}

check(1)
console.log(`hii`);
check(6)


*/
