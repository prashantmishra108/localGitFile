package persistent;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Dobut {
	public static void main(String[] args) {
		meth(null);
	}
	static void meth(Object o) {
		Dobut obj = new Dobut();
		Dobut obj2 = new Dobut();
		System.out.println("obj"+obj2.equals(obj));
		List<Integer> li = new ArrayList<Integer>();
		Set<Integer> se = new TreeSet<Integer>();
		for(int i=-3;i<3;i++) {
			li.add(i);se.add(i);
		}
		System.out.println(li);
		for(int i=0;i<3;i++) {
			li.remove(i);se.remove(i);
		}
		System.out.println(li+" "+se);
	}
}
