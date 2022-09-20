package walmart;

// Java program for the above approach
import java.util.*;

public class KthLargest {
	static int[] kthLargest(int k, int arr[], int n) {
		int[] ans = new int[n];
// 4, 5, 6,1, 2, 3
		// Creating a min-heap using priority queue k, arr, n , 4 arr 6
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

		// Iterating through each element [1, 2, 3, 4, 5, 6]
		for (int i = 0; i < n; i++) {

			// If size of priority
			// queue is less than k
			if (pq.size() < k)
				pq.add(arr[i]);
			else {
				if (arr[i] > pq.peek()) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
			// If size is less than k  - k, arr, n
			if (pq.size() < k)
				ans[i] = -1;
			else
				ans[i] = pq.peek();
		}
		return ans;
	}
	// Driver Code
	public static void main(String[] args) {
		int n = 6;
		int arr[] = {  4, 5, 6,1, 2, 3 };//4, 5, 6,1,3,2 gives same output
		int k = 4;
		// Function call
		int[] v = kthLargest(k, arr, n);
		for (int it : v)
			System.out.print(it + " ");
	}
}
// This code is contributed by shikhasingrajput
