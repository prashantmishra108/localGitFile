package best;

class One implements Runnable {
	public void run() {
		synchronized (this) {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class Two implements Runnable {
	public void run() {
		// new One().run();
		new Thread(new One(), "gfg2").run();
		new Thread(new One(), "gfg2.5").run();// for calling run , no new thread is getting
		// created and the same thread as of main is getting used for run().
		/* new Thread(new One(),"gfg3").start(); */
		new Thread(new One(), "gfg2").start();
		new Thread(new One(), "gfg2.5").start();
		
		
	}
}

class ThreeThread {
	public static void main(String[] args) {
		new Thread(new Two(), "gfg1").start();
	}
}