package myfirstjavaprgrm;     




//constructors types

public class constructors {
	int speed; 
	String colour;      //instance variables only accessed by objects  and initialized by constructors
	String brand;
	int price;
	char model;
	int release;
	
	
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
		//method chaining
	}
	
	void show() {
		System.out.println("This method was called by \"THIS\" keyword");
	}
	
	public static void main(String[] args) {
		//new constructors();					//default constructors  //we can simply create objects like this, if you are not going to use it later
		//new constructors("Blue","Yamaha"); 	//parameterized constructors
		
		constructors my_object_0 = new constructors(); //default constructors calling thus constructor called automatically
		constructors my_object_1 = new constructors("Blue","Yamaha");    
		constructors my_object_2 = new constructors(2200,'Z',100);     //constructor called with parameter	
		constructors my_object_3 = new constructors(my_object_2);      //copies my_object_2 into my_object_3
		
		
		my_object_0.colour_and_brand();
		System.out.println("\n");
		my_object_1.colour_and_brand();    //both of the constructors are created with different parameters this is called constructors overloading
		System.out.println("\n");
		my_object_2.price_and_model_and_speed();
		System.out.println("\n");
		my_object_3.price_and_model_and_speed(); //copy constructors copied from my_object_2
		System.out.println("\n");
		
		
		
		
		
	}

}
