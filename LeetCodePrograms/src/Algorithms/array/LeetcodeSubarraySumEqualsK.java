package Algorithms.array;

import java.util.HashMap;

public class LeetcodeSubarraySumEqualsK {
 
	public static void main(String[] args) {
		int arr[]= {1,3,1};
		int k=2;
		subArraySum(arr,k);
	}
	
	static void subArraySum(int []nums,int k) {
		HashMap<Integer,Integer>arr_sums = new HashMap();
		arr_sums.put(0,1);
		int sum=0,result=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			if(arr_sums.containsKey(sum-k)) {
				result +=arr_sums.get(sum-k);
			}
			arr_sums.put(sum, arr_sums.getOrDefault(sum, 0)+1);
		}
		
		System.out.println(result);
	}
}
