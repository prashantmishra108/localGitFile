package best;

public class Thread2 implements Runnable {

 public void run() {
 System.out.println("run.");
 throw new RuntimeException("Problem");
 }
 public static void main(String[] args) {
 Thread t = new Thread(new Thread2());
 t.start();try {
	t.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 System.out.println("End of method.");
 }
 }