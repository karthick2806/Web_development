const readline=require('readline');

const r1=readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

r1.question("Enter your height in (mtrs):",function(height) {
    r1.question("Enter your weight in (kgs):",function(weight){

        var bmi = bmiCalculator(height,weight)
        console.log("Your BMI value is "+bmi)
        if (bmi<18.5)
            {
                console.log("You are at Under weight category")
            }    
        else if(bmi >= 18.5 && bmi < 24.9)
            {
                console.log("You are at Normal weight category")    
            } 
        else if(bmi >= 25 && bmi<29.9)
            {
                console.log("You are at Over weight category")
            }   
        else if(bmi >= 30 && bmi<34.9)
            {
                console.log("You are at Obese (class-1) category")
            }   
        else if(bmi >= 35 && bmi<39.9)
            {
                console.log("You are at Obese (class-2) category")
            }   
        else if(bmi>=40)
            {
                console.log("You are at Obese (class-3/Morbidly obese) category")
            } 
        else{
                console.log("You've entered a wrong value")
            }
        
            
        function bmiCalculator(height,weight)
        {
            var sum=weight/(height*height)  //math.pow(base,power)  eg:(height,2)//will also do the work
            return Math.round(sum)
        }
        r1.close()
    })
})