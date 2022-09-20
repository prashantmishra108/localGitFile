package practice;

public class ReflectionSingleton2 {

	public static void main(String[] args) throws Exception {
		
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1
				);
		
		Class<Singleton> singletonClass;
	      Singleton objOne=null;
	      Singleton objTwo = null;
			try {
				try {
					objOne = Singleton.getInstance();
				} catch (Exception e) {
					e.printStackTrace();
				}
				singletonClass = (Class<Singleton>) Class.forName("Singleton");
				Singleton singletonReflection = singletonClass.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		      System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
		        System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());


	}
}
