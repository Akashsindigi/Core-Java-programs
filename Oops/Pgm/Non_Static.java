package Oops.Pgm;
class Additions{
	static int s;
	static int k;
	static int A;
	int m,n,s1;
	void Addition(int p, int q){
		m=p;
		n=q;
	}
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
	void NonstaticAddition() {
		s1=m+n;
		System.out.println("sum="+s1);
	}
	
	
}
public class Non_Static {

	public static void main(String[] args) {
		Addition.add(); //static method
		
		}

	}

