function fakePaymenAPI(amount){
    return new Promise ((resolve) =>{
        setTimeout(()=>{
            resolve(`Payment of ₹${amount} successful`)
        },2000)
    })
}

async function makePayment(){
    console.log(`processing payment`);
    const msg = await fakePaymenAPI(500);
    console.log(msg);
}

makePayment();



/*

let checkpass = (password) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(`✅ Welcome`);
        }, 2000);
    });
};

let login = async (event) => {
    event.preventDefault()
    let username = "admin";
    let password = "1234"; // Store as string for comparison

    let uname = document.getElementById("username").value.trim();
    let pwd = document.getElementById("password").value.trim();
    let errormsg = document.getElementById("error");

    if (username === uname && password === pwd) {
        errormsg.innerText = `⏳ Please wait a minute...`;
        let message = await checkpass(pwd);
        errormsg.innerText = message;
    } else {
        errormsg.innerText = `❌ Your credentials are wrong`;
    }

   
};

*/







