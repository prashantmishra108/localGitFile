//check on u tube
public class MinimumWindowByAmellPeralta {
//	static String s="ADOBECODEBANC", t="ABC";
	static String s = "BACBC", t = "BC";

	// static String s="1234",t="23";
	public static void main(String[] args) {
		new MinimumWindowByAmellPeralta().findMinWindowSubstring(s, t);
	}

	public void findMinWindowSubstring(String s, String t) {

		if (s == null && t == null) {
			System.out.println("");
		}
		int left = 0, count = 0, lens = s.length(), lent = t.length(), minlength = Integer.MAX_VALUE;
		int lettercount[] = new int[128];

		String res = null;

		/*
		 * for(int i=0;i<lent;i++) { int a=t.charAt(i);System.out.println(a);
		 * lettercount[t.charAt(i)]++; }
		 */

		for (char c : t.toCharArray()) {
			++lettercount[c];
		}
		for (int right = 0; right < lens; ++right) {
			char schar = s.charAt(right);
			if (--lettercount[schar] >= 0) {
				++count;
			}
			while (count == lent) {
				if (minlength > right - left + 1) {
					minlength = right - left + 1;
					System.out.println("left=" + left + " right=" + right);
					res = s.substring(left, right + 1);
				}
				if (++lettercount[s.charAt(left)] > 0)
					count--;
				++left;
			}
		}
		System.out.println(res);
	}
}
