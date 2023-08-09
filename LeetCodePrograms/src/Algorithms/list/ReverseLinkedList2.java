package Algorithms.list;

import Algorithms.algorithm.others.ListNode;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        ReverseLinkedList2 rLL = new ReverseLinkedList2();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode n =  rLL.reverseBetween(head, 2, 4);
        System.out.println(n);
    }
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        
        if (head.next == null) {
            return head;
        }
        
        ListNode dumyNode = new ListNode(0);
        dumyNode.next = head;
        
        ListNode tmpHead = dumyNode;
        
        // get the head before the reverse list;
        for (int i = m; i > 1; i--) { //m=2
            tmpHead = tmpHead.next;
        }
      
        
        // store the pre pointer
        ListNode pre = null;
        ListNode pst = tmpHead.next;
        
        // store the head for later use.
        ListNode reverseHead = pst;
        
        // reverse the specific linked list.
        for (int i = 0; i < n - m + 1; i++) {
        	System.out.println(" i="+i);
            ListNode tmp = pst.next;
            pst.next = pre;
            System.out.println("pst.next="+pst.next);
            pre = pst;
            System.out.println("pre="+pre);
            pst = tmp;
            System.out.println("pst="+pst);
            System.out.println();
        }
        
        tmpHead.next = pre;
        reverseHead.next = pst;
        
        if (m > 1) {
            return head;    
        } else {
            return pre;
        }
        
    }

}
