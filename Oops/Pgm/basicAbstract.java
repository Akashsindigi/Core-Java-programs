package Oops.Pgm;
abstract class animal{
	abstract void walk(); 
}
class Horse extends animal{
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}
class dog extends animal{
	public void walk() {
		System.out.println("walks on 4 legs");
		System.out.println("dog barks");
	}
}
public class basicAbstract {

	public static void main(String[] args) {
		Horse horse =new Horse();
		dog d=new dog();
		horse.walk();
		d.walk();
	}

}
