package practice;

public class MinimumRotation {
	public static void main(String[] args) {
		String string = "1234";
		String check = "1234";
		String dum;
		for (int r = string.length() - 1; r >= 0; r--) { 
			// checking the input after each rotation
			dum =  string.substring(r, string.length()) + string.substring(0, r) ;
			// following if statement checks if input is
			// equals to check , if yes it will print r and
			// break out of the loop
			if (check.equals(dum)) {
				System.out.println((string.length()- r)%4);
				break;
			}
		}
	}
}
