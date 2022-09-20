package futureNcallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ClientTest {
 public static void main(String[] args) {
	 Callable<String> task1 = new Callable<String>(){
		 @Override
		 public String call()throws Exception{
			 return "My task is done";
		 }
	 };
	 ExecutorService ex = Executors.newSingleThreadExecutor();
	 Future<String> f = ex.submit(task1);
	 MyCallable task2 = new MyCallable(10);
	 Future<Integer> f2 = ex.submit(task2);

	 if(f.isDone()){
		 try{
			 System.out.println("work is="+f.get()+f2.get());
		 }
		 catch(InterruptedException|ExecutionException e){
			 e.printStackTrace();
		 }
	 }
//	 Future<String> f2 = ex.submit(task2);
	 

 
 }


}
