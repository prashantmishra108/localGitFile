package walmart.thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
public class ThreadTimeout {
	   public static void main(String[] args) throws Exception {
	    ExecutorService executor = Executors.newSingleThreadExecutor();
	    Future<String> future = executor.submit(new Task());

	    try {
	        System.out.println("Started..");
	        System.out.println(future.get(3, TimeUnit.SECONDS));
//Waits if necessary for at most 
//the given time for the computation to complete, and then retrieves its result, if available.	      
	        System.out.println("Finished!");
	    } catch (TimeoutException e) {
	        System.out.println("Terminated!");
	    }

	    executor.shutdownNow();
	    }
	}

	class Task implements Callable<String> {
	   @Override
	   public String call() throws Exception {
	       Thread.sleep(4000); // Just to demo a long running task of 4 seconds.
	       return "Ready!";
	   }
	}