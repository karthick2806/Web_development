package myfirstjavaprgrm;


class parent{
	void display_parent(){
		System.out.println("This is a parent class");
	}
}


class child extends parent{    //single inheritance (parent->child)
	void display_child() {
		System.out.println("This is a child class");
	}
	
}


class child_oda_child extends child{    //multi-level inheritance  (parent->child->child_oda_child)
	void display_child_oda_child() {
		System.out.println("This is a child's child class");
	}
}


class male_child extends child_oda_child{  //hierarchical inheritance (child_oda_child)
	void display_male_child() {									//		     ^					
		System.out.println("This is a male child class");		// 1.(male     
	}															//	  child)   
}


class female_child extends child_oda_child{
	void display_female_child() {								//2.(female
		System.out.println("This is a female child class");     //   child)
	}
}



interface parent_1 {                 //multiple inheritance (inverted hierarchical)->single child is inherited from 2 parents 
	void display_parent_1();	     //Java does not allow multiple inheritance using classes
}							         //but it does allow it using interfaces.


interface parent_2 {
    void display_parent_2();
}


class child_from_two_parents implements parent_1, parent_2 {
    public void display_parent_1() {
        System.out.println("This is parent_1 method");
    }
    public void display_parent_2() {
        System.out.println("This is parent_2 method");
    }
}




public class inheritance_types {
	public static void main(String[] args) {
		child child_object = new child();
		child_object.display_parent();
	    child_object.display_child();    //with the child class object we can call parent class methods also
	                            //like this
	    
	    
	    System.out.println("\n");
	    child_oda_child  child_oda_child_object = new child_oda_child();
	    child_oda_child_object.display_parent();
	    child_oda_child_object.display_child();
	    child_oda_child_object.display_child_oda_child();
	    
	    
	    
	    System.out.println("\n");
	    female_child female_child_object = new female_child();
	    male_child male_child_object = new male_child();
	    female_child_object.display_child_oda_child();
	    male_child_object.display_child_oda_child();
	    
	    
	    
	    System.out.println("\n");
	    child_from_two_parents  child_from_two_parents_object = new  child_from_two_parents();
	    child_from_two_parents_object.display_parent_1();
	    child_from_two_parents_object.display_parent_2();
	    
	   
	}

}
