let mypromise = new Promise(function(resolve,reject)){
    let sum = 0
    if (sum == 0){
        resolve("Accepted");
    }
    else{
        reject("Rejected");
    }
}


myPromise
    .then(function(value) { console.log(value); })
    .catch(function(error) { console.log(error); })
    .finally(() => { console.log("Done"); });