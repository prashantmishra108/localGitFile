package Algorithms.string;

import java.util.Stack;

public class LongestValidParentheses {
	public static void main(String[] strs) {
		System.out.println(longestValidParentheses("(())"));
	}

	public static int longestValidParentheses(String s) {
		if (s == null) {
			return 0;
		}
		Stack<Integer> st = new Stack<Integer>();
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);   // "(()()())"
			if (c == '(') {
				st.push(i);
			} else {
					st.pop();
					if(st.isEmpty())
						st.push(i);
					else {
						int len=i-st.peek();
						max=Math.max(max, len);
					}
			}
		}
		return max;
	}

	public int longestValidParentheses2(String s) {
		if (s == null) {
			return 0;
		}
		int len = s.length();
		Stack<Integer> stk = new Stack<Integer>();
		int sum = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stk.push(i);
			} else {
				if (stk.isEmpty()) {
					// The sequence is cut off.
					sum = 0;
				} else {
					int tmp = i - stk.pop() + 1;
					if (stk.isEmpty()) {
						sum += tmp;
						max = Math.max(max, sum);
					} else {
						max = Math.max(max, i - stk.peek());
					}
				}
			}
		}

		return max;
	}
}