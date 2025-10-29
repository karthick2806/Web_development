package myfirstjavaprgrm;


//non-static inside non-static
class non_static_outer_class {
	 private String name = "Gee";
	 class non_static_inner_class {
		 void show() {	 
			 System.out.println("This is a static inside static "+name);
		 }
	 }
}



//static inside static
class template_outer_class {
	static class outerstatic{
		static class innerstatic{
			void show_2() {
				System.out.println("This is a static inside static using a outerclass template");
			}
		}
	}
}



//static inside non-static
class non_static_outer{
	static int static_var = 28;
	static class inner_static{
		void show_3() {
			System.out.println("This is a static inside non-static "+static_var);
		}
	}
}



//non-static inside static cant compile


//local inner class
class local_outer_class{
	void show_4() {
		String local_var = "Gee";
		
		class local_inner_class{
			void show_5() {
				System.out.println("This is a local inner class "+local_var);
			}
		
		}
		new local_inner_class().show_5();  //shorthand for object creation and method call
											//object creation should be inside of the method
	}
}



//anonymous inner class
interface anonymous_inner_class{
	void show_6();
}




public class inner_class {
	public static void main(String[] args) {
		//
		non_static_outer_class non_static_outer_class_obj = new non_static_outer_class(); //	creating obj for nonstatic outer class
		non_static_outer_class.non_static_inner_class obj_1 = non_static_outer_class_obj.new non_static_inner_class(); 
		obj_1.show();
		
		
		//
		template_outer_class.outerstatic.innerstatic obj_2 = new template_outer_class.outerstatic.innerstatic();
		obj_2.show_2();

		
		//
		non_static_outer.inner_static obj_3 = new non_static_outer.inner_static(); 
		obj_3.show_3();

		
		//
		new local_outer_class().show_4();    //shorthand for object creation but this is a temporary object   
		
		
		//
		new anonymous_inner_class() {
			public void show_6() {
				System.out.println("This is a anonymous inner class ");
			}
		}.show_6();
		
		
	}



}

