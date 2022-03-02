package Oops.Pgm;
class Addition{
	static int s;
	static int k;
	static int A;
	static {
		//static block is used to initialize static data
		s=9;
		k=10;
	}
	static void add() {
		//static method can access only static data
		//static method belongs to class
		A=s+k;
		System.out.println("sum="+A);
	}
	
	
}

public class Static_Main_Method {

	public static void main(String[] args) {
		//static variables and methods can be accessed with reference to class
		 //Object creation is not required
		//static information belongs to class
		Addition.add(); //static method
	}

}
