package Oops.Pgm;

public class DifferntBlocks {
	static{
		System.out.println("Static will execute before main");
	}
	{
		System.out.println("Normal Block before constructor on object Creation");
	}
	
	DifferntBlocks(){
		System.out.println("On object creation constructor will executes");
	}
	void display() {
		System.out.println("Display method");
	}

	public static void main(String[] args) {
	System.out.println("Main Method");
		
		DifferntBlocks ob=new DifferntBlocks();
		ob.display();

	}

}
