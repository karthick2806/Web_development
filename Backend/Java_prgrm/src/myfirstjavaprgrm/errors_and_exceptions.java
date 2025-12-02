package myfirstjavaprgrm;
import java.util.*;


public class errors_and_exceptions {

	public static void main(String[] args) {
		/*
		@Compile-time
		Happens before running the program.
		The compiler (Javac) checks your syntax.
		Example:
		*Missing ;
		*Misspelling class name
		*Using variable without declaring

		@Runtime:
		Happens while running the program.
		Examples:
		*Division by zero
		*Reading array index above its size
		*NullPointerException

		@Logical error:
		The code runs successfully BUT result is wrong.
		Example: adding instead of subtracting.
		*/
		
		//exception can be handled not like error
		
		
		
		
		
		
		/*
		| Type                   | When it occurs              | Can we handle it?      | Examples                                  |
		| ---------------------- | --------------------------- | ---------------------- | ----------------------------------------- |
		| **Compile-time Error** | Before running              | Must fix               | Missing `;`, Wrong class name             |
		| **Exception**          | When program is running     | YES, using `try-catch` | ArithmeticException, NullPointerException |
	    | **Error**              | Serious problem with system | NO (unrecoverable)     | OutOfMemoryError, StackOverflowError      |
		*/
		
		
		
		
		
		/*
		@Checked Exceptions (must handle)
		Compiler forces you to handle using try-catch or throws.
		Examples:
        *IOException
        *SQLException
		*FileNotFoundException
		*InterruptedException

		Why they are checked?
		Because they depend on external factors like file, network, database.

		@Unchecked Exceptions (runtime)
        Compiler does not force you to handle.
        Examples:
        *ArithmeticException
		*ArrayIndexOutOfBoundsException
		*NullPointerException
		*NumberFormatException
		*StringIndexOutOfBoundsException

		These are programmer mistakes, not external issues.
		*/
		
		
		
		
		//normal try,catch,finally code
		try {
		    int b = 10/0;  //it will try out the error inside the try block
		    System.out.println(b);
		} 
		catch (ArithmeticException err) {   //should explain what type of error group that the code inside the try block comes under
			//"e" is a user-defined name we can give whatever we want
			System.out.println(err.getMessage());     //only message
			System.out.println(err.toString());       //error type+message
			err.printStackTrace();                    //full error report
			
		}

		finally {
			System.out.println("This will get printed defaultly");
		}
		
		
		
		
		//types of exception and their order of presenting
		try {
			//arithmetic exception
			int a = 100/0;  
			System.out.println(a);
		}
		
		 catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: " + e);
	        }
		
		
		
		
		try {
			//nullpointer exception
			String value = null;
			
		}
		
		 catch (NullPointerException e) {
	            System.out.println("NullPointerException: " + e);
	        }
		
		
		
		
		try {
			//arrayindexoutofbound  exception         //in this one try block and many catches the order matters the most
			int[] arr = {1,2,3,4,5};
			System.out.println(arr[8]);
		}
		
		 catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException: " + e);
	        }
		
		
		
		
		try {
			//numberformat exception
			int c = Integer.parseInt("abc");
			System.out.println(c);
		}
		

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e);
        }
		
		
		
		try {
			//StringIndexOutOfBoundsException
            String st = "Hi";
            System.out.println(st.charAt(10));
		}
		
		catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e);
        }
		
		
		
		
		try {
            //ClassCastException
            Object obj = "Hello";
            Integer x = (Integer) obj;
            System.out.println(x);
		}
		
		  catch (ClassCastException e) {
	            System.out.println("ClassCastException: " + e);
	        }
		
		
		
		
		try {
            //InputMismatchException
            Scanner sc = new Scanner("abc");
            int num = sc.nextInt();
            System.out.println(num);
            sc.close();
		}
		
		 catch (InputMismatchException e) {
	            System.out.println("InputMismatchException: " + e);
	        }
		
		
		
		
		try {
            //IllegalStateException
            Scanner sc2 = new Scanner(System.in);
            sc2.close();
            sc2.nextInt();
		}
		
		  catch (IllegalStateException e) {
	            System.out.println("IllegalStateException: " + e);
	        }
		
		
		
		// Exception handling is in correct order above    
		// from the least to the most the parent class(the general exception parent class)


		
		//If ur using single try and multi catch then the first catch which matches the exception will only get printed out first
        // Parent catch (MUST BE LAST)
		
		/*
        catch (Exception e) {      //can be normally used as a general exception
            System.out.println("General Exception: " + e);
        }
        */

		
		
		
		//Nested try–catch (try inside try) When one risky part is inside another risky part.
        try {
		    try {
		        int f = 10 / 0;
		        System.out.println(f);
		    }
		    catch (ArithmeticException e) {
		        System.out.println("Inner catch");
		    }
		}
		catch (Exception e) {
		    System.out.println("Outer catch");
		}

        
        
		
        
        //try inside a catch block You can write try inside catch also.
        try {
		    int i = 10 / 0;
		    System.out.println(i);
		}
		catch (ArithmeticException e) {
		    System.out.println("Error happened");

		    try {
		    	int k = Integer.parseInt("Gee");
		    	System.out.println(k);
		    }
		    catch (NumberFormatException ex) {
		        System.out.println("Second error handled");
		    }
		}

        
        
        
		//try inside a finally block
        try {
		    int d = 10 / 0;
		    System.out.println(d);
		}
		catch (ArithmeticException e) {
		    System.out.println("Handled");
		}
		finally {
		    try {
		        String s = null;

		    }
		    catch (Exception ex) {
		        System.out.println("Exception in finally handled");
		    }
		}
        

        
        //Multi catch
        try {
        	String word = null;
        	System.out.println(word.length());
        	
        }
		 
        catch(NullPointerException | ArithmeticException e) {
        	System.out.println("NullPointerException has occured");
        }
		
        
        
        
        //throw and throws concept 
        int age = 15;
        
        if (age<18) {
        	throw new ArithmeticException("Under Age category:Throws a custom error that stops the flow with an msg");
        }
        else {
        	System.out.println("Correct Age category");
        }
        
        
        
        //throws example
        static String examplethrows(String worrd) throws NullPointerException{
        	return worrd.length();
        }
        
        
        try {
        	examplethrows(null);
        }
        
        catch(NullPointerException e) {
        	System.out.println(e);
        }
        
		
		
		
		
		
	}

}
