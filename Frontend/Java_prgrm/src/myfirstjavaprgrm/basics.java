package myfirstjavaprgrm;
import java.util.Arrays;  //Always import java.util.Arrays; when using Arrays.toString() or Arrays.deepToString()
                           //Otherwise, Eclipse won’t recognize the Arrays class, and you'll get that error ❌

public class basics {

	public static void main(String[] args) {
		System.out.println("Hello world"); // the ln after print will print in a new line
		System.out.println(2806);    //numbers dont need quotes
     
		
		
		//Variables and data types,declaration
		System.out.println("\n\n");
	    System.out.println("//Variables and data types,declaration");
		int mynum = 5;
		System.out.println(mynum);   //"""var""" u can simply declare var then let java choose the type
		float myfloat = 5.3432f;
		System.out.println(myfloat); 
	    char mychar = 'G';    //only one character
	    System.out.println(mychar); 
	    boolean mybool = true;
	    System.out.println(mybool); 
	    final String mystr = "Gee";    //string the "S" must be capital
	    System.out.println(mystr); 
	    //mystr = "Anotherone";    cant change mystr coz final or const keyword
	    
	    //primitive data type
	    /*
	    byte	Stores whole numbers from -128 to 127
	    short	Stores whole numbers from -32,768 to 32,767
	    int	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
	    long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	    float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	    double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
	    boolean	Stores true or false values
	    char	Stores a single character/letter or ASCII values
	    */
	    int a = 5,b = 6;  //multiple variable declaration
	    //int x,y,z
	    //x = y = z = 50    //multiple declaration with a single value
	    System.out.println(a+b);
	    String mystr2 = "tha";
	    System.out.println(mystr+mystr2);  //str concat
	    
	    
	    
	    //Type casting
	    System.out.println("\n\n");
        System.out.println("//Typecasting");
	    //Widening casting    byte -> short -> char -> int -> long -> float -> double
	    int num = 57;
	    double doubl = num;                 //Auto cast
	    System.out.println(doubl);    
	    //Narrow casting      double -> float -> long -> int -> char -> short -> byte
        double doubl2 = 4.57d;
        int myint = (int) doubl2;           //Manual cast
        System.out.println(myint);		
        
        
       
        //Operators
        System.out.println("\n\n");
        System.out.println("//Operators");
        int h = 10;
        int y = 3;
        System.out.println(h + y); 
        System.out.println(h - y); 
        System.out.println(h * y); 
        System.out.println(h / y); 
        System.out.println(h % y); 
        int z = 5;
        ++z;
        System.out.println(z);
        --z;
        System.out.println(z);
        
        
        //assignment operators
        /*
        x += 3			x = x + 3	
        x -= 3			x = x - 3	
        x *= 3			x = x * 3	
        x /= 3			x = x / 3	
        x %= 3			x = x % 3	
        x &= 3			x = x & 3	
        x |= 3			x = x | 3	
        x ^= 3			x = x ^ 3	
        x >>= 3			x = x >> 3	
        x <<= 3	   	 	x = x << 3
	    */
	   
        //comparison operators
        /*
        x == y	
		x != y	
		x > y	
		x < y	
		x >= y	
		x <= y
        */
        
        //Logical operators
        System.out.println("\n\n");
        System.out.println("//Logical operators");
        boolean bln1 = true;
        boolean bln2 = false;
        System.out.println(bln1 && !bln2);
        System.out.println(bln1 || bln2);
        System.out.println(!bln1);
        
        
        
        //Strings
        System.out.println("\n\n");
        System.out.println("//Strings");
        String sivaji = " Rajini ";
        String mgr = "Rajini";
        String surname = "kanth";
        System.out.println(sivaji.length()); // gives length of string
        System.out.println(mgr.toUpperCase());
        System.out.println(mgr.toLowerCase());
        System.out.println(sivaji.indexOf("i"));
        System.out.println(sivaji.charAt(3));
        System.out.println(sivaji.trim());
        System.out.println(sivaji.equals(mgr));
        System.out.println(mgr.concat(surname));
        System.out.println("Motto = Let\'s Get Rajinified"); // "\" allows special character like \',\",\\
        System.out.println("This Sentence\thas 4 spaces and\nthis is a new line and t\bhis will delete a single char h in this");
        System.out.println("Hello \r world"); //overwrites the next word in the same line but supports only on cmd or terminal not on ide
        
        
        //String references
        /*
        Method	Description	Return Type
        charAt()		Returns the character at the specified index (position)	char
        codePointAt()	Returns the Unicode of the character at the specified index	int
        codePointBefore()	Returns the Unicode of the character before the specified index	int
        codePointCount()	Returns the number of Unicode values found in a string.	int
        compareTo()		Compares two strings lexicographically	int
        compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
        concat()		Appends a string to the end of another string	String
        contains()		Checks whether a string contains a sequence of characters	boolean
        contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
        copyValueOf()	Returns a String that represents the characters of the character array	String
        endsWith()		Checks whether a string ends with the specified character(s)	boolean
        equals()		Compares two strings. Returns true if the strings are equal, and false if not	boolean
        equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
        format()		Returns a formatted string using the specified locale, format string, and arguments	String
        getBytes()		Converts a string into an array of bytes	byte[]
        getChars()		Copies characters from a string to an array of chars	void
        hashCode()		Returns the hash code of a string	int
        indexOf()		Returns the position of the first found occurrence of specified characters in a string	int
        intern()		Returns the canonical representation for the string object	String
        isEmpty()		Checks whether a string is empty or not	boolean
        join()			Joins one or more strings with a specified separator	String
        lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
        length()		Returns the length of a specified string	int
        matches()		Searches a string for a match against a regular expression, and returns the matches	boolean
        offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
        regionMatches()	Tests if two string regions are equal	boolean
        replace()	    Searches a string for a specified value, and returns a new string where the specified values are replaced	String
        replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
        replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
        split()	        Splits a string into an array of substrings	String[]
        startsWith()	Checks whether a string starts with specified characters	boolean
        subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
        substring()	    Returns a new string which is the substring of a specified string	String
        toCharArray()	Converts this string to a new character array	char[]
        toLowerCase()	Converts a string to lower case letters	String
        toString()		Returns the value of a String object	String
        toUpperCase()	Converts a string to upper case letters	String
        trim()			Removes whitespace from both ends of a string	String
        valueOf()		Returns the string representation of the specified value	String
		*/

        
        
        //Math.methods
        System.out.println("\n\n");
        System.out.println("//Math.methods");
        int hi = 2;
        int bye = 3;
        int bro = -45;
        int hello = 64;
        int randomNum = (int)(Math.random() * 101);  //Math.random() returns a double. To get an integer, you need to cast it with (int).
        System.out.println(Math.max(hi,bye));
        System.out.println(Math.min(hi,bye));
        System.out.println(Math.sqrt(hello));
        System.out.println(Math.abs(bro));
        System.out.println(Math.pow(hi,bye)); //it means 2 power 3
        System.out.println(Math.round(4.6));  // 5
        System.out.println(Math.ceil(4.1));   // 5.0
        System.out.println(Math.floor(4.9));  // 4.0
        System.out.println(randomNum);

        
        
        //Math method reference
        /*
        Method		Description	Return Type
        abs(x)		Returns the absolute value of x	double|float|int|long
        acos(x)		Returns the arccosine of x, in radians	double
        addExact(x, y)	Returns the sum of x and y	int|long
        asin(x)		Returns the arcsine of x, in radians	double
        atan(x)		Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians	double
        atan2(y,x)	Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).	double
        cbrt(x)		Returns the cube root of x	double
        ceil(x)		Returns the value of x rounded up to its nearest integer	double
        copySign(x, y)	Returns the first floating point x with the sign of the second floating point y	double|float
        cos(x)		Returns the cosine of x (x is in radians)	double
        cosh(x)		Returns the hyperbolic cosine of a double value	double
        decrementExact(x)	Returns x-1	int|long
        exp(x)		Returns the value of Ex	double
        expm1(x)	Returns ex -1	double
        floor(x)	Returns the value of x rounded down to its nearest integer	double
        floorDiv(x, y)	Returns the division between x and y rounded down	int|long
        floorMod(x, y)	Returns the remainder of a division between x and y where the result of the division was rounded down	int|long
        getExponent(x)	Returns the unbiased exponent used in x	int
        hypot(x, y)	Returns sqrt(x2 +y2) without intermediate overflow or underflow	double
        IEEEremainder(x, y)	Computes the remainder operation on x and y as prescribed by the IEEE 754 standard	double
        incrementExact(x)	Returns x+1	int|double
        log(x)		Returns the natural logarithm (base E) of x	double
        log10(x)	Returns the base 10 logarithm of x	double
        log1p(x)	Returns the natural logarithm (base E) of the sum of x and 1	double
        max(x, y)	Returns the number with the highest value	double|float|int|long
        min(x, y)	Returns the number with the lowest value	double|float|int|long
        multiplyExact(x, y)	Returns the result of x multiplied with y	int|long
        negateExact(x)	Returns the negation of x	int|long
        nextAfter(x, y)	Returns the floating point number adjacent to x in the direction of y	double|float
        nextDown(x)	Returns the floating point value adjacent to x in the negative direction	double|float
        nextUp(x)	Returns the floating point value adjacent to x in the direction of positive infinity	double|float
        pow(x, y)	Returns the value of x to the power of y	double
        random()	Returns a random number between 0 and 1	double
        rint(x)		Returns the double value that is closest to x and equal to a mathematical integer	double
        round(x)	Returns the value of x rounded to its nearest integer	long|int
        scalb(x, y)	Returns x multiplied by 2 to the power of y	double|float
        signum(x)	Returns the sign of x	double|float
        sin(x)		Returns the sine of x (x is in radians)	double
        sinh(x)		Returns the hyperbolic sine of a double value	double
        sqrt(x)		Returns the square root of x	double
        subtractExact(x, y)	Returns the result of x minus y	int|long
        tan(x)		Returns the tangent of an angle	double
        tanh(x)		Returns the hyperbolic tangent of a double value	double
        toDegrees(x)	Converts an angle measured in radians to an approx. equivalent angle measured in degrees	double
        toIntExact(x)	Converts a long value to an int	int
        toRadians(x)	Converts an angle measured in degrees to an approx. angle measured in radians	double
        ulp(x)		Returns the size of the unit of least precision (ulp) of x	double|float
        
        Note: All Math methods are static.
        */
        
        
        //Conditional statements
        System.out.println("\n\n");
        System.out.println("//Conditional statements");
        int marks = 76;
        if(marks>90) {
        	System.out.println("Grade A");
        }
        else if(marks>80) {
        	System.out.println("Grade B");
        }
        else if(marks>70) {
        	System.out.println("Grade C");
        }		
        else if(marks>50) {
        	System.out.println("Grade D");
        }
        else {
        	System.out.println("Fail");
        }
        
        
        String today = "raining";
        var weather = (today=="raining") ? "Yes it\'s raining" : "no it is\'nt";   //short hand--->"""var=(condition) ? "exp1" : "exp2";"""
        System.out.println(weather);		
        
        
        //nested if
        int age = 22;
        String course="engineer";
        boolean job = false;
        if(age>18) {
        	System.out.println("You are at first stage of unemployment");
        	if(course=="engineer") {
        		System.out.println("You are at second stage of unemployment");
        		if(job==false) {
            		System.out.println("You are at third stage of unemployment");
        		}
        	}
        }
        
        
        
        //switch case
        String preferences = "fresher";
        switch (preferences) {
        case "experienced":
        	System.out.println("preferences : experienced founded");
        	break;
        case "amateur":
        	System.out.println("preferences : amateur founded");
        	break;
        case "on_training":
        	System.out.println("preferences : On training founded");
        	break;
        case "fresher":
        	System.out.println("preferences : fresher founded");
        	break;
        default:
        	System.out.println("preferences : not founded");
        }
        
        
        //while loop(entry checking loop)       //decrement operator
        int loop = 0;                           //loop = 10
        while(loop<=10) {                       //loop <= 0   but with loop-- to decrease
         	System.out.println(+loop);
            loop++;
        }
        
        
        //do while (exit checking loop)
        int exit = 0;
       
        do {
        	System.out.println(+exit);
        	exit++;
        }while(exit<=10);
        
        
        //for loop  sum of numbers
        int sum = 0;
        for (int i = 1; i <= 5; i++) {      //(var_dec ; condition ; increment or decrement)
          sum = sum + i;
        }
        System.out.println("Sum is " + sum);
        
        
        //nested loop
        for(int i = 1; i <= 3; i++) {
        	  for (int j = 1; j <= 3; j++) {
        	    System.out.print(i * j + "  ");
        	  }
        	  System.out.println("\n");
        	}
        
        //for each loop made for arrays specially
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
          System.out.println(car);
        }
        
        
        //break and continue
        for(int j =0; j<=15; j++) {
        	if (j%2==0) {
        		continue;
        	}
        	if(j==11) {        //if i gave break at 10 which is gonna get skipped by continue stmnt so the loop runs upto j=15
        		break;         //so never break and continue on same number
            }
        	System.out.println(j);        	
	 
		}
        
        
        
        
        
        //Array
        System.out.println("\n\n");
        System.out.println("//Arrays");
        String[] mates = {"Sugumar","Fareeth","Jeslin","Logesh","Paulraj","Narasimman","Sugumar"};
        for(int i = 0; i <mates.length; i++) {
        	System.out.println(mates[i]);
        }
        System.out.println(mates[2]);
        mates[6]="Karthik";
        System.out.println(Arrays.toString(mates));
        System.out.println(mates.length);
        String[] automobiles= new String[4]; //we can specifically define the size of the elements by "new" keyword  
        automobiles[0] = "Volvo";
        automobiles[1] = "BMW";
        automobiles[2] = "Ford";
        automobiles[3] = "Mazda";
        System.out.println(Arrays.toString(automobiles));
        //Multi-dimensional array
        int[][] multi = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(multi[2][1]);
        multi [0][2] = 28;
        System.out.println(multi[0][2]);
        for(int row = 0; row < multi.length; row++) {
        	for(int col = 0; col < multi[row].length; col++) {
        		System.out.println("\n");
        		System.out.println(multi[row][col]);
        		}
        	}
        int[][] for_each = {{9,8,7},{6,5,4},{3,2,1}};
        for(int[] row1 : for_each) {
        	for(int num_ber : row1) {
        		System.out.println(num_ber);
        	}
        }
        
        /*
         * to print a array
         * 1.for (type variableName : arrayName){}
         * 2.Double for loop
         * 3.Arrays.toString(array_name)  but need to import some packages
         */
        
        
        
        
        
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
        
        
        
        
	}
  
        	
        	
        	
        	
        	
        	

        	
        


  
        
        
        
        
	    		
	    
	    		
	    
	    
	


