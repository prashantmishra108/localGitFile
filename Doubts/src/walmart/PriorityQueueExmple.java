package walmart;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExmple  {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> a - b); 
		for(int i=0;i<10;i++ ) {
			pq.add(i);
			pq.stream().forEach(x->System.out.print(x+"  "));
			System.out.println();
		}
		System.out.println();
		PriorityQueue<Integer> pqReversed = new PriorityQueue<Integer>((a, b) -> b-a); 
		for(int i=0;i<10;i++ ) {
			pqReversed.add(i);
			
			System.out.println();
		}
		pqReversed.stream().forEach(x->System.out.print(x+"  "));
		System.out.println();
		while(pqReversed.peek()!=null ) {
			System.out.print(pqReversed.poll()+ "  ");
		}
		System.out.println();
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		pqueue.add(30);
		pqueue.add(20);
		pqueue.add(10);
		pqueue.add(40);
		pqueue.add(50);
		//pqueue.add(60);
		Iterator<Integer> it = pqueue.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		System.out.println();
		while(pqueue.peek()!=null ) {
			System.out.print(pqueue.poll()+ "  ");
		}

	}
}
