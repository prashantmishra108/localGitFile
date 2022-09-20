package tricky;

public class Main2 {
	   static public final Object a = new Object();
	   static {
	      final Object aa = a;
	      System.out.println(Object.class.isInstance(aa));
	      Runtime.getRuntime().addShutdownHook(new Thread() {
	         @Override
	         public void run() { if (aa == null); }
	      });
	      System.out.println("hi");
	      //System.exit(0);
	      System.out.println("hi2");
	   }
	   static public void main(final String[] args) {
		   System.out.println("hi4");
	   }
	
}