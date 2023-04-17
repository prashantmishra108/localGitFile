package best;

import java.util.HashMap;

public class SubarraySumEqualsK {
	
	public static void main(String[] args) {
		int []nums= {1,1,1,1,1};int k=3;
		HashMap<Integer,Integer> arr_sums = new HashMap();
		arr_sums.put(0,1);
		int sum=0,result=0;
		for(int i =0;i<nums.length;i++) {
			sum=sum+nums[i];
			
			if(arr_sums.containsKey(sum-k))
				result = result+arr_sums.get(sum-k);
			
			arr_sums.put(sum,arr_sums.getOrDefault(sum, 0)+1);
		}
		System.out.println(result);
	}
}
