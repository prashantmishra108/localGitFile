package wellsFargo;

public class CreateSingleton1 {
public static void main(String[] args) {
	Singleton1 s1 = Singleton1.singleton;
	Singleton1 s2 = Singleton1.singleton;
	s1.addOne();
	System.out.println(s1.a);
	System.out.println(s2.a);
}
}
