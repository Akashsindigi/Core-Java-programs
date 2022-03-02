package Oops.Pgm;

import java.util.Scanner;

class BankBalance extends Exception{
    BankBalance(String s){
		super(s);
		}
	}

	class hdfc{
		int balance = 20000;
		void deposit(int damt) 
		{
			 balance = balance + damt;
			System.out.println("The Total Updated balance is "+balance);
		}
		void withdraw(int amt) {
			
		    
			try {
			if(amt>balance) {
				throw new BankBalance ("Insufficient Balance");
			}
			else {
				balance = balance - amt;
				System.out.println("Total balance is " +balance);
			}
		  }
		catch(BankBalance e) {
	        	e.printStackTrace();
	}
	}
		public void chkBalance() {
			System.out.println("your balance is "+balance);
		}
	}
public class Banking_Oops {

	public static void main(String[] args) {
		hdfc HDFC=new hdfc();
		int amt;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("*****MENU********");
			System.out.println("Enter your choice");
			System.out.println("1.Deposit");
			System.out.println("2.withdraw");
			System.out.println("3.Display Balance");
			System.out.println("4.To Exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter amount to deposit");
			       amt=sc.nextInt(); 
			       HDFC.deposit(amt);
			       break;
			case 2:System.out.println("Enter amount to withdraw");
		       amt=sc.nextInt(); 
		       HDFC.withdraw(amt); 
		       break;
			case 3:HDFC.chkBalance();
			     break;
			case 4:System.exit(0);
			
			}
		}
	}
}


