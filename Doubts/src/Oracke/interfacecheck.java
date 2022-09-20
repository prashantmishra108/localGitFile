package Oracke;

interface abcd{String type="String";String abcd=new String();String abc=new String();}
public class interfacecheck extends protectedcheck{
public static void main(String[] args) {
//	abcd.abcd = "hi";
	System.out.println(abcd.type);
	System.out.println("1 = "+abcd.abcd);
	System.out.println("two =" +abcd.abcd == abcd.abc);System.out.println("2"+abcd.abcd == abcd.abc);
	String a = null;String b = null;
System.out.print("third = ");	System.out.println("3 "+a==b);
	System.out.print("four = ");//System.out.println("4"+b.equals(a));
	System.out.println("line change"+"");
	int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;// - - is +
	System.out.println(i);
	//System.out.println(new interfacecheck().a);
}
}

class protectedcheck{
	protected int a=90;
}
