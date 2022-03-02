package Oops.Pgm;
class Threadrunable implements Runnable{
	 public void run() {
		 for(int i=1;i<=2;i++) {
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

public class Thread_Runnable {

	public static void main(String[] args) throws InterruptedException {
		Threadrunable ob=new Threadrunable();
	    Thread tob=new Thread(ob);
	    Threadrunable ob1=new Threadrunable();
	    Thread tob1=new Thread(ob1);
		System.out.println("Thread class");
	    tob.setName("AKASH");
	    tob1.setName("AA");
	    tob.setPriority(1);
	    tob.start();
	    tob.join();
	    tob1.setPriority(2);
	    tob1.start();
	}
}
