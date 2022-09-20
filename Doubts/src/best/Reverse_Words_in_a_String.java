package best;
public class Reverse_Words_in_a_String {
	
	public static void main(String[] args) {
		String s = new Reverse_Words_in_a_String().reverseWords("The rain is good");
		System.out.println(s);
		System.out.println(new Reverse_Words_in_a_String().reverseWordsAtItsPlace(
				"This is good morning"));
	}
	
	public String reverseWordsAtItsPlace(String s) {
		String arr[] = s.split(" ");
	//	StringBuilder reversed = new StringBuilder();
		String reversed = new String("");
		for(String word:arr) {
			for(int i=word.length()-1;i>=0;i--) {
			//	System.out.print( String.valueOf((word.charAt(i))));
				reversed = reversed.concat( String.valueOf((word.charAt(i)))  );
			}
			//System.out.print(" ");
			reversed = reversed.concat(" ");
		}
		return reversed;
	}
	public String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return s;
            
 		String[] words = s.trim().split(" ");       
 		if (words.length == 0) {
 			return s;
 		}

 		StringBuffer sb = new StringBuffer();

 		for (int i = words.length - 1; i >= 0; i--) {
 		    if (!words[i].equals("")) {
 		        sb.append(words[i]).append(" ");    
 		    }	
 		}
 		
 		return sb.length() == 0? "" : sb.substring(0, sb.length()-1);
    }
	
	
}