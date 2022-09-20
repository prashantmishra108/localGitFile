package Oracke;

class superclass{
	int a;
	String s="hi";
}
class derivedclass extends superclass{
	int a;
	 String  s = "Hi";
}
public class stringgetclass {

	
	public static void main(String[] args) {
	
		Object obj = new Object();
		superclass sobj = new superclass();
		superclass bobj = new derivedclass();
		System.out.println(bobj.s.getClass());
		Class cls = bobj.s.getClass();
		System.out.println(bobj);
		System.out.println(cls instanceof Object);
		System.out.println(obj instanceof superclass);
		System.out.println(bobj instanceof superclass);
		System.out.println(bobj instanceof derivedclass);
		System.out.println(sobj instanceof superclass);
		System.out.println(sobj instanceof derivedclass);

	}
}
