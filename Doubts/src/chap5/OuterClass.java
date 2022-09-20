package chap5;
public class OuterClass {
static	int in=10;
class inner {
	int a=10; 
	private void sys() {
		System.out.println(in);
	}
}
public static class Static_Inn{ 
	int j=10; 
	public void Syso() {
	  in=5;	
	  System.out.println(in);	
    }
}
public static void main(String[] args) {
	new OuterClass.Static_Inn().j = 3;
	new OuterClass().new inner();
	new Static_Inn();
	new inner();
	/*https://stackoverflow.com/questions/1353309/java-static-vs-inner-class
	 * In case of declaring member fields and methods, non static inner class cannot have static fields 
	 * and methods. But, in case of static inner class, can have static and non static fields and method.
	 * The instance of non static inner class is created with the reference of object of 
	outer class, in which it has defined, this means it has enclosing instance. 
	But the instance of static innerclass is created wit hout the reference of Outer class, 
	which means it does not have enclosing instance*/
}
	public void init(){
		new OuterClass.inner().a=3;
	}
} 