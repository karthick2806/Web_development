package myfirstjavaprgrm;

import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name		:");    //println for the nextline
		String name = sc.nextLine();  //allows multiple words
		
		System.out.print("Education(CSE/IT/MECH)	:");  //next allows only one line
		String dept = sc.next();
		
		System.out.print("Age			:");  //int allows only integer
		int age = sc.nextInt();
		
		System.out.print("CGPA			:");  //allows only double
		double cgpa = sc.nextDouble();
		
		System.out.print("Percentage		:");  //allows only float
		float percentage = sc.nextFloat();
		
		System.out.print("No.of.fail    		:"); //allows large numbers as input
		long longnum = sc.nextLong();
		
		System.out.print("Single			:");
		boolean rel = sc.nextBoolean();      //allows only boolean
		
		
		/*
		After using nextInt(), nextDouble(), nextFloat(), nextLong(),
		ALWAYS write one extra nextLine() BEFORE your real nextLine().


		
		int n = sc.nextInt(); 
		sc.nextLine();          // dummy read to clear ENTER

		String name = sc.nextLine();  // real input

		
		If you switch from number input → String input,
        use one extra nextLine().
		
		
		*/
		
		
		
		sc.close();  //you've to close the scanner object after use 
		
		
		
		
		
	}

}
