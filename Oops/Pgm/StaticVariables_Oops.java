package Oops.Pgm;

import java.util.Scanner;

class EmployeeName{
	int eid;
	String name;
	static String cname="JSW";
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter eid");
		eid=sc.nextInt();
	}
	void display() {
		System.out.println("Name="+name);
		System.out.println("Id="+eid);
		System.out.println("Company Name="+cname);
	}
	
}

public class StaticVariables_Oops {

	public static void main(String[] args) {
		System.out.println("Main method");
		EmployeeName eob[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Employees");
		int n=sc.nextInt();
		eob=new EmployeeName[n];
		for(int i=0;i<n;i++)
		{
		    eob[i]=new EmployeeName();
		    eob[i].accept();
		}
		System.out.println("Employee Details");
		for(int i=0;i<n;i++)
		{
			eob[i].display();
		}
		
		}

}
