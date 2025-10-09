package myfirstjavaprgrm;

public class encapsulation_getter_setter {
	private String name;
	private String password;
	
	//We cant access a private variable inside the class anywhere 
	
	
	public void setName(String n) {
		name = n;      //assign given value to a variable
	}
	
	public void setpassword(String p) {
		password = p;
	}

	public String getName() {
		return name;
	}
	
	public String getpassword() {
		return password;
	}
	
	
	public static void main(String[] args) {
		encapsulation_getter_setter new_obj = new encapsulation_getter_setter();
		new_obj.setName("Karthick");
		new_obj.setpassword("Gee");
		
		System.out.println("The name is "+new_obj.getName());
		System.out.println("The password is "+new_obj.getpassword());
	}

}
