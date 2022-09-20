package producerAndConsumer;

public class PCWaitNotify {
		public static void main(String[] args) {
			Thread2 b = new Thread2();
			b.start();
			synchronized (b) {
				try {
					System.out.println("Waiting for 2 to complete...");
					b.total=50;
					b.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Total is: " + b.total);
			}
		}
}

class Thread2 extends Thread  {
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				total += i;
			}
			notify();
		}
	}
/*	This method should only be called by a thread that is the owner of this object's monitor. A thread becomes the owner of the object's monitor in one of three ways: 
		•By executing a synchronized instance method of that object. 
		•By executing the body of a synchronized statement that synchronizes on the object. 
		•For objects of type Class, by executing a synchronized static method of that class. 
		Only one thread at a time can own an object's monitor.
*/	
}