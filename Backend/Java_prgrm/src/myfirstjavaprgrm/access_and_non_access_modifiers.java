package myfirstjavaprgrm;

/* 
 * Non-Access Modifiers - do not control access level, but provides other functionality
 * Access Modifiers - controls the access level
 */


//non_access_modifier
abstract class animal{                          //abstract class
	abstract void sound(String noise);          //abstract method
}

class lion extends animal{                      //child class extends from parent animal class         
	void sound(String bark) {
		System.out.println("The dog goes like "+bark);
	}
	
}







//access_modifier
public class access_and_non_access_modifiers {
	public int publicVar = 10;          // accessible everywhere
    protected int protectedVar = 20;    // accessible in package + subclass
    int defaultVar = 30;                // default: package only
    private int privateVar = 40;        // accessible only in this class

    
    
	
	
	
public static void main(String[] args) {
		
		
		lion lion_object = new lion();
		lion_object.sound("Grrrrr");
		access_and_non_access_modifiers obj = new access_and_non_access_modifiers();
		System.out.println("Public Var: " + obj.publicVar);
	    System.out.println("Protected Var: " + obj.protectedVar);
	    System.out.println("Default Var: " + obj.defaultVar);
	    System.out.println("Private Var: " + obj.privateVar);

		
		//access and non access uses
		
		
/*		
		
| 🔢 Type         | 🧩 Modifier              |  🏗️ Can Be Used On                    | 💬 Meaning / Function                              | 🧠 Example                    |
| -------------- | ------------------------ | ------------------------------------ | -------------------------------------------------- | ----------------------------- |
| **ACCESS**     | **public**               | class, method, variable, constructor | Accessible from **anywhere**                       | `public int x = 10;`          |
|                | **protected**            | method, variable, constructor        | Accessible in **same package + subclasses**        | `protected void display() {}` |
|                | *(default)* (no keyword) | class, method, variable, constructor | Accessible only **within the same package**        | `int age = 20;`               |
|                | **private**              | method, variable, constructor        | Accessible **only within the same class**          | `private void show() {}`      |
| **NON-ACCESS** | **static**               | variable, method, inner class        | Belongs to **class**, not objects                  | `static int count;`           |
|                | **final**                | class, method, variable              | **Cannot be changed or overridden**                | `final int MAX = 100;`        |
|                | **abstract**             | class, method                        | **Must be implemented** by subclasses              | `abstract void run();`        |
|                | **synchronized**         | method, block                        | Allows **one thread at a time**                    | `synchronized void print(){}` |
|                | **transient**            | variable                             | Not saved during **serialization**                 | `transient int temp;`         |
|                | **volatile**             | variable                             | Value may change by **other threads**              | `volatile boolean flag;`      |
|                | **native**               | method                               | Method implemented in **another language (C/C++)** | `native void printHello();`   |
|                | **strictfp**             | class, method                        | Ensures **consistent floating-point results**      | `strictfp class Calc {}`      |

*/
		
		
	}

}
