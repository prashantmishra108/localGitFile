import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class FindSubstring {
	public static void main(String[] strs) {
		String S = "barfoothefoobarman";
		String[] L = {"foo","bar"};
		System.out.print(findSubstring(S, L));
	}
	
    public static List<Integer> findSubstring(String mainString, String[] array) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (mainString == null || array == null || array.length == 0) {
            return ret;
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> des = new HashMap<String, Integer>();
        for (String arrElements: array) {
            if (map.containsKey(arrElements)) {
                map.put(arrElements, map.get(arrElements) + 1);
            } else {
                // bug 1: should be , not .
                map.put(arrElements, 1);
            }
        }
        int wordLen = array[0].length();
        int size = array.length;
        int cnt = 0;
        int mainStrLength = mainString.length();
        for (int i = 0; i < mainStrLength; i++) {
           // map.clear();
            cnt = 0;
       //   System.out.println("i="+i);  
            // pay attention: should use j <= len.    //   String[] L = {"foo","bar"};
            for (int j = i; j <= mainStrLength - wordLen; j += wordLen) { //	String S = "barfoothefoobarman";
        		
                String sub = mainString.substring(j, j + wordLen);

            //    System.out.println("j="+j);
                if (!map.containsKey(sub)) {
                    break;
                }
                LinkedList l = new LinkedList();
                if (des.containsKey(sub)) {
                    des.put(sub, 1 + des.get(sub));
                } else {
                    des.put(sub, 1);
                }
                
                if (des.get(sub) > map.get(sub)) {
                //    break;
                }
                
                cnt++;
                  
                if (cnt == size) {
                    ret.add(i);
                    break;
                }
            }
        }
        
        return ret;
    }
}