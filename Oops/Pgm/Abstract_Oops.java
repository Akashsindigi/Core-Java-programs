package Oops.Pgm;
interface MyInterface{
	int k=10,j=2;
	void display();
	void add();
	int z=k+j;
}
	abstract class MyClass implements MyInterface{
		public void display() {
			System.out.println("the value of z is "+z);
		}
	}
	class SecondClass extends MyClass{
		public void add() {
			
			System.out.println("Add method");
		}
	}
	
public class Abstract_Oops {

	public static void main(String[] args) {
		SecondClass ob=new SecondClass();
		ob.add();
		ob.display();
	}

	}
