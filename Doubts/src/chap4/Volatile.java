package chap4;
class PrintDemo {
   int i=20;int c=0;
   public void printCount() {
      try {
         for (i = i; i > 0; i--) {
            System.out.println("Selected number is: "  +Thread.currentThread().getName()+" "+ i );
//            c++; if(c==5)break;
         }
         Thread.sleep(1000);
      } catch (Exception e) {
         System.out.println("Thread has been interrupted.");
      }
   }
}

class ThreadDemoCount implements Runnable {
   private Thread thread;
   private String threadName;
   PrintDemo printDemo;

   ThreadDemoCount(String threadName, PrintDemo printDemo) {
      this.threadName = threadName;
      this.printDemo = printDemo;
   }
   
   public void run() {
      printDemo.printCount();
      System.out.println("Thread " +  threadName + " finishing.");
   }

   public void start () {
      System.out.println("Starting " +  threadName);
      if (thread == null) {
         thread = new Thread (this, threadName);
         thread.start ();
      }
   }
}

public class Volatile {
   public static void main(String args[]) {
      PrintDemo printDemo = new PrintDemo();
      ThreadDemoCount firstThread = new ThreadDemoCount("Thread 1", printDemo);
      ThreadDemoCount secondThread = new ThreadDemoCount("Thread 2", printDemo);
      try {
         firstThread.start();
         secondThread.start();
      } catch( Exception e) {
         System.out.println("Interrupted");
      }
   }
}