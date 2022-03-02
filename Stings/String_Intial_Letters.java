package Stings;

import java.util.Scanner;

public class String_Intial_Letters {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Enter a name of 3 or more words:");
        String s = in.nextLine();
        String s1 =s.toLowerCase();
        int len = s.length();

        System.out.print(s.charAt(0) + " ");
        for (int i = 1; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                char ch2 = s.charAt(i + 1);
                System.out.print(ch2 + " ");
            }
        }
    }
}