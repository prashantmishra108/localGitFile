package Algorithms.array;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode_NextGreaterElementII {

	public static void main(String[] args) {
		
		int []nums = {4,3,1,1};
		int n = nums.length;
		int output[]=new int[n];
		Arrays.fill(output,-1);
		Stack<Integer> stack = new Stack();
		for(int i=0;i<n*2;i++) {
		 while(!stack.isEmpty() && nums[stack.peek()]<nums[i%n]) {
			 output[stack.pop()]=nums[i%n];
		 }
		 if(i<n)stack.push(i);
		}
		for(int i:output)
		System.out.print(i+" ");
	}
}
