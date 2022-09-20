package best;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

public class HashCodeForAnagram {

	public static void main(String[] args) {
	String s = "act";int sum=0;
	for(int i=0;i<s.length();i++){
		sum = sum+Integer.valueOf(s.charAt(i));
	}
	System.out.println(sum);
	Integer [] prime =  new Integer[10];
	BigInteger j ;int a=0;
	for(int i=0;i<Integer.MAX_VALUE;i++){
		if(BigInteger.valueOf(i).isProbablePrime(i)){
			prime[a++]=i;
		}
		if(a==10)break;
	}
	System.out.println(Arrays.asList(prime).toString());
}
}
