package best;

import java.util.Scanner;

public class ImplementStack {

	public static void main(String[] args) {
	  stack obj = new stack();
	  obj.push(10);
	  obj.push(20);
	  obj.push(30);
	  obj.peek();
	  obj.pop();
	  obj.peek();
	/*	Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		System.out.println("stack length is="+len);
		System.out.println("operation 1 for push, 2 for pop, 3 for peek");
		int option = scan.nextInt();
		switch (option) {
			case 1: ; 
		}
		for(int i=0;i<len;i++) {
		new stack().push(scan.nextInt());
		}*/
	}
}

class stack {
	int len=4;
	int [] arr = new int[4];
	int head=-1,rear=0,count=0;
	public void push(int element) {
		if( head == len-1 ) {
			System.out.println("stack is full");
		} else { 
			count++;
			arr[++head]= element;
		}
	}
	public void pop() {
		if(head==0) {
			System.out.println("stack is empty ");
		}else {
			count--;
			head=head-1;
		}
	}
	public void peek() {
		if(head != 0) {
			System.out.println(" Top element is A[head]="+arr[head]);
		}
	}
}