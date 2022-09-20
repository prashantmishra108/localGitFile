package walmart;

public class WaitNotify {
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
	
}