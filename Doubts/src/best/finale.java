package best;

public class finale extends methA {
	public static void main(String[] args) {
		int i = 1;
//		int s =  ++i + i--  ;System.out.println(s);
//		System.out.println(1+2+"s"+4+4+"s"+4+4);
		Integer iob = new Integer(100 + 2 / 2);
		System.out.println(iob.intValue());
		/* String s = new String(null); */
		methA obj = new methA();
		System.out.println(obj.methodOfA());
		/*
		 * final afinal obj = new afinal(); obj.set("ram");
		 * 
		 * System.out.println(obj.name);
		 */
	}

	@Override
	void method(int i) {
	}
}

class methA {
	void method(int i) {
	}

	String methodOfA() {
		return (true ? null : "s");
	}
}
