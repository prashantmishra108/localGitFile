package best;
public class WNotifier implements Runnable {
	    private WaiterMessage msg;
	    public WNotifier(WaiterMessage msg) {
	        this.msg = msg;
	    }
	    @Override
	    public void run() {
	        String name = Thread.currentThread().getName();
	        System.out.println(name+" started");
	        try {
	            Thread.sleep(1000);
	            synchronized (msg) {
	            	System.out.println("notifier class msg obj ="+msg);
	                msg.setMsg(name+" Notifier work done");
	                System.out.println("Notifying");
	               // msg.notifyAll();
	                notify();
	                Thread.sleep(3000);
	                msg.notify();
	            //thread will not understand what to notify if waiter thread has simple wait instead of Thread.wait
	            }
	            System.out.println("notify completed ");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}