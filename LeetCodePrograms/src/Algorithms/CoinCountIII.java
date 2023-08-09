package Algorithms;
//https://www.geeksforgeeks.org/coin-change-dp-7/
/*Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn�t matter.
For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.
*/
/* Dynamic Programming Java implementation of Coin
Change problem */
import java.util.Arrays;

public class CoinCountIII {
	static long countWays(int S[], int m, int n) {
		// Time complexity of this function: O(mn)
		// Space Complexity of this function: O(n)

		// table[i] will be storing the number of solutions
		// for value i. We need n+1 rows as the table is
		// constructed in bottom up manner using the base
		// case (n = 0)
		long[] table = new long[n + 1];

		// Initialize all table values as 0
		Arrays.fill(table, 0); // O(n)

		// Base case (If given value is 0)
		table[0] = 1;

		// Pick all coins one by one and update the table[]
		// values after the index greater than or equal to
		// the value of the picked coin
		for (int i = 0; i < m; i++)
			for (int j = S[i]; j <= n; j++) {
				System.out.println("j="+j+"  S["+i+"]="+S[i]+" (j-S[i])="+(j-S[i]));
				table[j] += table[j - S[i]];
				System.out.println("table["+j+"]="+table[j]+" ");
			}
		return table[n];
	}

	// Driver Function to test above function
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		int m = arr.length;
		int n = 4;
		System.out.println(countWays(arr, m, n));
	}
}
// This code is contributed by Pankaj Kumar
