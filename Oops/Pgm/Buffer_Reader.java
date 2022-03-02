package Oops.Pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class School{
	int sid;
	String name;
	float amount;
	
	void input() throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter the school id");
		sid=Integer.parseInt(br.readLine());
		System.out.println("Enter the School Name");
		name=br.readLine();
		System.out.println("Total School Fees");
		amount=Float.parseFloat(br.readLine());
	}
	void display() {
		System.out.println("School id "+sid);
		System.out.println("School name "+name);
		System.out.println("Total fees "+amount);
	}
}
public class Buffer_Reader {

	public static void main(String[] args) throws IOException{
		School ob=new School();
		ob.input();
		ob.display();
	}

}
