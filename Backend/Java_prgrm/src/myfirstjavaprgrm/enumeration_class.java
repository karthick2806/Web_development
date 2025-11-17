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
			System.out.println("The middle of the week "+this.name); //tells the current obj or enum const can use this for both monday and wednesday
		}
		
		
		
		
		
		
	}
}

public class enumeration_class {

	public static void main(String[] args) {
		
		sample_enum_class.days d = sample_enum_class.days.monday;  //if enum is inside any another class then it should be called with"." operator
		
		System.out.println(d);
        System.out.println(d.getnumber_of_the_week());
        
        //for the method
        sample_enum_class.days w = sample_enum_class.days.wednesday;
        
        w.show();
	}

}
