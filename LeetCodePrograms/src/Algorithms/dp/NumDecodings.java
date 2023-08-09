package Algorithms.dp;
//not understood the question
public class NumDecodings {
	public static void main(String[] args) {
		
		System.out.println(numDecodings("2"));
	}
	
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int len = s.length();
        
        // D[i] è¡¨ç¤ºå�«æœ‰iä¸ªå­—ç¬¦çš„å­�ä¸²çš„DECODE WAYS.
        int[] D = new int[len + 1];
        
        D[0] = 1;
        
        for (int i = 1; i <= len; i++) {
            D[i] = 0;
            
            // çŽ°åœ¨æ­£åœ¨è€ƒå¯Ÿçš„å­—ç¬¦çš„ç´¢å¼•.
            int index = i - 1;
            // æœ€å�Žä¸€ä¸ªå­—ç¬¦ç‹¬ç«‹è§£ç �
            if (isValidSingle(s.charAt(index))) {
                D[i] += D[i - 1];
            }
            
            // æœ€å�Žä¸€ä¸ªå­—ç¬¦ä¸Žä¸Šä¸€ä¸ªå­—ç¬¦ä¸€èµ·è§£ç �
            if (i > 1 && isValidTwo(s.substring(index - 1, index + 1))) {
                D[i] += D[i - 2];
            }
        }
        
        return D[len];
    }
    
    public static boolean isValidSingle(char c) {
        if (c >= '1' && c <= '9') {
            return true;
        }
        
        return false;
    }
    
    public static boolean isValidTwo(String s) {
        int num = Integer.parseInt(s);
        
        return (num >= 10 && num <= 26);
    }
}
