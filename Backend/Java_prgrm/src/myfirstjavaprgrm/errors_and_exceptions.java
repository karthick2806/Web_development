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
		
		
		
		 
		
		
		
		
		
		
	}

}
