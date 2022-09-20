package best;

public class WaitNotifyTest {

    public static void main(String[] args) {
        WaiterMessage msg = new WaiterMessage("process it");
        WaiterThread waiter = new WaiterThread(msg);//same msg obj going to both classes Notifier and Waiter
        new Thread(waiter,"waiter").start();
        
      /*  WaiterThread waiter1 = new WaiterThread(msg);
        new Thread(waiter1, "waiter1").start();
      */  
        WNotifier notifier = new WNotifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }

}