package myfirstjavaprgrm;

class fatherclass{
	String name;
	int age;
	String color;
	
	fatherclass(String n,int a,String c){
		name = n;
		age = a;
		color = c;
	}
	
	fatherclass(){
		name ="Narasimma garu"; 
		age = 69;
		color ="Nigger";
	}
	
	void display() {
		System.out.println("This method got called by Super keyword");
	}
	
}

class sonclass extends fatherclass{
	
	
	sonclass(String n,int a,String c){   
	    super(n,a,c);
		System.out.println("The name of the child is "+name);
		System.out.println("The age of the child is "+age);
		System.out.println("The color of the child is "+color);
	}
	

	sonclass(){   
	    super();
		System.out.println("The name of the parent is "+name);
		System.out.println("The age of the parent is "+age);
		System.out.println("The color of the child is "+color);
	}
	
	
	
	void display_2() {
		System.out.println("This is a parent class variable "+super.color+" which got accessed by super variable");    //accessing parent class field(variable) here
	    super.display();    //accessing parent class methods
	}
}




public class super_keyword {

	public static void main(String[] args) {
		
		sonclass child_obj_new = new sonclass("Sugumar",36,"white"); 
		child_obj_new.display_2();
		System.out.println("\n");
		
		sonclass default_obj = new sonclass();   //to call the default constructor
		default_obj.display_2();
		System.out.println("\n");
		
		

	}

}
