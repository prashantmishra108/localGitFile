//listnode sort mergesort
//https://www.youtube.com/watch?v=pNTc1bM1z-4
//LeetCode Sort List Explained - Java
public class ListNode {
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
	}
	public static void main(String[] args) {
		ListNode a = new ListNode(3);
		a.next = new ListNode(2);
		a.next.next = new ListNode(1);
		SortListSolution s = new SortListSolution();
		s.sortList(a);
		System.out.println(a.val);
	}
	
}

class SortListSolution {
	public ListNode sortList(ListNode head) {
		if(head==null || head.next==null)
		return head;
		ListNode temp=head;
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			temp=slow;
			fast=fast.next.next;
			slow=slow.next;
		}
		temp.next=null;
		ListNode leftside = sortList(head);//3-2
		ListNode rightside = sortList(slow);//1
		return mergesort(leftside,rightside);//2,1  3,1
	}
	public ListNode mergesort(ListNode l1,ListNode l2) {//2,1  3,1
		ListNode sortedtemp = new ListNode(0);
		ListNode currentnode = sortedtemp;
		while(l1!=null && l2!=null) {
			if(l1.val<l2.val) {
				currentnode.next=l1;
				l1=l1.next;
			}else {
				currentnode.next=l2;
				l2=l2.next;
			}
			currentnode = currentnode.next;
		}
		if(l1!=null) {
			currentnode.next=l1;
			l1=l1.next;
		}
		if(l2!=null) {
			currentnode.next=l2;
			l2=l2.next;
		}
		return sortedtemp.next;
	}

}
