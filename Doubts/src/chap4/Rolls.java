package chap4;

public class Rolls {
	  public static void main(String args[]) {
	    synchronized(args) {
	        try {
	            wait();
	        } catch(InterruptedException e)
	        { System.out.println(e); }
	    }
	  }
	}