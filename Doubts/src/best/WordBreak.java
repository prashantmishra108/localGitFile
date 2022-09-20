package best;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WordBreak {
	public static void main(String[] args) {
		Set<String> dict = new TreeSet<String>(Arrays.asList("to","get","her", "am"));
		System.out.println(new WordBreak().wordBreak("together", dict));
	}

	/*
	 * public boolean wordBreak(String s, Set<String> dict) { return
	 * wordBreakHelper(s, dict, 0); }
	 */
	public boolean wordBreak(String s, Set<String> wordDict) {
		int[] pos = new int[s.length() + 1];

		Arrays.fill(pos, -1);

		pos[0] = 0;

		for (int i = 0; i < s.length(); i++) {
			if (pos[i] != -1) {
				for (int j = i + 1; j <= s.length(); j++) {
					String sub = s.substring(i, j);
					if (wordDict.contains(sub)) {
						pos[j] = i;
					}
				}
			}
		}

		return pos[s.length()] != -1;
	}

	/*
	 * public boolean wordBreakHelper(String s, Set<String> dict, int start){
	 * if(start == s.length()) // return true; for(String a: dict){ int len =
	 * a.length(); int end = start+len; //end index should be <= string length
	 * if(end > s.length()) continue; if(s.substring(start, start+len).equals(a))
	 * if(wordBreakHelper(s, dict, start+len)) return true; } return false; }
	 */}
