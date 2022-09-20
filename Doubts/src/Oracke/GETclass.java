package Oracke;

import java.util.ArrayList;
import java.util.List;

public class GETclass {
	public static void main(String[] args) {
		List<String> someListImplementation = new ArrayList<String>();
		System.out.println(someListImplementation.getClass().getName());
		//Object obj = "A String";
		Object obj = 2.0;
		System.out.println("OBJECT = "+obj.getClass());
		bar(someListImplementation); 
		foo("helloGoodMorning");
		
	}
static <T> void bar(T t) {
    try {
        Class<? extends Object> clazz = t.getClass();
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.getModifiers());
        System.out.println(clazz.getClass());
		System.out.println(clazz.getCanonicalName());
		System.out.println(clazz.getSimpleName());
        
    } catch (Exception e) {
  }
}
//static void foo(String s) {
static <T> void foo(T s) {
    try {
       // Class<? extends String> clazz = s.getClass();
    	 Class<? extends Object> clazz = s.getClass();
    } catch (Exception e) {
 }
}
}
/*
java.util.ArrayList
OBJECT = class java.lang.Double
null
1
class java.lang.Class
java.util.ArrayList
ArrayList
*/