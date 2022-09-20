package best;

public class DSABrackets {
	static int i = 0;

	public static void main(String[] args) {
		new DSABrackets().Brackets("", 0, 0, 3);
	}

	public void Brackets(String output, int open, int close, int pairs) {
		System.out.println("open = " + open + "close =" + close + " pairs = " + pairs);
		if (open == pairs) {
			System.out.println("A");
			// System.out.println("2."+output + " End "+"open = "+open+" close = "+close);
		} else {
			if (close < open) {
				System.out.println("B");
				Brackets(output + "}", open, close + 1, pairs);
			} // System.out.print("jump-"); System.out.println("open = "+open+"close
				// ="+close+" pairs = "+pairs);
			if (open < pairs) {
				System.out.println("C");
				Brackets(output + "{", open + 1, close, pairs);
			} // System.out.print("last-jump"); System.out.println("open = "+open+"close
				// ="+close+" pairs = "+pairs);
		}
		// i++;System.out.println("final = "+i);
	}
}
