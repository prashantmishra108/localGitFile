package chap3;

public class stringlength {
public static void main(String[] args) {
	String s= "hello world";
int x = s.length();
System.out.println("length of hello world = "+x);	
int [] a =  new int[10];
	//System.out.println("length parameter = "+a.length );
	for(int i=0;i<x;i+=2){
		System.out.println(s.charAt(i));
	}
	

}
}
