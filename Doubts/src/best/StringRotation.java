package best;

//Java program to check if two given strings are
//rotations of each other

public class StringRotation {

	/* Function checks if passed strings (str1 and str2)
	are rotations of each other */
	static boolean areRotations(String str1, String str2)
	{
		// There lengths must be same and str2 must be
		// a substring of str1 concatenated with str1.
		return ( str1.length() == str2.length() ) &&
			((str1 + str1).contains(str2));
	}

	// Driver method
	public static void main(String[] args)
	{
		String str1 = "AACD";  
							//ACDA
							//CDAA
							//DAAC
							//AACD  //AACDAACD  1234-1234
		String str2 = "ACDA";

		if (areRotations(str1, str2))
			System.out.println("Yes");
		else
			System.out.printf("No");
		
		char a[] = new char[] {'a','b','c','d'};
		System.out.println( String.valueOf(a) );
	
	}


}
