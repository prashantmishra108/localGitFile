package Algorithms.list;
//nt working
import Algorithms.algorithm.others.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//nt working
public class DetectCycle {
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l1;
		ListNode head = l1;
		System.out.println(detectCycle(head));
		
	}
	
    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode s = head;
        ListNode f = head;
        
        ListNode cross = null;
        
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            
            if (s == f) {
                cross = s;
                
                // remember to break here, or you will get a loop.
                break;
            }
        }
        
        // don't detect any cycle.
        if (cross == null) {
            return null;
        }
        
        // place the slow to the start again.
        s = head;
        while (true) {
            if (s == f) {
                return s;
            }
            
            s = s.next;
            f = f.next;
        }
    }
}