package Stings;

import java.util.Scanner;

public class Buffer_Pgm {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		s=sc.nextLine();
		String s1=s.toLowerCase();
		   StringBuffer s2=new StringBuffer(s1);
		
		    for(int i=0; i<s2.length(); i++	) {
		    	char ch=s2.charAt(i);
		    	if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		    		s2.deleteCharAt(i);
		    		
		    	}
		    }
               System.out.println("After removing vowel= "+s2);
	}

}
