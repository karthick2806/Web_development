package myfirstjavaprgrm;     


//constructors types,this keyword  types 

public class constructors {
	int speed; 
	String colour;      //instance variables only accessed by objects  and initialized by constructors
	String brand;
	int price;
	char model;
	int release;
	String engine_type;
	
	
	constructors(){    //default constructors that java will create automatically 
	    price = 333000;//just initializes the class variables
		brand = "Pulsar";
		colour = "Orange";
		model = 'Z';
		speed = 100;
		release = 2019;
	
	}
	
    constructors(String colour,String brand){ //parameterized constructors
    	
    	this.colour = colour;    //this keyword can be used where the instance and local variable has the same reference name 
    	this.brand = brand;
    	
	}
    
   
    constructors(int p,char m,int s){   //constructor overloading-->same constructor name-->with different attributes
        price = p;
    	model = m;
    	speed = s;
    	
    }
    
        
    constructors(constructors c){    //copy constructors copies from the above 
    	this(0);//constructor chaining calls the below function release
    	price = c.price;
     	model = c.model;
     	speed = c.speed;
     	
    }
    
    constructors(int r){
    	release = r;      //chained constructors
    }
    
    constructors(String e){
    	engine_type = e;      

    }
    
    
    void colour_and_brand() {
		System.out.println("The color of the bike is "+colour);
		System.out.println("The brand of the bike is "+brand);
	}
	
	void price_and_model_and_speed() {
		System.out.println("The price of the bike is "+price);
		System.out.println("The model of the bike is "+model);
		System.out.println("The speed of the bike is "+speed);	
	}
	
	void release() {
		System.out.println("The release  of  bike is "+release);
		this.show();     //this.show() calls another method below in the same class.
		
	}
	
	void show() {
		System.out.println("This method was called by \"THIS\" keyword");
	}
	
	
	
	constructors engine_model(String a) {
		System.out.println("The engine model of the bike is "+a);
		return this;      //this THIS keyword is also used in method chaining also
	}
	
	//both the above and below methods are chained
	
	constructors insurance_amt(int i) {
		System.out.println("The insurance amount of the bike is "+i);
		return this;      //this THIS keyword is also used in method chaining also
	}
	
	
	
	
	void rc_book(constructors rc) {
		System.out.println("The RC of the vehicle is valid upto "+release);
	}
	
	void passing_the_current_object_to_another_method () {
		rc_book(this);    //passing the current demo object to rc_book
		/*to pass your current object to another method or class so that the method knows exactly which obj is 
		 * being referred to
		 */
	}
	
	
	
	public static void main(String[] args) {
		//new constructors();					//default constructors  //we can simply create objects like this, if you are not going to use it later
		//new constructors("Blue","Yamaha"); 	//parameterized constructors
		
		constructors my_object_0 = new constructors(); //default constructors calling thus constructor called automatically
		constructors my_object_1 = new constructors("Blue","Yamaha");    
		constructors my_object_2 = new constructors(2200,'Z',100);     //constructor called with parameter	
		constructors my_object_3 = new constructors(my_object_2);      //copies my_object_2 into my_object_3
		constructors my_object_4 = new constructors(); 
		constructors my_object_5 = new constructors(); 
		
		
		
		
		
		
		my_object_0.colour_and_brand();
		System.out.println("\n");
		my_object_1.colour_and_brand();    //both of the constructors are created with different parameters this is called constructors overloading
		System.out.println("\n");
		my_object_2.price_and_model_and_speed();
		System.out.println("\n");
		my_object_3.price_and_model_and_speed(); //copy constructors copied from my_object_2
		System.out.println("\n");
		my_object_4.release();   //calls another method
		System.out.println("\n");
		my_object_5.engine_model("BS6").insurance_amt(100000);	//(Method Chaining)--> Some methods can return the object itself, so you can chain multiple method calls together. 
		System.out.println("\n");
		my_object_5.passing_the_current_object_to_another_method();  //to pass the current object to another method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 *THIS keyword types..
		| No | Use                           | Code Syntax     | Purpose                   |
		| -- | ----------------------------- | --------------- | ------------------------- |
		| 1  | To refer to instance variable | `this.variable` | Solve naming confusion    |
		| 2  | To call another method        | `this.method()` | Call method in same class |
		| 3  | To call another constructor   | `this(...)`     | Constructor chaining      |
		| 4  | To pass current object        | `method(this)`  | Send object as argument   |
		| 5  | To return current object      | `return this;`  | Enable method chaining    |
        */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
