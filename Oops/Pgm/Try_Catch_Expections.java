package Oops.Pgm;

public class Try_Catch_Expections {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("before division");
		try {
		c=a/b;
		}
		catch (ArithmeticException ex) {
			ex.printStackTrace();
		
		}
		System.out.println("after division");
		

	}

}
