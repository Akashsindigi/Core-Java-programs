package Stings;

import java.util.Scanner;

public class String_Of_Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       String ms="";
	       System.out.println("Enter the String");
	       String s=sc.nextLine().toLowerCase();
	       for(int i=0;i<s.length();i++) {
	    	   char ch=s.charAt(i);
	    	   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
	    		   continue;
	    	   }
	    	   else {
	    		   ms=ms+s.charAt(i);
	    	   }
	       }
	       System.out.println("After Removing Vowels "+ms);

	}

}
