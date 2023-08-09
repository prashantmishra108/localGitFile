package Algorithms.list;

import Algorithms.algorithm.others.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * 
 * Remove Duplicates from Sorted List II Total Accepted: 21701 Total Submissions: 87380 My Submissions
   Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

   For example,
   Given 1->2->3->3->4->4->5, return 1->2->5.
   Given 1->1->1->2->3, return 2->3.
 */
public class DeleteDuplicates2 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode head = l1;
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		head = deleteDuplicates(head);
	//	while(head!=null) {
			System.out.println(head+"->");
		//	head = head.next;
	//	}
	}
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        
        // record the head.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode cur = dummy;
        
        // to delete the last node in the list of duplications.
        boolean del = false;
        //cur = 0 1 1 2 3 4 
        while (cur != null) {
            if (cur.next != null
                && cur.next.next != null
                && cur.next.val == cur.next.next.val) {
                cur.next = cur.next.next;
                del = true;
            } else {
                // delete the last node in a duplicaions list.
                if (del) {
                    cur.next = cur.next.next;
                    
                    // set back the flag to be false.
                    del = false;
                } else {
                    // move forward.
                    cur = cur.next;
                }
            }
        }
        
        return dummy.next;
    }
}