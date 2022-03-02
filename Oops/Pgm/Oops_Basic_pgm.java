package Oops.Pgm;

import java.util.Scanner;

class Student{
	String name;
    int age, sid;
    float fees;
    
    void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the name");
    	name=sc.nextLine();
    	System.out.println("Enter the age");
    	age=sc.nextInt();
    	System.out.println("Enter the sid");
    	sid=sc.nextInt();
    	System.out.println("Enter the fees");
    	fees=sc.nextFloat();
    }
    void display() {
    	System.out.println("name "+name);
    	System.out.println("age "+age);
    	System.out.println("sid "+sid);
    	System.out.println("fees "+fees);
    	
    }
}
public class Oops_Basic_pgm {

	public static void main(String[] args) {
		System.out.println("main");
	Student s[] = new Student[3];
	for(int i=0;i<s.length;i++) {
		s[i]=new Student();
	}
		for(int i=0;i<s.length;i++) {
			s[i].input();
		}
		System.out.println("Student Details");
		for(int i=0;i<s.length;i++) {
			s[i].display();
		
	}
		

	}

}
