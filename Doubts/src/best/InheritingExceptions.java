package best;

//: exceptions/InheritingExceptions.java
//Creating your own exceptions.
class SimpleException extends Exception {
	void add() {
		System.out.println("hello");
	}
}

public class InheritingExceptions {
	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			e.add();
			System.out.println("Caught it!");
		}
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("Null pointer Caught it!");
		}
		System.out.println("bye");
	}
} /*
	 * Output: Throw SimpleException from f() Caught it!
	 */// :~