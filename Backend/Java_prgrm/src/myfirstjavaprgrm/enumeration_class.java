package myfirstjavaprgrm;

//An enum (short for enumeration) is a special data type that represents a fixed set of constants — like days of the week, directions, levels, states, etc.

class sample_enum_class{
	enum days{
		
		//enum constants
		monday(1),  
		tuesday(2),
		wednesday(3),
		thursday(4),
		friday(5),
		saturday(6),
		sunday(7);
		
		/*
		 *enum constants are public → accessible everywhere
          static → no need to create object
          final → cannot change or reassign
		 */
		
		
		//enum field
		private int number_of_the_week; // If number_of_the_week were public, others could modify the constant’s data → which defeats the purpose of constants.So Java developers keep enum fields private.
		
		
		
		//enum constructor
		days(int number_of_the_week){
			this.number_of_the_week = number_of_the_week;
		}
		
		
		public int getnumber_of_the_week() {
			return number_of_the_week;     //using getter for accessing the private variable
		}
		
		
		//enum with a method
		public void show() {
			System.out.println("The middle of the week "+this.name()); //tells the current obj or enum const can use this for both monday and wednesday
		}
	}
}



//enum which is not inside the class and with abstract method
enum operation{
	add{public int apply(int a,int b) {return a+b;}},          //each constants of enum acts like a subclass
	sub{public int apply(int a,int b) {return a-b;}};  //declaration here
	
	
	public abstract int apply(int a,int b);   //just abstract method body here
}


//enum with interface
interface enum_interface{
	void print();
}

enum primary implements enum_interface{
	RED,
	GREEN,
	BLUE;
	
	public void print() {
		System.out.println("One of the primary color is "+this.name());
	}
	
	
}





public class enumeration_class {

	public static void main(String[] args) {
		
		//for enum inside a class
		sample_enum_class.days d = sample_enum_class.days.monday;  //if enum is inside any another class then it should be called with"." operator
		
		System.out.println(d);
        System.out.println(d.getnumber_of_the_week());
        
        //for the method
        sample_enum_class.days w = sample_enum_class.days.wednesday;
        
        w.show();
        
        
        //for abstract method
        operation op_add = operation.add;
        operation op_sub = operation.sub;
        
        System.out.println(op_add.apply(6+2,18+2));           //newly tried idkwtf
        System.out.println(op_sub.apply(50-20,10-8));
        
        
        //for interface
        primary pr = primary.RED;
        pr.print();
        
        
        
        
	}

}
