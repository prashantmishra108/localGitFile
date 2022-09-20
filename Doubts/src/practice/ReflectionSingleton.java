package practice;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException  {

        Singleton objOne=null;
		try {
			objOne = Singleton.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
        Singleton objTwo = null;
        try {
            Constructor constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            objTwo = (Singleton) constructor.newInstance();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
        System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());

      }
}   
