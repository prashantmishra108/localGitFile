package wellsFargo;

public class LazySingleton2 {
private static LazySingleton2 lazySingleton2;
private LazySingleton2() {}
public LazySingleton2 getInstance() {
	if(lazySingleton2!=null) {
		return lazySingleton2;
	}else {
		lazySingleton2=new LazySingleton2();
		return lazySingleton2;
	}
}
}
