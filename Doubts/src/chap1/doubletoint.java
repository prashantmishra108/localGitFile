package chap1;

public class doubletoint extends abs {
	public static void main(String[] args) {
		double db = 12;
		System.out.println(meth(db, 3.00));
		System.out.println(methint(db, 3));
		System.out.println(methint(12, 3));
	}
}

class abs {
	static int meth(double db, int b) {
	return b;
	}
	static int methint(int db, int b) {
	return b;
	}
}