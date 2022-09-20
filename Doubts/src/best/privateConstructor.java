package best;

//a class with private constructor cant create its object
public class privateConstructor extends privateBaseCont {
	private privateConstructor(int i) {
	}

	public static void main(String[] args) {
		new privateConstructor(4);
		// new privateCont(4);
	}
}

class privateBaseCont {
//	public privateBaseCont() { System.out.println("publicbase"); }
	private privateBaseCont() {
	}

	public privateBaseCont(int a) {
		System.out.println("privatebase");
	}
}

class publicCont {
	public publicCont(int a) {
	}
}
/*
 * Firstly some terminology:
 * 
 * No-args constructor: a constructor with no parameters; Accessible no-args
 * constructor: a no-args constructor in the superclass visible to the subclass.
 * That means it is either public or protected or, if both classes are in the
 * same package, package access; and Default constructor: the public no-args
 * constructor added by the compiler when there is no explicit constructor in
 * the class. So all classes have at least one constructor.
 * 
 * Subclasses constructors may specify as the first thing they do which
 * constructor in the superclass to invoke before executing the code in the
 * subclass's constructor.
 * 
 * If the subclass constructor does not specify which superclass constructor to
 * invoke then the compiler will automatically call the accessible no-args
 * constructor in the superclass.
 */