package Oops.Pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	void chkException() {
		int a=10,b=2,c=0;
		int ar[]=new int[3];
		System.out.println("Before divison");
		try {
			c=a/b; //Run time Exception
			System.out.println("after a/b "+c);
		}
		catch(ArithmeticException ex) {
			System.out.println("Inside catch");
			ex.printStackTrace();
			//System.out.println(ex.getMessage());
			//System.out.println(ex);
		}
		finally {
			System.out.println("finally will executes always");
			System.out.println("finally block is used to close resource data base, network");
		}
		System.out.println("after catch");
		
	}
	public static void main(String[] args) throws IOException    {
		MainClass ob=new MainClass();
		ob.chkException();
		int a=10;
		//Checked exception
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name=br.readLine();
		System.out.println(name);
}

}
