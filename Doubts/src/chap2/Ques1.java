package chap2;

import java.util.Scanner;

public class Ques1 {
	public static void main(String[] args) {
		int x = 27;
		switch (x) {
		case 26 + 1:
			System.out.println("2");
			++x; // break;
		default:
			System.out.println("defualvt x=" + x); // break;
		case 3:
			System.out.println("8");
			break;// default:System.out.println("2nd-default");
		}
		System.out.println(x);
		String s = "hello,byeo,where";
		String srr[] = s.split("o,");
		Scanner scn = new Scanner(s);
		// scn.useDelimiter(",");
		while (scn.hasNext()) {
			 System.out.println(scn.next());
		}
		int a = 9;
		f(a);
	}

	static void f(final int a) {
	}

}
