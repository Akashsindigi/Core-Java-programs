package Oops.Pgm;

import java.util.Scanner;

public class Try_Throw {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);	
	        
	        System.out.println("Enter age");
	        int age=sc.nextInt();
	        try {
	        if(age<18) {
	        	throw new ArithmeticException("Not Eligible for voting");
	        }
	        }
	       catch(ArithmeticException e) {
	    	   e.printStackTrace();
	       }

		}

	}
