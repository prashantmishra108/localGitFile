package best;

import java.util.Arrays;

public class FindUniqueAmongDuplicates {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,3,1,5};
		int result=0;
		for (int i =0;i<a.length;i++) {
			result^=a[i];
		}
		System.out.println(result);
		//also
		System.out.println(new FindUniqueAmongDuplicates().findUnique(a));
	}
	
	public int findUnique(int[] nums) {
	    return Arrays.stream(nums)
	            .reduce((acc,i) -> acc ^= i)
	            .orElseThrow(IllegalArgumentException::new);
	}
}
