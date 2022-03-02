package Oops.Pgm;

import java.util.Scanner;

class Atransport{
	String name;
	int charge, weight;
	void accept() {
	Scanner ip=new Scanner(System.in);
		System.out.println("Enter the Costumer Name :");
		name=ip.nextLine();
		System.out.println("Enter the Weight of the Parcel :");
		weight=ip.nextInt();
	}
		void calculated() {
			if(weight<=10) {
				 charge=weight*25;
		   System.out.println("charge of the parcel is "+charge);
			}								
			else if (weight>10 && weight<=30) {
				charge=10*25+(weight-10)*20;
				 System.out.println("charge of the parcel is "+charge);
			}
				else {
					 charge=10*25+20*20+(weight-30)*10;
					System.out.println("charge of the parcel is "+charge);
				}	
		}
		
	void display() {
		System.out.println("Name\tWeight\tBill Amount ");  
		System.out.println("--------------------------------------");
		System.out.println(name+"\t"+weight+"\t"+(charge+(charge*0.05)));

	}
public class Transportation_Pgm {

	public static void main(String[] args) {
		
		Atransport t=new Atransport();
		t.accept();
		t.calculated();
		t.display();

	}
}
}