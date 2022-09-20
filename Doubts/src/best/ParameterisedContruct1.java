package best;

//filename: Test2.java
class Test11 {
	Test11() {
		System.out.println("Test1");
	}

	Test11(int x) {
		System.out.println("Constructor called " + x);
	}
}

//This class contains an instance of Test1 
class ParameterisedContruct1 {
	Test11 t1 = new Test11(10);
//https://www.tutorialspoint.com/what-is-the-order-of-execution-of-non-static-blocks-with-respect-to-a-constructor-in-java
	
	ParameterisedContruct1(int i) {
		t1 = new Test11(i);
	}

	public static void main(String[] args) {
		System.out.println("Syso");
		ParameterisedContruct1 t2 = new ParameterisedContruct1(5);
	}
}