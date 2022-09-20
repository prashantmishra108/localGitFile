package best;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RemoveUse {
public static void main(String[] args) {
	Map<String, String> myMap1 = new TreeMap<String, String>();
	 myMap1.put("1", "One");
	 myMap1.put("2", "Two");
	 myMap1.put("3", "One");
	 myMap1.put("4", "Three");
	 myMap1.put("5", "Two");
	 myMap1.put("6", "Three");
	 Iterator it = myMap1.entrySet().iterator();
	 while(it.hasNext()){
		 Map.Entry mE = (Map.Entry) it.next();
		 System.out.println(mE.getKey());
	 }
	
	 /*Map<String,ArrayList<String>> mapList = new HashMap<String, ArrayList<String>>();
	 ArrayList<String> alist = new ArrayList<String>(Arrays.asList("ram","shyam","Ghanshyam"));
	 alist.set(2, "youwecan");
	 ArrayList<String>cloneList = (ArrayList<String>) alist.clone();
	 Object objList =  alist.clone();
	 //System.out.println(objList);
	 System.out.println(alist.remove(0));
	 Object objNum = 2;
	 //System.out.println(objNum = 3);
	 */
	 LinkedList<String> llist = new LinkedList<String>(Arrays.asList("ram","shyam","Ghanshyam"));
	 LinkedList<String> linklist = (LinkedList<String>) llist.clone();
	 System.out.println(linklist = llist);
	 System.out.println(linklist.poll());
	 System.out.println(linklist+" "+llist );
	 

}
}
