package best;
public class bestchap5 extends parent {
	public bestchap5()
	{
		super();System.out.println("best chap5 i="+i+" super i="+super.i);//print();}
	}
	double i=Math.ceil(88.89);
public static void main(String[] fdhhhs) {
	String a="a";String b="b";String d=new String("e");
	d=a=b;b="c";	System.out.println(a+" "+d);
	a = new String("b");d= new String("b");
	System.out.println("a==d ="+(a==d));
	System.out.println("a.equals(d) ="+(a.equals(d)));
	StringBuffer s = new StringBuffer("helloSB");
	StringBuffer s1 = new StringBuffer("aloha");
	StringBuffer s2 = new StringBuffer("bonjour");
	s = s1=s2;
	//s1 = s1.append(a);
	System.out.println(s==s1);
	System.out.println(s);
	s =  new StringBuffer("helloSB");
	s1 =  new StringBuffer("helloSB");
	System.out.println("s==s1 ="+(s==s1));
	//equals method is not in string buffer hence it uses objects class's
	//equals method which checks for references instead of values.
	System.out.println("s.equals(s1) ="+(s.equals(s1)));
	
	
	
	bestchap5 obj = new bestchap5();
}
 void print(){ System.out.println("yes = "+i);}
}
class parent {
	double i=Math.ceil(10.89);
	public parent() {
		 System.out.println("parentConnstructor = "+this.i);print();
		}
	 void print(){
		System.out.println("parentprint");
	}
}