package best;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WhyThreadsDontCache {
public static void main(String[] args) {
final	String str_example = "";     
	ThreadPoolExecutor poolExecutor =
			new ThreadPoolExecutor(10, 30, (long)10, 
					TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2));
	    for (int i = 0; i < 80; i++){
	        poolExecutor.submit(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    Thread.sleep((long) (Math.random() * 1000));
	                    String temp = str_example + "1";
	                    str_example = temp;
	                    System.out.println(str_example);

	                } catch (Exception e) {
	                    e.printStackTrace();
	                }

	            }
	        });
	    }
}
}
