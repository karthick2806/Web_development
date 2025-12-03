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
		 
        catch(NullPointerException | ArithmeticException e) {    //order is must even in this also
        	System.out.println("NullPointerException has occured");
        }
		
        
        
        
        //throw and throws concept 
        int age = 15;
        
        if (age<18) {
        	//putting inside comments coz itll make the code stop
        	//throw new ArithmeticException("Under Age category:Throws a custom error that stops the flow with an msg");      //it is only once for a program
        }
        else {
        	System.out.println("Correct Age category");
        }
        
        
        
        //throws example
        class coz_we_cant_create_method_inside_main_method_so_this_class{
        	int examplethrows(String worrd) throws NullPointerException,ArithmeticException {    //but we cant use static method here inside main method b
        	return worrd.length();      //it doesnt have any hierarchy but u should not put general exception first like this "void test() throws Exception, IOException, SQLException {}"
        								//and doesnt allows & ,| operators
        	}
        }
        
        
        
        try {
        	coz_we_cant_create_method_inside_main_method_so_this_class  dummy_object = new coz_we_cant_create_method_inside_main_method_so_this_class();
        	dummy_object.examplethrows(null);
        }
        
        catch(NullPointerException e) {
        	System.out.println(e);
        }
        
		
		/*
        | Feature / Spec                           | **try**                                  | **catch**                     | **finally**              | **throw**                 | **throws**                                |
        | ---------------------------------------- | ---------------------------------------- | ----------------------------- | ------------------------ | ------------------------- | ----------------------------------------- |
        | **Purpose**                              | Hold risky code                          | Handle the thrown exception   | Always runs (cleanup)    | Manually throw exception  | Declare that method may throw exception   |
        | **Type**                                 | Block                                    | Block                         | Block                    | Keyword (action)          | Keyword (warning)                         |
        | **Where used?**                          | Inside method                            | After try block               | After try/catch          | Inside method body        | In method signature                       |
        | **Is it mandatory?**                     | No (but usually used with catch/finally) | No (try+finally possible)     | No                       | No                        | No                                        |
        | **Execution Time**                       | Runtime                                  | Runtime                       | Runtime                  | Runtime                   | Compile-time declaration                  |
        | **Stops Program?**                       | No                                       | No                            | No                       | Yes (until caught)        | No                                        |
        | **How many allowed?**                    | One try per structure                    | Multiple catch blocks allowed | Only one finally         | Only one throw at a time  | Many exceptions allowed (comma separated) |
        | **Syntax**                               | `try { }`                                | `catch(Exception e) { }`      | `finally { }`            | `throw new Exception();`  | `void m() throws A, B { }`                |
        | **Can contain code?**                    | Yes                                      | Yes                           | Yes                      | No (only throw statement) | No (only declaration)                     |
        | **Needs exception object?**              | No                                       | Yes (inside)                  | No                       | Yes                       | No                                        |
        | **Handles exception?**                   | No                                       | YES (primary handler)         | No                       | No                        | No (caller handles)                       |
        | **Creates exception?**                   | No                                       | No                            | No                       | YES                       | No                                        |
        | **Used for custom message?**             | No                                       | Yes                           | No                       | Yes                       | No                                        |
        | **Can throw multiple exceptions?**       | No                                       | No                            | No                       | No (only 1)               | Yes (multiple types)                      |
        | **Occurs even if exception not thrown?** | Yes (executes normally)                  | No                            | YES (always executes)    | No                        | Yes (still declared)                      |
        | **Common Use Cases**                     | Risky code                               | Error handling                | Cleanup                  | Validation failures       | Risky functions (file, DB, parsing)       |
        | **Relation to caller**                   | Internal                                 | Internal                      | Internal                 | Internal                  | External (caller must manage)             |
        | **Final effect on flow**                 | No effect                                | Handles & continues           | Always runs              | Stops flow                | No effect                                 |
        | **Used in overriding?**                  | No                                       | No                            | No                       | No                        | Yes (rules apply)                         |
        | **Order Rules**                          | try must come first                      | catch follows try             | finally after catch/try  | anywhere inside method    | only in method declaration                |
        | **Example**                              | `try { risky code }`                     | `catch(Exception e) { }`      | `finally { close file }` | `throw new A();`          | `void f() throws A { }`                   |
		*/
		
        
        
		
		
	}

}
