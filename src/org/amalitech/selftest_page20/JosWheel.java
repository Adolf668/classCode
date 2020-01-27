package org.amalitech.selftest_page20;

import java.util.Scanner;

public class JosWheel {
public static void main(String[] args) {
	//Initializations
	boolean program_running_bool=false;
	String code_trigger_starter_str="start";
	String code_trigger_ender_str="end";
	
	re_run_kybd_inpt(code_trigger_starter_str);
}
	
	private static void re_run_kybd_inpt(String code_trigger_starter_str) {
		String code_trigger_ender_str="end";
	// TODO Auto-generated method stub
	
    boolean program_running_bool;

	Scanner kybd_inpt = new Scanner(System.in);
	String kybd_inpt_str = kybd_inpt.nextLine();
		
	
	if(kybd_inpt_str.
			equalsIgnoreCase(code_trigger_starter_str)) {
		program_running_bool=true;
		
		
		//int x=0;
		//int y=5;
		
	// 1. We need a trigger to start the code
	while(program_running_bool==true) {
		
		String userInput_str=kybd_inpt.nextLine();
		
		if(userInput_str.equals(code_trigger_ender_str)) {
			System.out.println("ending......");
			break;
			
		}

		System.out.println(userInput_str);
		
	
		
		
		//the immediate code above is the same as this very code below
		//while(program_running_bool) {
		
		//if(x<y) {
		//System.out.println("We are still in the while :"
				//+x
				//the best way to do the above is :
				//+Integer.toString(x));
		//x = x+1; //it can also be written as x++;
		}
		//x = x+1;
		//we needed to move the code above into the if(x<y){.....} code block
		
	
		
	
	} else {//the user entered the wrong start command
		
		System.out.println("please restart "+  " and enter start to run code");
		
		re_run_kybd_inpt(code_trigger_starter_str);
		
	}
		
	}

	}


