package chap4;

public class TestRuntimeError implements Runnable { 
	    public void run() 
	    { 
	        System.out.printf("GFG "); 
	    } 
	    public static void main(String[] args) throws InterruptedException 
	    { 
	        Thread thread1 = new Thread(new TestRuntimeError()); 
	        Thread thread2 = new Thread(new TestRuntimeError()); 
	        System.out.println("1");
	        thread1.setPriority(1);
	        thread2.setPriority(1);
	        thread1.start(); 
	        thread2.start(); 
	      //  System.out.println(thread1.getState()); 
	    } 
	}