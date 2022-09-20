package tricky;

public class Main {
	   static public final Object a = new Object();
	   static {
	      Runtime.getRuntime().addShutdownHook(new Thread() {
	         @Override
	         public void run() { if (a == null); }
	      });
	      System.out.println("hi");
	      //System.exit(0);
	      System.out.println("hi2");
	   }
	   static public void main(final String[] args) {
		   System.out.println("hi3");
	   }
	}


