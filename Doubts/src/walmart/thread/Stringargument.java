package walmart.thread;

import java.util.LinkedHashMap;
import java.util.Map;

public class Stringargument {

	public static void main(String[] args) {
		
		Map<Character,Integer> counts = new LinkedHashMap<Character, Integer>(6);
		counts.put('c', 1);
		counts.put('r', 21);
		counts.put('c', 5);
		System.out.println(counts);
		System.out.println(reverseRecursively("tiger"));
		System.out.println(args[0]+"=args[0] and \n"+args[1]+" =args[1] "+ "\n args.length= "+args.length);
	}
	
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}
