package Algorithms.dp;
//https://www.techiedelight.com/word-break-problem/
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	   // Word Break Problem Implementation in Java
    public static void main(String[] args)
    {
        // List of strings to represent a dictionary
     //   List<String> dict = Arrays.asList("this", "th", "is", "famous",
     //                               "Word", "break", "b", "r", "e", "a", "k",
      //                              "br", "bre", "brea", "ak", "problem");
 
        // input string//if t his or th is or t h is is present in dictionary then pass true
        String str = "this";
        Set <String> dict = new HashSet<>();//{"this", "th", "is", "famous"};
        dict.add("t");
        dict.add("ti");
        dict.add("his");
        dict.add("famous");
        System.out.println(wordBreak(str,dict));
    }
    public static boolean wordBreak(String s, Set<String> dict) {
        if (s == null) {
            return false;
        }
        
        int len = s.length();
        if (len == 0) {
            return true;
        }
        
        boolean[] D = new boolean[len + 1];

        // initiate the DP. æ³¨æ„�ï¼Œè¿™é‡Œè®¾ç½®ä¸ºtrueæ˜¯ä¸�å¾—å·²ï¼Œå› ä¸ºå½“æˆ‘ä»¬åˆ’åˆ†å­—ä¸²ä¸ºå·¦è¾¹ä¸º0ï¼Œå�³è¾¹ä¸ºnçš„æ—¶å€™ï¼Œ
        // è€Œå�³è¾¹çš„næ˜¯ä¸€ä¸ªå­—å…¸string,é‚£ä¹ˆå·¦è¾¹å¿…ç„¶è¦�è®¾ç½®ä¸ºtrueï¼Œæ‰�èƒ½ä½¿ç»“æžœä¸ºtrueã€‚æ‰€ä»¥ç©ºå­—ç¬¦ä¸²æˆ‘ä»¬éœ€è¦�
        // è®¤ä¸ºtrue
        D[0] = true;
        
        // D[i] è¡¨ç¤ºié•¿åº¦çš„å­—ç¬¦ä¸²èƒ½å�¦è¢«word break.
        for (int i = 1; i <= len; i++) {
        	// æŠŠå­�ä¸²åˆ’åˆ†ä¸º2éƒ¨åˆ†ï¼Œåˆ†åˆ«è®¨è®º, j è¡¨ç¤ºå·¦è¾¹çš„å­—ç¬¦ä¸²çš„é•¿åº¦
        	// æˆ�ç«‹çš„æ�¡ä»¶æ˜¯ï¼šå·¦è¾¹å�¯ä»¥break, è€Œå�³è¾¹æ˜¯ä¸€ä¸ªå­—å…¸å�•è¯�
        	D[i] = false;
        	for (int j = 0; j < i; j++) {
        		String c=s.substring(j, i);
        		if (D[j] && dict.contains(c)) {
        			// å�ªè¦�æ‰¾åˆ°ä»»æ„�ä¸€ä¸ªç¬¦å�ˆæ�¡ä»¶ï¼Œæˆ‘ä»¬å°±å�¯ä»¥BREAK; è¡¨ç¤ºæˆ‘ä»¬æ£€æŸ¥çš„
        			// è¿™ä¸€ä¸ªå­�ä¸²ç¬¦å�ˆé¢˜æ„�
        			D[i] = true;
        			break;
        		}
        	}
        }

        return D[len];
    }
}