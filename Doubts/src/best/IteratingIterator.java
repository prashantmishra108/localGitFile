package best;

import java.util.Arrays;
import java.util.Iterator;

public class IteratingIterator {
	public static void main(String[] args) {
		Iterator it1 = Arrays.asList(1, 2, 4, 3).iterator();
		Iterator it2 = Arrays.asList('a', 'b').iterator();
		Iterator<Iterator> it = Arrays.asList(it1, it2).iterator();
		while (it.hasNext()) {
			Iterator itt = it.next();
			while (itt.hasNext()) {
				System.out.println(itt.next());
			}
		}
	}
}
