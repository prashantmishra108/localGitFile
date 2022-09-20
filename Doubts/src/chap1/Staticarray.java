package chap1;

public class Staticarray {
 static  int arrayy[] = new int[10];
 static int i ;
 int aa=a;
 static{i=2;System.out.println("static1 i="+i);}
 static int a=i;
 public Staticarray(){aa=i;System.out.println("aa="+aa);a=i;}
public static void main(String[] args) {
	int j;i=9;
	new Staticarray();
	System.out.println("i="+i);
	//System.out.println(arrayy.length);
	System.out.println("a="+a);
	//System.out.println("aa="+aa);
}
}
