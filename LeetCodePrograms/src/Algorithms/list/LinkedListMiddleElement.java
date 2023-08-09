package Algorithms.list;
//Java program to find middle of
//the linked list
public class LinkedListMiddleElement {
	// Head of linked list
	Node head;
	// Linked list node
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	// Function to print middle of
	// the linked list
	void printMiddle()
	{
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null)
		{
			while (fast_ptr != null &&
				fast_ptr.next != null)
			{
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle element is [" +
								slow_ptr.data + "]");
		}
	}

	// Inserts a new Node at front of the list.
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		// 3. Make next of new Node as head
		new_node.next = head;

		// 4. Move the head to point to new Node
		head = new_node;
	}

	// This function prints contents of linked list
	// starting from the given node
	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	// Driver code
	public static void main(String [] args)
	{
		LinkedListMiddleElement llist = new LinkedListMiddleElement();
		for (int i = 6; i > 0; --i)
		{
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}
	}
}
//This code is contributed by Rajat Mishra
