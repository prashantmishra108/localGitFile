package chap4;
public class World implements Runnable {
	boolean flag=true;  
	public synchronized void run() {
	    if(flag) {
	        try {
	            System.out.println("waiting "+Thread.currentThread().getName());
	            flag=false;
	            wait();
	            System.out.println("done");
	        } catch(InterruptedException e) 
	        { System.out.println(e); }
	    }
	    else {
	    	
	        System.out.println("other thread notify"+Thread.currentThread().getName());
	        notify(); int i=0;
	        while(i<999999999)i++;System.out.print(i); 
	        System.out.println("notified");
	    }
	  }
/*
 * The awakened thread will not be able to proceed until the current thread relinquishes the
 *  lock on this object. The awakened thread will compete in the usual manner with any other 
 *  threads that might be actively competing to synchronize on this object; for example, the 
 *  awakened 
 * thread enjoys no reliable privilege or disadvantage in being the next thread to lock this object. 	
 */
	  public static void main(String []args){
	    System.out.println("Hello World");
	    World w = new World();
   /*Thread t1 = new Thread(w, "F");
	    Thread t2 = new Thread(w,"F");*/
	    Thread t1 = new Thread(w);
	    Thread t2 = new Thread(w);
	    t1.start();
	    t2.start();
	  }
	} 
