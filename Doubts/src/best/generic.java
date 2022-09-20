package best;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class generic {
	// program wont work if we remove java.util.list
	public static void main(String[] args) {

		List<Integer> l = new LinkedList<Integer>();
		l.add(2);
		//l.add(new String("abc"));//gves compile time error
		add(l);
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().getClass());
		}

	}

	public static java.util.List add(java.util.List l) {
	//(java.util.List<Integer> l) { gves compile time error

		l.add(new String("abc"));
		return l;
	}
}