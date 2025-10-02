package myfirstjavaprgrm;

public class java_classes {
	final int inside_class_value = 28;  //Belongs to an object of the class. Each object has its own copy of the variable.
	int inside_class_value_2 = 56;
	
	int inside_class_value_3 = 57;//can access all those variables in a single object
	int inside_class_value_4 = 58;
	int inside_class_value_5 = 59;
	int inside_class_value_6 = 60;
	
    
	//constructors will be defaultly created when object are created
	
	
	public static void main(String[] args) {
		java_classes myobj_1 = new java_classes(); //myobj_1 is a object here
		java_classes myobj_2 = new java_classes(); //multiple objects myobj_2 and 3 for a same inside class variable 2  
		java_classes myobj_3 = new java_classes();
		
		//myobj_1.inside_class_value = 6;   //this will give error coz of final keyword
		myobj_2.inside_class_value_2 = 6; //can modify attribute values
		
		
		System.out.println(myobj_1.inside_class_value+" cant be changed coz finaled");
		System.out.println(myobj_2.inside_class_value_2);
		System.out.println(myobj_3.inside_class_value_2); //can access multiple fields by multiple objects
		
		System.out.println(myobj_3.inside_class_value_3);  //You can specify as many attributes as you want
		System.out.println(myobj_3.inside_class_value_4);
		System.out.println(myobj_3.inside_class_value_5);
		System.out.println(myobj_3.inside_class_value_6);
		
		
		
		
		
		//why object creation is important
		
		/*
		1. Accessing instance variables & methods
		 

		We already discussed this:

		Instance variables and methods belong to the object.

		Each object can have its own copy of data.

		class Student {
		    String name;

		    void displayName() {
		        System.out.println(name);
		    }
		}

		Student s1 = new Student();
		s1.name = "Karthick";
		s1.displayName();  // Access instance method

		2. Representing real-world entities

		Objects let you model real-world things in code.

		Example: Car, Student, BankAccount, etc. Each object represents one entity with its own data.

		class Car {
		    String color;
		    int speed;
		}

		Car car1 = new Car(); // red car
		Car car2 = new Car(); // blue car

		3. Encapsulation & data hiding

		Objects encapsulate data (variables) and behavior (methods) together.

		You can hide internal data using private and give access via methods.

		class BankAccount {
		    private int balance;

		    void deposit(int amount) {
		        balance += amount;
		    }

		    int getBalance() {
		        return balance;
		    }
		}


		Each object stores its own balance, securely.

		4. Passing objects to methods

		Objects can be passed as parameters to methods, allowing data manipulation across methods.

		void printCarColor(Car c) {
		    System.out.println(c.color);
		}

		5. Polymorphism & dynamic behavior

		Objects enable polymorphism, i.e., same method name behaving differently depending on the object type.

		class Animal {
		    void sound() { System.out.println("Some sound"); }
		}
		class Dog extends Animal {
		    void sound() { System.out.println("Bark"); }
		}
		Animal a = new Dog();
		a.sound(); // Bark

		6. Collections of objects

		You can create arrays, lists, maps of objects to manage lots of data.

		Student[] students = new Student[3];
		students[0] = new Student();
		students[1] = new Student();


		💡 Summary:

		Objects are not just for accessing variables—they are used to:

		Store individual data.

		Model real-world entities.

		Encapsulate data & behavior.

		Pass complex data around methods.

		Enable polymorphism & inheritance.

		Manage collections of data.
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		

}
