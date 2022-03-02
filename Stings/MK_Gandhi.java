package Stings;

import java.util.Scanner;

public class MK_Gandhi {

	public static void main(String[] args) {
	    String S="Mohandas Karamchand Gandhi";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 3 Words");
		String s=sc.nextLine();
		int sp=s.indexOf(' ');
		int lis=s.lastIndexOf(' ');
		String s1=s.charAt(0)+". "+s.charAt(sp+1)+". "+s.substring(lis+1);
		System.out.println(s1);

	}

}