package best;

public class PalindromeCheck {
public static void main(String[] args) {
	
	String toCheck = "b aaB".toLowerCase();
	int left = 0;
	int right = toCheck.length()-1;
	while(left<=right){
		while(left<toCheck.length() && !Character.isLetter(toCheck.charAt(left))){
			left++;
		}
		while(right>toCheck.length() && !Character.isLetter(toCheck.charAt(right))){
			right--;
		}
		if(left>toCheck.length() || right<0)
			break;
		System.out.println(toCheck.charAt(left)+" "+toCheck.charAt(right));
		if(toCheck.charAt(left)!=toCheck.charAt(right)) {
			System.out.println("not palindrome");
			break;
		}
		left++;
		right--;
	}
	
	System.out.println("left"+left+" right"+right);
}
}
