package practice;
import java.util.logging.Logger;


public class trycatch {
	private static final Exception Exception = null;
	private static final Logger fLogger =
	    Logger.getLogger(trycatch.class.getName());
	static int j=10;//fLogger.class.getPackage().getName()
	public static void main(String args[]) throws Exception{
		StringBuffer sbl = new StringBuffer("hi");
		
		System.out.println(sbl.append("v").append("n"));
		System.out.println(tryy(j));
	}
	public static String tryy(int a)throws Exception{
		try{
			throw Exception ;
			}
		catch(Exception ex){
			/*fLogger.severe("Problem occured. Cannot close reader : " + ex.getMessage());*/
			return "hi";
		}
		finally{
			System.out.println("bye");
		}
	}
	
}
