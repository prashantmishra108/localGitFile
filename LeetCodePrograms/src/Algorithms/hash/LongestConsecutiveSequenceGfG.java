package Algorithms.hash;

import java.util.HashSet;

public class LongestConsecutiveSequenceGfG {
	// Returns length of the longest
	// consecutive subsequence
	static int findLongestConseqSubseq(int arr[], int n)
	{
		HashSet<Integer> S = new HashSet<Integer>();
		int ans = 0;

		// Hash all the array elements
		for (int i = 0; i < n; ++i)
			S.add(arr[i]);

		// check each possible sequence from the start
		// then update optimal length
		for (int i = 0; i < n; ++i)		//{ 1, 9, 3, 10, 4, 20, 2 };
		{
			// if current element is the starting
			// element of a sequence
			if (!S.contains(arr[i] - 1))
			{
				// Then check for next elements
				// in the sequence
				int j = arr[i];
				while (S.contains(j))
					j++;

				// update optimal length if this
				// length is more
				if (ans < j - arr[i])
					ans = j - arr[i];
			}
		}
		return ans;
	}

	// Driver Code
	public static void main(String args[])
	{
		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		int n = arr.length;
		System.out.println(
			"Length of the Longest consecutive subsequence is "
			+ findLongestConseqSubseq(arr, n));
	}
}
/*
 * Complexity Analysis:
 * 
 * Time complexity: O(n). Only one traversal is needed and the time complexity
 * is O(n) under the assumption that hash insert and search take O(1) time.
 * Auxiliary space: O(n). To store every element in hashmap O(n) space is needed
 * Thanks to Gaurav Ahirwar for the above solution.
 */
