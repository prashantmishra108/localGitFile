package Algorithms.lintcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//question not found
public class MinSubArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(9);
		al.add(8);
		al.add(7);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(minSubArray(al));
	}

	/**
	 * @param nums: a list of integers
	 * @return: A integer indicate the sum of minimum subarray
	 */
	public static int minSubArray(ArrayList<Integer> nums) {
		// write your code
		int len = nums.size();
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (sum < 0) {
				sum = -nums.get(i);
			} else {
				sum += nums.get(i);
			}
			max = Math.max(max, sum);
		}
		return max;
	}
}
