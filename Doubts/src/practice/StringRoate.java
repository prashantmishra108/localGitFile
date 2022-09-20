package practice;
// A simple Java program to generate all rotations
// of a given string
public class StringRoate {
		// Print all the rotated string.
		static void printRotatedString(String str)
		{
			int n = str.length();
		
			StringBuffer sb = new StringBuffer(str);
			// Concatenate str with itself
			sb.append(str);
		
			// Print all substrings of size n.
			// Note that size of sb is 2n
			StringBuilder s = new StringBuilder();
			for (int i = 0; i < n; i++)
			{	
				for (int j=0; j != n; j++) {
					s = s.append(sb.charAt(i + j));
					System.out.print(sb.charAt(i + j));
				}
				System.out.println(); 
				System.out.println(s); 
				s =new StringBuilder();
			}
		}
		
		// Driver method
		public static void main(String[] args)
		{
			String str = new String("geeks");
			printRotatedString(str);
		}
	}
