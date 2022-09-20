package best;

//Java orogram to demonstrate working of Queue 
//interface in Java 
import java.util.LinkedList; 
import java.util.Queue; 

public class QueueExample 
{ 
public static void main(String[] args) 
{ 
	Queue<Integer> q = new LinkedList<>(); 

	// Adds elements {0, 1, 2, 3, 4} to queue 
	for (int i=0; i<5; i++) 
	q.add(i); 

	// Display contents of the queue. 
	System.out.println("Elements of queue-"+q); 

	// To remove the head of queue. 
	int removedele = q.remove(); 
	System.out.println("removed element-" + removedele); 
/*
Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
Returns:the head of this queueThrows:NoSuchElementException - if this queue is empty 
 */
	System.out.println(q); 

	// To view the head of queue 
	int head = q.peek(); 
	System.out.println("head of queue-" + head); 
	System.out.println("poll "+q.poll());
	/*
Retrieves and removes the head of this queue, or returns null if this queue is empty.
Returns:the head of this queue, or null if this queue is empty
	*/
	// Rest all methods of collection interface, 
	// Like size and contains can be used with this 
	// implementation. 
	int size = q.size(); 
	System.out.println("Size of queue-" + size); 
} 
} 
