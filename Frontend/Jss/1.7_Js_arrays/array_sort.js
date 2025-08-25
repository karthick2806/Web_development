let fruits = ["Apple","Orange","Banana","Dragon fruit","Kiwi","Pear","Pome granate"]
let mark = [10,80,40,60,20,50,70,100,90,30]
for(let i=0;i<mark.length;i++)
{

    console.log(mark[i]+"")
}
console.log(fruits.sort())            //make changes on original array
console.log(fruits.reverse())
console.log(fruits.toSorted())        //creates a copy and leaves original unchanged
console.log(fruits.toReversed())
console.log(mark.toSorted(function(a,b)       //console.log(mark.toSorted()) will treat numbers asstring and will give wrongly sorted array
{
    return a-b      //b-a gives descending order
}))
console.log(Math.min.apply(null,mark)) //null is a syntax
console.log(Math.max.apply(null,mark))




