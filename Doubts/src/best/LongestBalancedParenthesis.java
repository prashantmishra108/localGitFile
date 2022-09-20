package best;

import java.util.Stack;

public class LongestBalancedParenthesis {
	public static void main(String[] args) {
		System.out.println(findMaxLen("(((((((())")); // prints 4
		/*( (  (  (  (  (  (  (  )  )
		 *0 1 2 3 4 5 6 7  8 9  10
		 * System.out.println(findMaxLen("(((()")); // prints 2
		 * System.out.println(findMaxLen("((((")); // prints 0
		 * System.out.println(findMaxLen("()()")); // prints 4
		 * System.out.println(findMaxLen("(()())(()")); // prints 6
		 */
	}

// Function to find length of the longest balanced parenthesis in a string
	public static int findMaxLen(String str) {
		// create a stack of integers for storing index of parenthesis in the string
		Stack<Integer> stack = new Stack<Integer>();

		// initialize the stack by -1
		stack.push(-1);

		// stores the length of the longest balanced parenthesis
		int len = 0;

		// iterate over characters of the string
		for (int i = 0; i < str.length(); i++) {
			// if current character is an opening parenthesis,
			// push its index in the stack
			if (str.charAt(i) == '(') {
				stack.push(i);
			}

			// if current character is a closing parenthesis
			else {
				// pop top index from the stack
				stack.pop();

				// if the stack becomes empty, push current index into the stack
				if (stack.empty()) {
					stack.push(i);
					continue;
				}

				// get length of the longest balanced parenthesis ending
				// at current character
				int curr_len = i - stack.peek();

				// update length of longest balanced parenthesis if required
				if (len < curr_len)
					len = curr_len;
			}
		}

		return len;
	}
}
