package chap3;

public class Sbuffer {
public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer("hello");
	System.out.println("sb1 old address= "+sb1.hashCode());
	StringBuffer sb2 = new StringBuffer("hello");
	//sb1.append(sb2);//new StringBuffer("bye");
	System.out.println("sb1 new address= "+sb1.hashCode());
	System.out.println(sb1==sb2);
	System.out.println(sb1.equals(sb2));
	String s1=new String("Harinath");
	System.out.println("s1 : "+s1);
	System.out.println("s1 address : "+s1.hashCode());
	String s2=new String("Harinath");
	//s1=s1.concat(s2);
	System.out.println("s1 : "+s1);
	System.out.println("s2 address : "+s2.hashCode());
	System.out.println(s1.equals(s2));
}
}
