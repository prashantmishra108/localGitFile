package walmart.thread;

public class threds extends Thread {

	public void run(){
		synchronized(this){
			
			if(this.getName().equalsIgnoreCase("T")){System.out.println("yeild");
				this.yield();//wait(2563);
			System.out.println("Syncronized" +this.currentThread());
		}System.out.println("s" +this.currentThread()+this.getName());}
	}
	public static void main(String[] args) {
		
		threds t = new threds();
		threds t1 = new threds();
		long strttime = System.currentTimeMillis();
		t.setName("T");
		t1.setName("T1");
		t1.start();
		t.start();
		System.out.println(System.currentTimeMillis()-strttime+"  main");
		
		/*try{
			//t1.yield();
			//t.join(5000);
		}
		catch(Exception e){System.out.println("aftr join");
			//System.out.println(System.currentTimeMillis()-strttime);
		}*///System.out.println(System.currentTimeMillis()-strttime+"  end");
	}
}
