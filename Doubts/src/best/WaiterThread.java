package best;

public class WaiterThread  implements Runnable{
	    
	    private WaiterMessage msg;
	    
	    public WaiterThread(WaiterMessage m){
	        this.msg=m;
	    }

	    @Override
	    public void run() {
	        String name = Thread.currentThread().getName();
	        synchronized (msg) {
	            try{
	            	System.out.println(" waiter class msg obj ="+msg);
	                System.out.println( name+" waiting to get notified at time:"+System.currentTimeMillis());
	                System.out.println(" before sleep");
	                Thread.sleep(5000);
	                System.out.println(" after sleep - wait sample");
	                wait(1000);//if i use this call wait , i will get exception- IllegalMonitorStateException -and next line will not get printed
	                //thread will not understand what to notify
	                System.out.println(" after sleep-calling wait");//see document below
	                msg.wait(10000);// this wait called from msg obj will release the lock and lead to calling of other thread-waitNotifier
	                System.out.println(" after wait");
	            }catch(InterruptedException e){
	                e.printStackTrace();
	            }
	            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
	            //process the WaiterMessage now
	            System.out.println(name+" processed: "+msg.getMsg());
	        }
	    }
	}
/*What is the difference between sleep and wait in Java?
Answer: Both are used to pause thread that is currently running, however, 
sleep() is meant for short pause because it does not release lock, 
while wait() is meant for conditional wait.
This is why it releases lock, which can then be developed by a different thread 
to alter the condition of which it is waiting.*/