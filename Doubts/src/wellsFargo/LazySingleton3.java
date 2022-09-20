package wellsFargo;

public class LazySingleton3 {
 private static LazySingleton3 lazySingleton3; 
 private LazySingleton3() {}
 int a=5;
 public static LazySingleton3 getInstance() {
	 if(lazySingleton3!=null) {
		 return lazySingleton3;
	 }else {
		 lazySingleton3 = new LazySingleton3();
		 return lazySingleton3;
	 }
 }
 public void add() {
	 ++a;
	 System.out.println(a);
 }
}
