var weight=prompt("Enter the Weight ");
var height=prompt("Enter the Height ");

function bmiCalculator(height,weight)
{
    var sum=weight/(height*height);  //math.pow(base,power)  eg:(height,2)//
    return Math.round(sum);
}

var bmi = bmiCalculator(height,weight); 
console.log("Your BMI is "+bmi);
