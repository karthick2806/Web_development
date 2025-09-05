let mypromise = new Promise(function(resolve,reject){
    let sum = 0
    if (sum == 0){
        resolve("Accepted");
    }
    else{
        reject("Rejected");
    }
})


mypromise
    .then(function(value) { console.log(value); })
    .catch(function(error) { console.log(error); })
    .finally(() => { console.log("this will executed either the promise resolved or rejected"); });