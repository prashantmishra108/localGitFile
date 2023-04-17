package best;

import java.util.HashMap;
import java.util.Stack;

public class NetGreaterElements {

	public static void main(String[] args) {
		
	int num1[]= {4,1,2}; //num2[]= {1,3,4,2};
	int num2[]= {4,3,2,1,5};	
	HashMap<Integer,Integer> next_greatest = new HashMap();	
	Stack<Integer> stack = new Stack();
	for(int i=0;i<num2.length;i++) {
		while(!stack.isEmpty() && stack.peek()<num2[i] ) {
			next_greatest.put(stack.pop(), num2[i]);
		}
		stack.push(num2[i]);
	}
	
	for(int i:num1) {
		System.out.println(next_greatest.get(i));
	}
  }
}
