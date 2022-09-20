package chap4;
public class TestThread  extends Thread implements Runnable 
	{ 
		public void run() 
		{ 
			System.out.printf("GFG "); System.out.println(Thread.activeCount());
		} 
		public static void main(String[] args) throws InterruptedException 
		{ 
			TestThread obj = new TestThread(); 
			obj.run();
			obj.run();
			//obj.start();
			obj.start(); 
		}
	} 
