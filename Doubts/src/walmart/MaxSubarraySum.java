package walmart;
public class MaxSubarraySum {
	// Function to find maximum sum submatrix
	static void maxSubmatrixSum(int[][] matrix)
	{

		// Stores the number of rows
		// and columns in the matrix
		int r = matrix.length;
		int c = matrix[0].length;

		// Stores maximum submatrix sum
		int maxSubmatrix = 0;

		// Take each row as starting row
		for (int i = 0; i < r; i++) {
			System.out.println("i="+i); //when i=0, k=0123 ,i=1 k=123, i=2 k=23
			// Take each column as the starting column
			for (int j = 0; j < c; j++) {

				// Take each row as the ending row
				for (int k = i; k < r; k++) {

					System.out.println("K="+k);
					// Take each column as
					// the ending column
					for (int l = j; l < c; l++) {

						// Stores the sum of submatrix
						// having topleft index(i, j)
						// and bottom right index (k, l)
						int sumSubmatrix = 0;

						// Iterate the submatrix
						// row-wise and calculate its sum
						for (int m = i; m <= k; m++) {
							
							for (int n = j; n <= l; n++) {
								sumSubmatrix += matrix[m][n];
							}
						}
					
						// Update the maximum sum
						maxSubmatrix
							= Math.max(maxSubmatrix,
								sumSubmatrix);
					}
				}
			}
		}

		// Print the answer
		System.out.println(maxSubmatrix);
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[][] matrix = { { 0, -2, -7, 0 },
									{ 9, 2, -6, 2 },
									{ -4, 1, -4, 1 },
									{ -1, 8, 0, -2 } };

		maxSubmatrixSum(matrix);
	}
	}

	// This code is contributed by susmitakundugoaldanga.
