package best;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
//https://www.baeldung.com/java-collection-stream-foreach
public class CustomIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(new String("A"));
		list.add(new String("B"));
		list.add(new String("C"));
		list.add(new String("D"));
		Iterator<String> it = new ReverseList().iterator();
		List<String> myList = new ReverseList();
		myList.addAll(list);
		myList.forEach(System.out::print); 
		//it.forEachRemaining((Consumer<? super String>) myList);
		System.out.print(" "); 
		myList.stream().forEach(System.out::print);
	}
}
//And we get different results:
/*
 * DCBA ABCD Copy The reason for the different results is that forEach() used
 * directly on the list uses the custom iterator, while stream().forEach()
 * simply takes elements one by one from the list, ignoring the iterator.
 */class ReverseList extends LinkedList<String> {
	    private static final long serialVersionUID = 1L;
		@Override
	    public Iterator<String> iterator() {
	        int startIndex = this.size() - 2;
	        List<String> list = this;
	        Iterator<String> it = new Iterator<String>() {
	            private int currentIndex = startIndex;
	            @Override
	            public boolean hasNext() {
	            	System.out.println("has");
	                return currentIndex >= 0;
	            }
	            @Override
	            public String next() {
	                String next = list.get(currentIndex);
	                currentIndex--;
	                return next;
	             }
	             @Override
	             public void remove() {
	                 throw new UnsupportedOperationException();
	             }
	         };
	         return it;
	    }
	}
