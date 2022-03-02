package Oops.Pgm;
class Threadss  extends Thread {
	//override the run method
	public void run() {
		System.out.println("Inside run Method "+Thread.currentThread());
		System.out.println("Inside run Method "+Thread.currentThread());
		for(int i=1;i<=3;i++) {
			System.out.println("Thread run method "+Thread.currentThread());
		}
              try {
            	  Thread.sleep(4000);
              }
              catch (InterruptedException e) {
      			e.printStackTrace();  
              }
}
}

public class Thread_Sleep_Method {

	public static void main(String[] args) throws InterruptedException {
		Threadss ob=new Threadss();
		Threadss ob1=new Threadss();	
		
		System.out.println("Main JVM Thread "+Thread.currentThread());
		System.out.println("Thread-0 "+ob.isAlive());
		System.out.println("Thread-1 "+ob1.isAlive());
		ob.start(); 
		 System.out.println("Thread-0 "+ob.isAlive());
		ob.join();
		ob1.start();
		System.out.println("Thread-1 "+ob1.isAlive());
		
	}

}
