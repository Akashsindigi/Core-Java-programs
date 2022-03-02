package Stings;

import java.util.Scanner;

public class String_Occurrance_Word {

	public static void main(String[] args) {
	       String s;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the Scentances");
	       int i,c=0;
	       s=sc.nextLine();
	       String ch[]=s.split(" ");
	       System.out.println("Enter the Word to Search");
	       String w=sc.next();
	       for (i=0;i<ch.length;i++) {
	    	   if(ch[i].equals(w)) {
	    		   c++;
	    	   }
	       }
	       System.out.println("Occurance of Word "+c);

	}

}
