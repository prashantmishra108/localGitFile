package best;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//How to remove duplicate key-value pairings in a map
public class RemoveDuplicateFromHashMap {

	public static void main(String[] args) {
		new RemoveDuplicateFromHashMap().printAfterRemovingDuplicate();
	}
void printAfterRemovingDuplicate(){
	Map<String, String> myMap1 = new TreeMap<String, String>();
	 myMap1.put("1", "One");
	 myMap1.put("2", "Two");
	 myMap1.put("3", "One");
	 myMap1.put("4", "Three");
	 myMap1.put("5", "Two");
	 myMap1.put("6", "Three");
	/* HashMap<String, String> hm = (HashMap<String, String>) myMap1;
	 System.out.println(hm);*/
	 Set<String> mySet = new HashSet<String>();
	 for (Iterator itr = myMap1.entrySet().iterator(); itr.hasNext();)
	 {
	    Map.Entry<String, String> entrySet = (Map.Entry) itr.next();
	    String value = entrySet.getValue();
	    if (!mySet.add(value))
	    {
	        itr.remove();               
	    }
	 } 
	  Map<String, String> myMap2 = new TreeMap<String, String>(myMap1);   
	  System.out.println("Result :"+myMap2);	
}
}
