package myfirstjavaprgrm;

class fatherclass{
	String name ="Narasimma garu";
	int age = 69;
	String color = "Nigger";
	
	fatherclass(String n,int a,String c){
		name = n;
		age = a;
		color = c;
	}
	
	void display() {
		System.out.println("This method got called by Super keyword");
	}
	
}

class sonclass extends fatherclass{
	
	super(name,age){
		
	}
	
	void display_2() {
		System.out.println("This is a parent class variable"+super.color);
	    super.display();
	}
}




public class super_keyword {

	public static void main(String[] args) {
		
		sonclass child_obj_new = new sonclass("Sugumar",36); 
		child_obj_new.display_2();

	}

}
