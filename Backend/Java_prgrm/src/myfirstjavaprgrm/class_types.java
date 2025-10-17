package myfirstjavaprgrm;



/*Concrete class
The normal class you create in Java.
It can be instantiated (objects can be created).
It can have fields, methods, and constructors.
 */
class car{
	public void drive() {
		System.out.println("This is a Concrete class");  							
	}
}



/*Abstract class
Declared using the abstract keyword.
Cannot be instantiated directly.
Can have abstract methods (without body) and normal methods (with body).
Used when you want to define a common template for subclasses.
*/
abstract class abstract_class{
	abstract void abstract_method();	
	}

class child_abstract_class extends abstract_class{
	void abstract_method() {     //that method should be defined here in the child class
		System.out.println("This is a Abstract class");                			
	}
}



/*final class
Declared using the final keyword.
Cannot be extended (inherited) by other classes.
Used to prevent modification or inheritance.
*/
final class final_class{   //cant inherit this class furthermore
	public void final_class_method() {
		System.out.println("This is a Final class");
	}
	
}




/*
A POJO (Plain Old Java Object) is just a simple Java class that holds data.
It doesn’t extend or implement any framework-specific classes or interfaces.
It’s mainly used for storing and transferring data — just like a container or model class.
Simple class with fields, constructors, getters, and setters only.
it is Used in frameworks like Spring, Hibernate, etc.
*/
class pojo{
	
	private String name;
    private int age;
    
    
    pojo(String name){
    	this.name = name;
  
    	System.out.println("This is a Pojo class");
    }
    
    public String getname() {
    	return name;
    }
    
    public int getage() {
    	return age;
    }
	
    public void setage(int age) {
    	this.age = age;
    }
    
    
}




/*Anonymous class
An Anonymous class is a class without a name.
It’s usually created at the point where you need it, mostly for:
Overriding a method quickly
Implementing abstract classes or interfaces in a single use case
 */
abstract class anonymous_class{
	abstract void anonymous_method();
}




public class class_types {
	public static void main(String[] args) {
		car car_obj = new car();	
		car_obj.drive();
		
		System.out.println("\n");
		child_abstract_class child_abstract_class_obj = new child_abstract_class();
		child_abstract_class_obj.abstract_method();
		
		
		
		System.out.println("\n");
		final_class final_object = new final_class();
		final_object.final_class_method();
		
		
		
		System.out.println("\n");
		pojo pojo_obj = new pojo("Sugumar"); 
		//System.out.println(pojo_obj.getname());
		pojo_obj.setage(69);
		//System.out.println(pojo_obj.getage());
		
		
		
																		
		System.out.println("\n");										//	Normally, you can’t create an object for an abstract class.
		anonymous_class anonymous_obj = new anonymous_class() {			//	But here, you’re doing something special:
			void anonymous_method() {									//	You’re creating an object + class definition at the same time!
				System.out.println("This is a Anonymous class");
			}
		};
		anonymous_obj.anonymous_method();
		
	}
}





/*
| 🔢 **Type of Class**                | 🧱 **Can Create Object?** | 🧬 **Can Be Inherited (Extended)?** | ⚙️ **Keyword Used** | 📚 **Main Purpose**                                           | 💡 **Special Notes**                               | 🗣️ **Tamil Meaning (சுருக்கம்)**                                  |
| ----------------------------------- | ------------------------- | ----------------------------------- | ------------------- | ------------------------------------------------------------- | -------------------------------------------------- | ------------------------------------------------------------------ |
| **Concrete Class**                  | ✅ Yes                     | ✅ Yes                               | *(None)*            | Used for normal implementation of logic                       | Most commonly used class                           | சாதாரணமாக logic எழுதும் வகுப்பு                                    |
| **Abstract Class**                  | ❌ No                      | ✅ Yes                               | `abstract`          | Defines a common template for subclasses                      | Can have both abstract and normal methods          | நேரடியாக object உருவாக்க முடியாது; subclass-ல் பயன்படுத்த வேண்டும் |
| **Final Class**                     | ✅ Yes                     | ❌ No                                | `final`             | To prevent inheritance/modification                           | Can have static or normal variables                | subclass உருவாக்க முடியாது; ஆனால் object உருவாக்கலாம்              |
| **Static Nested Class**             | ✅ Yes                     | ✅ Yes                               | `static`            | Grouping logically related classes together                   | Access without outer class object                  | outer class object இல்லாமலே inner class அழைக்கலாம்                 |
| **Inner (Non-static Nested) Class** | ✅ Yes                     | ✅ Yes                               | *(None)*            | To access outer class members closely                         | Needs outer class object                           | outer class-இன் object மூலம்தான் access செய்யலாம்                  |
| **Anonymous Class**                 | ✅ Yes                     | ❌ No                                | *(No name)*         | For one-time use; override abstract/interface methods quickly | Created inline; no class name                      | பெயரில்லா class; ஒரே முறை override பண்ணி பயன்படுத்தப்படும்         |
| **POJO Class**                      | ✅ Yes                     | ✅ Yes                               | *(None)*            | To store and manage data (models/entities)                    | Only has variables, constructors, getters, setters | data வை வைத்துக்கொள்ள பயன்படும் சுலபமான வகுப்பு                    |


 */


