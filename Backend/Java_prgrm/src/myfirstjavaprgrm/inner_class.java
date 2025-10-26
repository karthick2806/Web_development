package myfirstjavaprgrm;


//non-static inside non-static
class non_static_outer_class {
	 private String name = "Gee";
	 
	 class non_static_inner_class {
		 void show() {
			 System.out.println("This is a Outer class variable "+name);
		 }
	 }
}


//static inside static



public class inner_class {
	public static void main(String[] args) {
		non_static_outer_class non_static_outer_class_obj = new non_static_outer_class(); //	creating obj for nonstatic outer class
		non_static_outer_class.non_static_inner_class non_static_inner_class_obj = non_static_outer_class_obj.new non_static_inner_class(); 
		non_static_inner_class_obj.show();
		
		
		
	}

}
