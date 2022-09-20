package chap3;

public class Integertoint {
	static Integer n = new Integer(00);

	public static void main(String[] args) {
		System.out.println("h");
		mymeth(n);
		System.out.println("hh");
	}

	static void mymeth(int x) {
		x = new Integer(100);
		System.out.println(x);
	}
}
