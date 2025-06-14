var a = prompt("Enter your name:");
b = a.slice(0,1);
b = b.toUpperCase();
c = a.slice(1,a.length);//can give unlimited chars length of a
c = c.toLowerCase();
alert("Hello, "+(b+c));