package myfirstjavaprgrm;

 //function definition must be inside of class
public class methods{	
	static void my_funct_or_method(String fname,int age){       //it is a funct with para or args passed  //
		/*🔹 Instance Method (Non-static)
		-->Belongs to the object.
		-->Needs an object to call.
		*/
		
        //string fname is a parameter here
		System.out.println("This is a block inside a function");
		System.out.println("And it says this\nHi "+fname+"\nYour age is "+age);
		//if function is defined by static then can simply call the function by function_name(); inside of pvsm
	}
	
	
	public void myPublicMethod(int lockdown) {
		/*🔹 Static Method
		-->Belongs to the class, not the object.
		-->Can be called without creating an object.
		*/
		
	    System.out.println("Public methods must be called by creating objects"+" and this is a method accessing with an object");
	    //return lockdown;   cant return coz void keyword
	}
	
	
	
	//Method overloading is here (return_function)
	//The compiler decides which method to call at compile-time — that’s why it’s called compile-time polymorphism.
	
	static int return_function(int jersey_no){         //function with a parameter passing
		return jersey_no;
	}
	
	static float return_function(float total) {    //static means belongs to the class
		return total/5;
	}
	
	
	
	/*Recursive function is the technique of making a function call itself
	 * This technique provides a way to break complicated problems down into simpler problems which are easier to solve.
	 */
	static int fact_orial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact_orial(n-1); //every time it calls the function it will lower the number n by one   
		}
	}
	
	
	
     void parentclass_oda_method(String name) {
		System.out.println("Parent class method is called");
	 }


}

//the same method parentclass_oda_method was called in child class its called 
//method overriding(when subclass and superclass has same method name,parameter,return type)
//The method call is resolved at runtime, based on the actual object type — that’s why it’s called runtime polymorphism.

class child_class extends methods {
	//@override  //just for understanding
	void parentclass_oda_method(String name){
		System.out.println("child class method is called by "+name);
	}
		
	
	
	
	
	/*
	| Feature         | Method Overloading       | Method Overriding          |
	| --------------- | ------------------------ | -------------------------- |
	| Timing          | Compile-time             | Runtime                    |
	| Parameters      | Must be different        | Must be same               |
	| Class           | Same class               | Parent-Child classes       |
	| Return Type     | Can be same or different | Must be same or covariant  |
	| Access Modifier | No restriction           | Cannot be more restrictive |
	*/
	
	
	
public static void main(String[] args) {  		//calling the function must be inside of psvm
		 my_funct_or_method("Karthik",22);   	//karthik is a argument here
		 //you should create objects to call a public method so
		 methods my_new_object = new methods();
		 my_new_object.myPublicMethod(144); //accessing method which returns a value
		 
		 									
		 System.out.println(return_function(28)); 
		 System.out.println(return_function(456.6f));//SHOULD DECLARE 456.78f or else it'll take it as double
		 //method overloading(compile-time polymorphism)-->
		 //multiple methods in the same class has same method name but has different types and no.of values or parameters
		 								
		 
		 System.out.println(fact_orial(5)); //recursive
		 
		 child_class override_obj = new child_class();
		 override_obj.parentclass_oda_method("method_overriding");

	}
	
}
