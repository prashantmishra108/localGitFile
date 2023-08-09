package Algorithms.array;

import java.util.Stack;

public class LeetcodeDecodeStringSolution {

	public static void main(String[] args) {
		
		String s = "3[a]2[c]";
		Stack<Integer>counts = new Stack();
		Stack<String>result = new Stack();
		String res="";
		int index=0;
		while(index<s.length()) {
			if(Character.isDigit(s.charAt(index))) {
				//find the number  
				int count=0;
				while(Character.isDigit(s.charAt(index))) {
					count=10*count+ (s.charAt(index)-'0');
					index++;
				}
				counts.push(count);
			}else if(s.charAt(index)=='['){
				//move res string value to stack, empty the res string and
				//increment the index by 1.
				result.push(res);
				res="";
				index++;
			}else if(s.charAt(index)==']') {
				//pop result stack value, append it to res string count times.
				StringBuilder temp = new StringBuilder(result.pop());
				int num=counts.pop();
				while(num>0) {
					temp.append(res);
					num--;
				}
				res=temp.toString();
				index++;
			}else {
				//increment the index and add character into res string
				res+=s.charAt(index);
				//result.push(res);
				index++;
			}
		}
			
		System.out.println(res);
	}
	
}
