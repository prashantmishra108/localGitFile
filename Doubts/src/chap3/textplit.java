package chap3;

import java.util.Arrays;

public class textplit {
public static void main(String[] args) {
	String s = "using split method, with .delimiters.,..d";
	String[] words = s.split("[d .  ,]");
	int len = words.length;
	System.out.println(len);
	//for(String a:words)
	//System.out.println(a);
	System.out.println(Arrays.toString(words));
//the full stops at the last are nt considered in Arrays
//becoz splitting are removing it.

}
}
