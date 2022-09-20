package chap4;

import java.lang.*;

public class ThreadAlive implements Runnable {

   public synchronized 
   void run() {
   try {
	wait(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
      Thread t = Thread.currentThread();
      // tests if this thread is alive
      System.out.println("status 1= " + t.isAlive());
   }

   public static void main(String args[]) throws Exception {

      Thread t = new Thread(new ThreadAlive());
      // this will call run() function
      t.start();
      // waits for this thread to die
      t.join();
      System.out.println("status before sleep= " + t.isAlive());
      t.sleep(5000);
      // tests if this thread is alive
      System.out.println("status 2= " + t.isAlive());
   }
} 