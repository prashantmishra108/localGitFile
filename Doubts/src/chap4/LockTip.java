package chap4;
import java.util.List;import java.util.ArrayList;
public class LockTip extends Thread {
private List longs = new ArrayList();
public static void main(String args[]) {
        LockTip lt = new LockTip();
        System.out.println("start");
        lt.start();
        System.out.println("after");
       new LongSupplier(lt).start();
 }
public void run() {
        while (true) {
            try {synchronized(this) {
                wait();
            }  // do something with longs
                System.out.println("doing something: " + this.longs);this.addLong(12L);
            }
            catch (InterruptedException e) {
            	System.out.println("Ltip");
            	e.printStackTrace();}
        }
    } //synchronized use it for escaping exception. if its not here the notify will give exception
    public /*synchronized*/ void addLong(Long l) {
         this.longs.add(l); 
         System.out.println("b4 ntfy-all"+l+" "+this);
         notify();
    }
}
class LongSupplier extends Thread {
    private LockTip lt;
    public LongSupplier(LockTip lt) {
        this.lt = lt;
    }
    public void run() {
       /* while (true)*/ { System.out.println("longsupplier run");
            try {
                Thread.sleep(1000);
                this.lt.addLong(new Long(123));
            }
            catch (InterruptedException e) {
            	System.out.println("Lsong");
            }
        }
    }
}
//https://www.zdnet.com/article/calling-wait-notify-and-notifyall-within-a-non-synchronized-method/