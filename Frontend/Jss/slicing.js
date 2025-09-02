/*var c = prompt("write to your character");
var b = c.slice(0,140);
alert("you've written"+" "+(c.length)+" "+"you've reached the limit at "+b+" words of 140 words by typing"+" "+b.length);

// in a single line alert(prompt("only 140 words will be shown").slice(0,140));
*/



/*function greets(name,no) {
  console.log("Hey Good eve! " +name)
  console.log("your number is: "+no)
}

function talks(value,nme,id) {
  console.log("Starting conversation...please stay for a while "+ nme)
  value(nme,id)  // callback executed here
}

// here greets is used as callback
talks(greets,"Karthik",28)
*/

function greets(name, age, city) {
  console.log("Hey " +name+ " You are "+age+ " and living in "+city);       //If the values must change every time → pass them in the function call.
}
                                                                            //If the values are always same → define inside the function.
function talks(callback, nme, no) {                                         
  console.log("Hybrid conversation...");                                    //If it’s a combination → mix both (caller + inside function).
  let city = "Chennai";  // fixed inside
  callback(nme, no, city); // mix dynamic + fixed
}

// caller gives name & age, function adds city
talks(greets, "Karthick", 28);
talks(greets, "Arun", 22);




