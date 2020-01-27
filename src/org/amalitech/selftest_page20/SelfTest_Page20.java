package org.amalitech.selftest_page20;

public class SelfTest_Page20 {

	public static void main(String [] args) {
		
	// SelfTest on page 20
		
	//Qstn (12) Give the declaration for two variables called feet and inches. Both variables are
	//of type int and both are to be initialized to zero in the declaration.
		
		int feet = 0;
		int inches = 0;
		
	//Qstn (13) Give the declaration for two variables called count and distance. count is of type
	//int and is initialized to zero. distance is of type double and is initialized to 1.5.
		
		int count = 0;
		double distance = 1.5;
		int time = 1;
		
	// Qstn (14) Write a Java assignment statement that will set the value of the variable distance
	//to the value of the variable time multiplied by 80. All variables are of type int.
	
	distance = time * 80;
	System.out.println(distance);
	
	// Qstn (15) Write a Java assignment statement that will set the value of the variable interest
	//to the value of the variable balance multiplied by the value of the variable rate. The variables are of type double.
		
		double balance = 0;
		double rate = 0;
		double interest;
		interest = balance * rate;
		 System.out.println(interest);
	// Qstn (16) What is the output produced by the following lines of program code?
		 
		 char a, b;
		 a = 'b';
		 System.out.println(a);
		 b = 'c';
		 System.out.println(b);
		 a = b;
		 System.out.println(a);
	
	int x = 1;
	int y = 200;
	int z = 2;
	int sum;
	sum = (x+y) * (y/z);
	System.out.println("The sum of the first 1 to 200 numbers is " +sum);
		 
	}
}
