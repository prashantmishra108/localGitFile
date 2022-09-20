package practice;

public class PassByReferenceAndValue {
	public static void main(String[] args) {
	    Dog aDog = new Dog("Max");
	    Dog oldDog = aDog;

	    // we pass the object to foo
	   Dog returnedDog =  foo(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    System.out.println(aDog.getName().equals("Max")); // true
	    System.out.println(aDog.getName().equals("Fifi")); // false
	    System.out.println(aDog == oldDog); // true
	    System.out.println(oldDog.getName().equals("Fifi"));
	    System.out.println(returnedDog == oldDog);
	}

	public static Dog foo(Dog d) {
	    d.getName().equals("Max"); // true
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	    d = new Dog("Fifi");
	    d.getName().equals("Fifi"); // true
	    return d;
	}
}

class Dog{
	String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}