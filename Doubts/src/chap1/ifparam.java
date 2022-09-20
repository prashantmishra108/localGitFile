package chap1;

public class ifparam {
	static boolean t;

	public static void main(String[] args) {
		boolean flag = (Boolean) true;
		Boolean b = new Boolean(true);
		Boolean bnull = new Boolean("");//new Boolean(null) - is also false
		System.out.println("bnull = "+bnull);
		//boolean flagnull = (Boolean) null;//gives nullpointer exception
		int k = 0;
		try {
			if (t)
				System.out.println("inside if");
			for (int d = 0; d < 2; d++) {
				if (flag)
					System.out.println("inside for");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	//	System.out.println(flagnull);
	}
}
