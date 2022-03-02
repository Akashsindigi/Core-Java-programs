package Oops.Pgm;
class MyThreadClass extends Thread{
	 public void run() {
		 for(int i=1;i<=2;i++) {
		 System.out.println("Thread run method "+Thread.currentThread());
		 }

         try {
       	  Thread.sleep(3000);
         }
         catch (InterruptedException e) {
 			e.printStackTrace();  
	 }
}
}

public class ThreadJoinMethod {

	public static void main(String[] args) throws InterruptedException {
		MyThreadClass ob=new MyThreadClass();
		MyThreadClass ob1=new MyThreadClass();
		System.out.println("Thread class");
		ob.setName("AKASH");
		ob1.setName("AA");
		ob.start();
        ob.join();
		ob1.start();
	}
}
