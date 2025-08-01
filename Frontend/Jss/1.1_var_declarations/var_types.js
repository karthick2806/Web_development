{
    let a=10 //tis is a local variable declaration only inside a block (local scope)//
    var b=20// it is a variable value will change
    const c =30//const value wil never change//
    //c=40 this too wont work coz cant change const value//
    console.log(c) //const will also work within block//
}

//console.log(a) //this will not work coz accessing out of the block//
console.log(b)
