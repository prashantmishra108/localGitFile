package Algorithms;

//https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/
public class CoinCountII {
//// A Dynamic Programming based Java program to find minimum of coins to make a given change V	
// m is size of coins array  (number of different coins)
	static int minCoins(int coins[], int m, int V) {
		// table[i] will be storing
		// the minimum number of coins
		// required for i value. So
		// table[V] will have result
		int table[] = new int[V + 1];

		// Base case (If given value V is 0)
		table[0] = 0;

		// Initialize all table values as Infinite //{9, 6, 5, 1,2} -1
		for (int i = 1; i <= V; i++)
			table[i] = Integer.MAX_VALUE;

		// Compute minimum coins required for all values from 1 to V
		for (int i = 1; i <= V; i++) {
			// Go through all coins smaller than i
			for (int j = 0; j < m; j++)
				if (coins[j] <= i) {
					int sub_res = table[i - coins[j]];
					if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
						table[i] = sub_res + 1;

				}

		} // {9, 6, 5, 1} -11

		if (table[V] == Integer.MAX_VALUE)
			return -1;

		return table[V];

	}

	// Driver program
	public static void main(String[] args) {
		// int coins[] = {9, 6, 5, 1,2};
		int coins[] = { 1, 2, 3 };
		int m = coins.length;
		int V = 4;// 21;
		System.out.println("Minimum coins required is " + minCoins(coins, m, V));
	}
}

//This Code is contributed by vt_m.
