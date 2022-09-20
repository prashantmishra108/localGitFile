package dataStructure;

/*Methods in Queue:

add()- This method is used to add elements at the tail of queue. More specifically, at the last of linked list if it is used, or according to the priority in case of priority queue
 implementation.
peek()- This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
remove()- This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is impty.
poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.
size()- This method return the no. of elements in the queue.
/*ww  w  .j a v a  2  s .c om*/
class Queue {
	private int maxSize;

	private int[] queArray;

	private int front;

	private int rear;

	private int nItems;

	public Queue(int s) {
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int j) {
		if (rear == maxSize - 1)
			rear = -1;
		queArray[++rear] = j;
		nItems++;
	}

	public int remove() {
		int temp = queArray[front++];
		if (front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}

	public int peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int size() {
		return nItems;
	}
}

public class CustomQueue {
	public static void main(String[] args) {
		Queue theQueue = new Queue(5); // queue holds 5 items
		theQueue.insert(10); // insert 4 items
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		/*theQueue.insert(50);
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		*/
		
		theQueue.remove(); // remove 3 items
		theQueue.remove(); // (10, 20, 30)
		theQueue.remove();

		theQueue.insert(50); // insert 4 more items
		theQueue.insert(60); // (wraps around)
		theQueue.insert(70);
		theQueue.insert(80);

		while (!theQueue.isEmpty()) { // all items
			int n = theQueue.remove(); // (40, 50, 60, 70, 80)
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	}
}