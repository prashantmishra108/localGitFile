package best;
	public class TestThread implements Runnable
	{
	    public void run()
	    {
	    	 synchronized (this) {
	    		 try {
	    			 //Thread.sleep(10000);
	    			wait(5000);
	    		 System.out.printf("%d",3);
	    			
	       	Thread.sleep(1);System.out.print("4");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        
        }
		
	    }
	    public static void main(String[] args) throws InterruptedException
	    {
	        Thread thread = new Thread(new TestThread());
	        thread.start();
	        System.out.printf("%d",1);
	       // thread.join();
	        System.out.printf("%d",2);
	    }
	 /*
	    Thread thread = new Thread(new TestThread());
        thread.run();
        System.out.printf("%d",1);
        thread.join();
        System.out.printf("%d",2);
        gives output as 3412 
        with thread.start in place of threAD.RUN WE GET 1342, 
        
        */
	}