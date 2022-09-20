package chap4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car {
	private boolean waxOn = false;

	public synchronized void waxed() {
		System.out.println("7.inside waxed");
		waxOn = true; // Ready to buff
		notifyAll();
	}

	public synchronized void buffed() {
		System.out.println("10.inside buffd");
		waxOn = false; // Ready for another coat of wax
		notifyAll();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		System.out.println("inside w8 4waxng");// 6//12
		while (waxOn == false)
			wait();
	}

	public synchronized void waitForBuffing() throws InterruptedException {
		System.out.println("8 inside wait4buffng");
		while (waxOn == true)
			wait();
	}
}

class WaxOn implements Runnable {
	private Car car;

	public WaxOn(Car c) {
		System.out.println("waxon constrctr");// 2
		car = c;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			while (!Thread.interrupted()) {
				System.out.println("Wax On!");// 4//11
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		} catch (InterruptedException e) {
			System.out.print("\nExiting via interrupt");
		}
		System.out.print("Ending Wax On task");
	}
}

class WaxOff implements Runnable {
	private Car car;

	public WaxOff(Car c) {
		System.out.println(" inside waxoff constrctr");// 5
		car = c;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			while (!Thread.interrupted()) {
				car.waitForWaxing();
				System.out.println("9.Wax Off! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			}
		} catch (InterruptedException e) {
			System.out.print(" Exiting via interrupt");
		}
		System.out.print("Ending Wax Off task");
	}
}

public class ExecutorsTask {
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		ExecutorService exec = Executors.newCachedThreadPool();
		System.out.println(" before wax on object ");// 1
		exec.execute(new WaxOn(car));
		System.out.println(" after wax on object and b4 waxOff ");// 3
		exec.execute(new WaxOff(car));
//exec.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(5); // Run for a while...
		exec.shutdownNow(); // Interrupt all tasks
	}
}