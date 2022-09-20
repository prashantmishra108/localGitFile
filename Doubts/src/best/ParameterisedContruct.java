package best;

//filename: Test2.java
class Test1 {
	Test1(int x) {
		System.out.println("Constructor called " + x);
	}
}

//This class contains an instance of Test1 
public class ParameterisedContruct {
	Test1 t1 = new Test1(10);
	{
		System.out.println("instance");
	}
	ParameterisedContruct(int i) {
		System.out.println("param cons");
		t1 = new Test1(i);
	}

	public static void main(String[] args) {
		System.out.println("main");
		ParameterisedContruct t2 = new ParameterisedContruct(5);
		ParameterisedContruct t3 = new ParameterisedContruct(15);
	}
}