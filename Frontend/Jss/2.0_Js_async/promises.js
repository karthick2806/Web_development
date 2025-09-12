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

// Helper function to simulate async tasks
function asyncTask(name, time, shouldReject = false) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (shouldReject) {
        reject(`${name} Failed`);
      } else {
        resolve(`${name} Success after ${time} ms`);
      }
    }, time);
  });
}

// Example Promises
const promise1 = asyncTask('Task 1', 1000);              // Resolves after 1s
const promise2 = asyncTask('Task 2', 2000);              // Resolves after 2s
const promise3 = asyncTask('Task 3', 1500, true);       // Rejects after 1.5s

//Promise.all → All promises must resolve, otherwise rejects immediately
Promise.all([promise1, promise2])
  .then(results => console.log('Promise.all results:', results))
  .catch(error => console.log('Promise.all error:', error));

//Promise.allSettled → Wait for all promises to settle (resolve or reject)
Promise.allSettled([promise1, promise2, promise3])
  .then(results => console.log('Promise.allSettled results:', results));

//Promise.any → Resolves as soon as any one promise resolves; rejects only if all reject
Promise.any([promise3, promise1])
  .then(result => console.log('Promise.any result:', result))
  .catch(error => console.log('Promise.any error:', error));

//Promise.race → Resolves or rejects as soon as the first promise settles
Promise.race([promise1, promise3])
  .then(result => console.log('Promise.race result:', result))
  .catch(error => console.log('Promise.race error:', error));




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
