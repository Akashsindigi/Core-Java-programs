package Oops.Pgm;

import java.util.Scanner;
class Employees{
	String name,designation;
    int age, eid;
 
   
    void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the name");
    	name=sc.nextLine();
    	System.out.println("Enter the age");
    	age=sc.nextInt();
    	System.out.println("Enter the Eid");
    	eid=sc.nextInt();
    	System.out.println("Enter the Designation");
    	designation=sc.next();
    }
    void display() {
    	System.out.println("name "+name);
    	System.out.println("age "+age);
    	System.out.println("sid "+eid);
    	System.out.println("designation "+designation);
    	
    }
}
public class Oops_Employee_details {

	public static void main(String[] args) {
		System.out.println("main");
		Employees sob = new Employees();
		sob.input();
		sob.display();
		
		Employees sob1 = new Employees();
		sob1.input();
		sob1.display();
		
		Employees sob2 = new Employees();
		sob2.input();
		sob2.display();
		

	}

}