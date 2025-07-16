var c = prompt("write to your character");
var b = c.slice(0,140);
alert("you've written"+" "+(c.length)+" "+"you've reached the limit at "+b+" words of 140 words by typing"+" "+b.length);

// in a single line alert(prompt("only 140 words will be shown").slice(0,140));