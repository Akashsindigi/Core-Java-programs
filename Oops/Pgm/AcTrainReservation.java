package Oops.Pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Railways{
	String name;
	String coach;
	Long mobno;
	String First_ac,Second_ac,Third_ac,Sleeper;
	int amount,total_amount,tickets;
	void accept() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter the name of Passanger :");
		name=br.readLine();
		System.out.println("Enter the Coach type :");
		System.out.println("1.First_ac");

		System.out.println("2.Second_ac");
		
		System.out.println("3.Third_ac");
		
		System.out.println("4.Sleeper");
		coach=br.readLine();
		
	
		System.out.println("Enter the Mobile Number :");
		mobno=Long.parseLong(br.readLine());
		System.out.println("Enter No of Tickets");
		tickets=Integer.parseInt(br.readLine());
	}
	void calculation() {
		System.out.println(coach);
		if(coach.equalsIgnoreCase("First_ac")) {
		
			amount=750;
		}
		else if(coach.equalsIgnoreCase("second_ac")) {
			amount=500;
		}
		else if(coach.equalsIgnoreCase("third_ac")){
			amount=250;
		}
		else {
		amount=0;
	}
	
}
	void update() {
		System.out.println(amount);
		System.out.println("Name of Passanger:- "+name);
		System.out.println("Enter the coach Type:- "+coach);
		
		System.out.println(" Mobile Number:- "+mobno);
		System.out.println("Number of tickets:- "+tickets);
		System.out.println("Total amount need to pay for "+tickets+" is "+(amount*tickets)+" Rupees");
	}
		
	}
public class AcTrainReservation {

	public static void main(String[] args) throws IOException {
		Railways is=new Railways();
		is.accept();
		is.calculation();
		is.update();
		
	}

}
