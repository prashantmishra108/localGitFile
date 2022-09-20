package practice.queues;

import java.util.*;

class BookII implements Comparable<BookII> {
	int id;
	String name, author, publisher;
	int quantity;

	public BookII(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int compareTo(BookII b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class PriorityQueueObject {
	public static void main(String[] args) {
		Queue<BookII> queue = new PriorityQueue<BookII>();
		// Creating BookIIs
		BookII b1 = new BookII(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookII b2 = new BookII(233, "Operating System", "Galvin", "Wiley", 6);
		BookII b3 = new BookII(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		// Adding BookIIs to the queue
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);
		System.out.println("Traversing the queue elements:");
		// Traversing queue elements
		for (BookII b : queue) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		queue.remove();
		System.out.println("After removing one book record:");
		for (BookII b : queue) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}