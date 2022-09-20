package chap4;
class Counter extends Thread {
	static int i=0;
	//method where the thread execution will start
	public void run(){
	    //logic to execute in a thread
		while (true) {
	        increment();
	    }
	}

	public  synchronized void increment()  {//static cannot call wait inside static since wait is nonstatic
	    try {System.out.println(" i = "+i);
	        System.out.println(this.getName() + " " +  i++ +"  b4 wait ");
	        wait(3000);
	        System.out.println(this.getName() + " " +  i +"  aftr wait b4 notify ");
	        notify();
	        System.out.println(this.getName() + " " +  i +"  aftr notify ");
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	//let’s see how to start the threads
	public static void main(String[] args){
	    Counter c1 = new Counter();
	    Counter c2 = new Counter();
	    c1.setName("C1");
	   c2.setName("C2");
	    c1.start();
	    c2.start();
	}
	}
