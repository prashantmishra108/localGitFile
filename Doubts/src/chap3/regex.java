package chap3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class regex {

	public static void main(String[] args) {
		String s = "one 2 three 4 five";
		System.out.println("s = "+s);
		String []small_w = s.split("\\w");//small_w puts comma at each word except last word.
		System.out.println("small_w.length = "+small_w.length);//A word character [a-zA-Z_0-9]
		System.out.println("small_w = "+Arrays.toString(small_w));
		
		String []wplus = s.split("\\w+");//small w+ means removal of letters such as alphabets and nos...and only w mean putting comma at every word
		System.out.println("wplus.length = "+wplus.length);
		System.out.println("wplus = "+Arrays.toString(wplus));	
		
		String []W = s.split("\\W");//capital W means to be keeping with the words and putting commas in between
		System.out.println("W.length = "+W.length);//A non-word character [^\w]
		System.out.println("W = "+Arrays.toString(W));
				
	String []small_d=s.split("\\d");
	System.out.println("small_d.length = "+small_d.length);
	System.out.println("small_d = "+Arrays.toString(small_d));

	String []small_s = s.split("\\s");//
	System.out.println("small_s.length = "+small_s.length);
	System.out.println("small_s = "+Arrays.toString(small_s));
	
	String [] capital_S = s.split("\\S");
	System.out.println("capital_S.length = "+capital_S.length);
	System.out.println("capital_S = "+Arrays.toString(capital_S));
	}
	
}
