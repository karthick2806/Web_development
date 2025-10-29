package myfirstjavaprgrm;


//Abstraction
abstract class parent_abstract_class{
	abstract void abstract_method();
	
	public void normal_method() {
		System.out.println("It is a normal method inside a abstract class");
		}
	}


class concrete_child_class extends parent_abstract_class {
	void abstract_method() {
		System.out.println("This is a Abstract method defined inside a abstract child class which is actually implemented abstractly in the abstract class");
		}
	}






//Interface
interface interface_1{              //An interface is a collection of abstract methods (and constants) 
	public void interface_method();		//that defines a set of rules or contracts a class must follow.
	
	default void default_method() {
		System.out.println("This is a default method inside a interface");
	}
	
	static void static_method() {
		System.out.println("This is a static method inside a interface");
	}
}


class normal_class implements interface_1{
	public void interface_method() {
		System.out.println("This is a abstract method definition outside of abstract method");
		
	}
	
}





public class abstraction_and_interfaces {

	public static void main(String[] args){
		new concrete_child_class().abstract_method();      //shorthand for object creation but this is a temporary object  
		new concrete_child_class().normal_method();
		
		
		new normal_class().interface_method();
		new normal_class().default_method();
		interface_1.static_method();    //static so no obj creation needed
		
	}

}






/*
| Feature                    | Abstract Class                                                      | Interface                                                                               |
| -------------------------- | ------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| **Keyword**                | `abstract class`                                                    | `interface`                                                                             |
| **Methods**                | Can have abstract and concrete methods                              | Before Java 8 → only abstract; after Java 8 → default, static, private methods possible |
| **Variables**              | Can have any type (instance, static, final, etc.)                   | Only `public static final` constants                                                    |
| **Access Modifiers**       | Can use any (private, protected, etc.)                              | Only public (methods/variables are public by default)                                   |
| **Constructors**           | ✅ Can have constructors                                            | ❌ Cannot have constructors                                                              |
| **Object Creation**        | ❌ Cannot create object                                             | ❌ Cannot create object                                                                  |
| **Inheritance Type**       | Single inheritance only                                             | Multiple inheritance supported                                                          |
| **Implements/Extends**     | Class extends abstract class                                        | Class implements interface                                                              |
| **When to Use**            | When classes share some behavior but need different implementations | When you want to define a contract that all implementing classes must follow            |
| **Performance**            | Slightly faster                                                     | Slightly slower (because of method resolution)                                          |
| **Java Version Evolution** | Exists since Java 1                                                 | Interface upgraded with Java 8 & 9 (default, static, private methods)                   |
| **Example**                | `abstract class Vehicle { void run(); }`                            | `interface Vehicle { void run(); }`                                                     |
*/













