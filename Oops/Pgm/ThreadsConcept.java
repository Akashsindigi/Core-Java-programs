package Oops.Pgm;
class Threads  extends Thread{
	//override the run method
	public void run() {
		System.out.println("Inside run Method "+Thread.currentThread());
		System.out.println("Inside run Method "+Thread.currentThread());
	}
}

public class ThreadsConcept {

	public static void main(String[] args) {
		Threads ob=new Threads();
		Threads ob1=new Threads();	
		
		System.out.println("Main JVM Thread "+Thread.currentThread());
		System.out.println("Thread-0 "+ob.isAlive());
		System.out.println("Thread-1 "+ob1.isAlive());
		ob.start(); 
		ob1.start();
		System.out.println("Thread-0 "+ob.isAlive());
		System.out.println("Thread-1 "+ob1.isAlive());
		
	}

}
