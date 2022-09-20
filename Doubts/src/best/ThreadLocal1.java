package best;

public class ThreadLocal1 {
	public static class MyRunnable implements Runnable {
		private ThreadLocal threadLocal = new ThreadLocal();

		@Override
		public void run() {
			threadLocal.set((int) (Math.random() * 100D));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(threadLocal.get());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyRunnable sharedRunnableInstance = new MyRunnable();
		Thread thread1 = new Thread(sharedRunnableInstance);
		Thread thread2 = new Thread(sharedRunnableInstance);
		thread1.start();
		thread2.start();
		System.out.println("before thread 1 join");
		thread1.join(); // wait for thread 1 to terminate
		//Thread.sleep(10000);
		System.out.println("before thread 2 join");
		 thread2.join(); //wait for thread 2 to terminate
		 System.out.println("end main");
	}
}
