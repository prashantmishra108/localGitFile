package chap4;

import java.lang.*;

class adminThread extends Thread {

	adminThread() {
      setDaemon(true);
   }

   public void run() {
      boolean d = isDaemon();
      System.out.println("isDaemon = " + d);
   }
}

public class ThreadDemo {

  public static void main(String[] args) throws Exception {
    
    Thread thread = new Thread();
    
    System.out.println("thread = " + Thread.currentThread());
    Thread t = Thread.currentThread();
    // prints the thread name
 // change the thread name
    t.setName("Admin Thread");
    System.out.println("Thread = " + t);
    thread.setDaemon(true);
   
    // this will call run() method
    thread.start();
    thread.start();
  }
}