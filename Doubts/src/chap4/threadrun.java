package chap4;

public class threadrun extends Thread{
String s="name";
public threadrun(String str){
	s = str;
}static  int a=1;
	public  void run(){;a++;;
	System.out.println("run = "+a);a++;System.out.println(a);
}
public static void main(String[] args) {
	new threadrun("thread1").start() ;
	new threadrun("t2").start();a++;
	System.out.println("last");
}
}
/*below was o/p when start() is used instead of run().with run o/p is normal
last
run = 1
run = 1
3
2
*/