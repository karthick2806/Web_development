package myfirstjavaprgrm;

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
			
			//nullpointer exception
			String null_value = null;
			
			//arrayindexoutofbound  exception
			int[] arr = {1,2,3,4,5};
			System.out.println(arr[8]);
			
			//numberformat exception
			int c = Integer.parseInt("abc");
			
		}
		
		 
		
		
		
		
		
		
	}

}
