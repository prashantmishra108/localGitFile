package practice.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.addFirst("Vijay");
		deque.add("Ajay");
		// Traversing elements
		//deque.
		for (String str : deque) {
			System.out.println(str);
		}
	}
}