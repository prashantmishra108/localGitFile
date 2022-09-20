package best;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class listchek {

	public static void main(String[] args) {
		List<String> onlylist = new ArrayList<String>();
		onlylist.add("tiger");
		ArrayList<String> list = new ArrayList<String>();
		list.add("tiger");
		 try {
	            Class c = List.class;
	            Method[] m = c.getDeclaredMethods();
	            for (int i = 0; i < m.length; i++)
	            System.out.println(m[i].toString());
	        } catch (Throwable e) {
	            System.err.println(e);
	        }
		
		
	}
}
