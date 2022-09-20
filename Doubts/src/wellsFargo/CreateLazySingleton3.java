package wellsFargo;

public class CreateLazySingleton3 {
	public static void main(String[] args) {
		LazySingleton3 lazySingleton1 = LazySingleton3.getInstance();
		LazySingleton3 lazySingleton2 = LazySingleton3.getInstance();
		lazySingleton1.add();
		lazySingleton2.add();
	}
}
