package chap4;
//Java code for thread creation by extending 
//the Thread class 
class MultithreadingDemo extends Thread 
{ 
	public void run() 
	{ 
		try
		{  
		    //	if(Thread.currentThread().getId()>12)notify();
			// Displaying the thread that is running 
			System.out.println ("Thread " + 
				Thread.currentThread().getId() + 
				" is running");  //Thread.currentThread().wait(3000);
		    System.out.println ("2.Thread " + 
					Thread.currentThread().getId() + 
					" is running"); 
		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught "+e); 
		} 
	} 
} 
//Main Class 
public class MultiThread 
{ 
	public static void main(String[] args) 
	{ 
		int n = 8; // Number of threads 
		for (int i=0; i<8; i++) 
		{ 
			MultithreadingDemo object = new MultithreadingDemo(); 
			object.start(); 
		} 
	} 
} 
