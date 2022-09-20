package walmart.thread;

public class WaitNotifyTest {
	 public static void main(String[] args) {
		threadB b = new threadB();
		b.start();
		synchronized(b){
			System.out.println("in main "+b.getName());
			try {
				b.wait();
				System.out.println("wait done");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class threadB extends Thread
{
	public void run() {
		synchronized (this) {
		
			System.out.println("before notify threadB ="+this.getName());
			notify();
			System.out.println("after notify");
		}
	}
}