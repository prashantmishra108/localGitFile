package wellsFargo;
//i wrote this in wells fargo interview
public class LazySingleton1 {
	private static LazySingleton1 lazySingleton;
	private LazySingleton1() {
		if(lazySingleton!=null) {
			return lazySingleton;
		}else {
			lazySingleton = new LazySingleton1();
			return lazySingleton;
		}
	}
}
