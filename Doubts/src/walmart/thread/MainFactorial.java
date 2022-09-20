package walmart.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainFactorial {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		List<Future<Integer>> resultList = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			FactorialCalculator calculator = new FactorialCalculator(i);
			Future<Integer> result = executor.submit(calculator);
			resultList.add(result);
		}
		FactorialCalculator calculator1 = new FactorialCalculator(11);
		FactorialCalculator calculator2 = new FactorialCalculator(11);
		List<FactorialCalculator> li = new ArrayList<FactorialCalculator>();
		li.add(calculator1);
		li.add(calculator2);
		 executor.invokeAll(li);
//Blocks until all tasks have completed execution after a 
//shutdown request, or the timeout occurs, or the current thread is interrupted, 
//whichever happens first
//true if this executor terminated and false if the timeout elapsed before termination:
//		boolean flag = executor.awaitTermination(1, TimeUnit.NANOSECONDS);
		
		boolean flag = executor.awaitTermination(9, TimeUnit.SECONDS);
		System.out.println(flag);
		for (int i = 0; i < resultList.size(); i++) {
			Future<Integer> result = resultList.get(i);
			Integer number = null;
			try {
				number = result.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			System.out.printf("Main: Task %d: %d\n", i, number);
		}

		executor.shutdown();
	}
}
