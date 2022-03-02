package Stings;

import java.util.Scanner;

public class Strings_Demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int c=0, i;
		String s;
		System.out.println("enter the Strings");
		s=sc.nextLine();
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		
		for(i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				c++;
			}
		}
		System.out.println(ch+"character is present "+c+" times");

	}

}
