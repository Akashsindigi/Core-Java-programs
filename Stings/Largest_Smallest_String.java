package Stings;

import java.util.Scanner;

public class Largest_Smallest_String {

	public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
	       System.out.println("Enter a word or sentence:");
	       String s = in.nextLine();
	       String s1=s.toLowerCase();
	       
	       s += " "; 
	       String word = "", lWord = "";
	       int len = s.length();
	       
	       for (int i = 0; i < len; i++) {
	           char ch = s.charAt(i);
	           if (ch == ' ') {
	               
	                if (word.length() > lWord.length())
	                    lWord = word;
	                    
	                word = "";
	           }
	           else {
	               word += ch;
	           }
	       }
	       
	       System.out.println("The longest word: " + lWord +
	        ": The length of the word: " + lWord.length());
	    }
	    
	} 