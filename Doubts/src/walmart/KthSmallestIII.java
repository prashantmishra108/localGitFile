package walmart;

public class KthSmallestIII {
	static int count(int[] nums, int mid) {
		// function to calculate number of elements less than equal to mid
		int cnt = 0;

		for (int i = 0; i < nums.length; i++)
			if (nums[i] <= mid)
				cnt++;

		return cnt;
	}

	static int kthSmallest(int[] nums, int k) {
		int lowerValue = Integer.MAX_VALUE;
		int higherValue = Integer.MIN_VALUE;
		// calculate minimum and maximum the array.
		for (int i = 0; i < nums.length; i++) {
			lowerValue = Math.min(lowerValue, nums[i]);
			higherValue = Math.max(higherValue, nums[i]);
		}
		// Our answer range lies between minimum and maximum element of the array on
		// which Binary Search is Applied
		while (lowerValue < higherValue) {
			int mid = lowerValue + (higherValue - lowerValue) / 2;
			/*
			 * if the count of number of elements in the array less than equal to mid is
			 * less than k then increase the number. Otherwise decrement the number and try
			 * to find a better answer.
			 */
			System.out.println("low=" + lowerValue + " high=" + higherValue + " mid=" + mid + " count(nums, mid)=" + count(nums, mid)
					+ " k=" + k);
			if (count(nums, mid) < k)
				lowerValue = mid + 1;
			else
				higherValue = mid;
		}

		return lowerValue;
	}

	// Driver program to test above methods
	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 3, 19, 3 };
		int k = 6;
		System.out.print("Kth smallest element is " + kthSmallest(arr, k));
	}
}

// This code is contributed by CodeWithMini
