package chap5;

public class staticvar {
static int a = 5;
static {System.out.println("a= "+a);a++;}
static int b=3;
static {System.out.println(a+b+" = a+b");}
static{System.out.println(a);a=9;}
public static void main(String[] args) {
	System.out.println("a = "+a);
}
static{a=10;}
}
