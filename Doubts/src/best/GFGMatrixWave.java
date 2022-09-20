package best;

import java.io.*; 
public class GFGMatrixWave {
	// Java implementation to print 
	// reverse wave form of matrix 
		static int R = 4; 
		static int C = 4; 
		// function to print reverse wave 
		// form for a given matrix 
		static void WavePrint(int m, int n, int arr[][]) 
		{ 
			int i, j = n - 1, wave = 1; 
		
			// m- Ending row index 
			//n - Ending column index 
			//i, j	 - Iterator 
			//wave	 - for Direction 
			//wave = 1 - Wave direction down 
			//wave = 0 - Wave direction up */ 
			while (j >= 0) 
			{ 
				
				// Check whether to go in 
				// upward or downward 
				if (wave == 1) 
				{ 
					// Print the element of the matrix 
					// downward since the value of wave = 1 
					for (i = 0; i < m; i++) 
						System.out.print(arr[i][j] +" "); 
				
					wave = 0; 
					j--; 
				} 
				else { 
					
					// Print the elements of the 
					// matrix upward since the value 
					// of wave = 0 
					for (i = m - 1; i >= 0; i--) 
						System.out.print( arr[i][j] + " "); 
					
					wave = 1; 
					j--; 
				} 
			} 
		} 
		
		// Driver function 
		public static void main (String[] args) 
		{ 
			int arr[][] = { { 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16 } };			 
			WavePrint(R, C, arr); 
		
		} 
	} 

	// This code is contributed by vt_m 
