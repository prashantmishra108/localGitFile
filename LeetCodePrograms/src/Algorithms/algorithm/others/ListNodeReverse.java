package Algorithms.algorithm.others;

public class ListNodeReverse {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		ListNode head = node;
		node.next=new ListNode(2);
		node.next.next=new ListNode(3);
		ListNode prev =null;
		/*
		 * while(head!=null) { ListNode nextnode=head.next; head.next=prev; prev=head;
		 * head=nextnode; }
		 */
		ListNode x = null;
		while(head!=null) {
			x=head.next;
			x.next=head;
			head=x;
		}
		while(x!=null) {
			System.out.println(x.val);
			x =x.next;
		}
		while(prev!=null) {
			System.out.println(prev.val);
			prev =prev.next;
		}
	}
}

