package chap3;

public class spliter {
public static void main(String[] args) {
	String text = "using plit ?method with delimiting characters";
	String [] word = text.split("[, .]");
	System.out.println(word.length);
	for(String s:word){
		System.out.println(s);
	}
	
}
}
