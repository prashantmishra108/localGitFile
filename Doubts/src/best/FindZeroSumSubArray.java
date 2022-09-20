package best;

import java.util.Arrays;
import java.util.HashMap;

public class FindZeroSumSubArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 1,55,2,-5,1,2,-1 };//{ 1, 2, -2, 1, 3,-3, -1 }
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 2)));
		int result[] = new int[8];
		result = zeroSum(arr);
		System.out.println(Arrays.toString(result));
	}

	// zeroSum={1,2,-5,1,2,-1}={2,-5,1,2}
	// {1, 2,-5,1, 2, -1}
	// 0 1 3 -2 -1 1 0
	public static int[] zeroSum(int arr[]) {
		HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			Integer oldIndex = sums.get(sum);
			if (oldIndex == null) {
				sums.put(sum, i);
				sum += arr[i];
			} else {
				return Arrays.copyOfRange(arr, oldIndex, i);
			}
		}
		return null;
	}
}
