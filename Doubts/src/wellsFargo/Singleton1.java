package wellsFargo;

public class Singleton1 {
	public static final Singleton1 singleton = new Singleton1();
	int a = 5;
	void addOne() {
		++a;
	}
}
