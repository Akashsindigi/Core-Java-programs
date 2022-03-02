package Oops.Pgm;

import java.util.Scanner;

public class New {
	String name;
	int sid;
	float fees;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name ");
		name=sc.nextLine();
		System.out.println("Enter a sid");
		sid=sc.nextInt();
		System.out.println("Enter a fees");
		fees=sc.nextFloat();
	}
	void display() {
		System.out.println("name= "+name);
		System.out.println("sid "+sid);
		System.out.println("fees "+fees);
		
	}public static void main(String[] args) {
		Student sob=new Student();
		sob.input();
		sob.display();
		Employee sob1=new Employee();
		sob1.input();
		sob1.display();
		
		
	}
}
class Employee{
	String name;
	int age;
	float salary;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		name=sc.nextLine();
		System.out.println("Employee Salary");
		salary=sc.nextFloat();
		System.out.println("enter age");
		age=sc.nextInt();
		
	}
	void display() {
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("salary "+salary);
}
}