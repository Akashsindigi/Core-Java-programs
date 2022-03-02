package Oops.Pgm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Showroom{
	String name;
	double amount, cost, discount;
	long mnum;
	void showroom() {
		name="null";
		amount=0;
		cost=0;
		discount=0;
		 mnum=0;
	}
	void input() throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter the Costumer Name :");
		name=br.readLine();
		System.out.println("Enter the Cost of the product :");
		cost=Double.parseDouble(br.readLine());
		System.out.println("Enter the Mobile Number :");
		mnum=Long.parseLong(br.readLine());
	}
		void calculated() {
			if(cost<=10000) {
				 discount=(cost*5)/100;
				 System.out.println("Amount after discount is "+discount);
			}								
			else if (cost>=10001 && cost<=20000) {
				discount=(cost*10)/100;
				System.out.println("Amount after discount is "+discount);
			}
			else if(cost>=20001 && cost<=35000) {
				 discount=(cost*15)/100;
				 System.out.println("Amount after discount is "+discount);
			}
				else {
					 discount=(cost*20)/100;
					 System.out.println("Amount after discount is "+discount);
				}
			
			amount=cost-discount;
			
		}
		
	void display() {
		System.out.println("Costumer Name "+name);
		System.out.println("mobile number "+mnum);
		System.out.println("Cost of the Product "+cost);
		System.out.println("discount of the product "+discount);
		System.out.println("Total Amount to be Paid after Discount is "+amount+"rs");
	}
}

public class Shopping_Details {

	public static void main(String[] args) throws IOException {
		Showroom ob=new Showroom();
		ob.input();
		ob.calculated();
		ob.display();
	}
}