package walmart;
//https://www.geeksforgeeks.org/find-number-contain-digit-d/
// Java program to print the number which
// contain the digit d from 0 to n
public class NumberContainsADigit {
		// Returns true if d is present as digit
		// in number x.
		static boolean isDigitPresent(int x, int d)
		{
			// Break loop if d is present as digit
			while (x > 0)
			{
				if (x % 10 == d)
					break;

				x = x / 10;
			}

			// If loop broke
			return (x > 0);
		}

		// function to display the values
		static void printNumbers(int n, int d)
		{
			// Check all numbers one by one
			for (int i = 0; i <= n; i++)

				// checking for digit
				if (i == d || isDigitPresent(i, d))
					System.out.print(i + " ");
		}


		// Driver code
		public static void main(String[] args)
		{
			int n = 47, d = 7;
			printNumbers(n, d);
		}
	}
