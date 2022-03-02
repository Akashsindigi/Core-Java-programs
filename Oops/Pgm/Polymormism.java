package Oops.Pgm;


class Overloading{
	void display() {
		System.out.println("Display with no argument");
	}
	
	void display(int i) {
		System.out.println("one arg of type integer");
	}
	void display(float i) {
		System.out.println("one arg of type float");
	}
	void display(double i) {
		System.out.println("one arg of type double");
	}
	void display(String i) {
		System.out.println("one arg of type String");
	}
	
	void display(int i, int j) {
		System.out.println("Two arg of type integer");
	}
	void display(int i, float j) {
		System.out.println("Two arg of type integer and float");
	}
	void display(float j,int i) {
		System.out.println("Two arg of type float and int");
	}
}


public class Polymormism {

	public static void main(String[] args) {
		Overloading ob = new Overloading();
		ob.display();
		ob.display(654.54); //void display(double i)
		ob.display(765.45f); //void display(float i
		ob.display(56); //void display(int i)
		ob.display(67, 87.2f); //void display(int i, float j)
		ob.display(67.6f, 87); //void display(float i, int j)
		
	}

}
