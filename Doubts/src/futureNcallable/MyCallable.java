package futureNcallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{
static int limit=0;
static int sum=0;
	public MyCallable(int i) {
		limit=i;
	}
	
	@Override
	public Integer call() throws Exception {
		for (int j=1;j<limit;j++){
			sum=sum+j;
		}
		return sum;
	}
}
