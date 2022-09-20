package walmart;

import java.util.*;

public class KthSmallestII {
	/*
	 * the following code demonstrates how to find kth smallest element using set
	 * from Java Collections
	 */

	public static void main(String[] args) {
		int[] arr = { 12, 3, 5, 7, 19 };
		int n = arr.length;
		int k = 0;

		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < n; i++)
			s.add(arr[i]);

		Iterator<Integer> itr = s.iterator();
		while (k > 0) {
			itr.next();
			k--;
		} // itr points to the kth element in the set
		System.out.println(itr.next());
	}
}

// This code is contributed by Abhijeet Kumar(abhijeet19403)
