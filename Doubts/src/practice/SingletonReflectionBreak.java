package practice;

import java.lang.reflect.Constructor;

public class SingletonReflectionBreak {
	public static void main(String[] args) throws Exception {
		Singleton ins = Singleton.getInstance();
		Singleton ins2 = null;
		try {
			Constructor[] con = Singleton.class.getDeclaredConstructors();
			for(Constructor r :con) {
				r.setAccessible(true);
				ins2 = (Singleton)r.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println( ins.hashCode() );
		System.out.println( ins2.hashCode() );
	}
}
/*
 
 
getDeclaredConstructors() throws SecurityException
@CallerSensitive
Returns an array of Constructor objects reflecting all the constructors declared 
by the class represented by this Class object. These are public, protected, default
 (package) access, and private constructors. The elements in the array returned are
  not sorted and are not in any particular order. If the class has a default 
  constructor, it is included in the returned array. This method returns an array of
   length 0 if this Class object represents an interface, a primitive type, an array
    class, or void. 
 
  
getConstructors() throws SecurityException
@CallerSensitive
Returns an array containing Constructor objects reflecting all the public 
constructors of the class represented by this Class object. 
An array of length 0 is returned if the class has no public constructors, 
or if the class is an array class, or if the class reflects a primitive type or void. 
Note that while this method returns an array of Constructor<T> objects 
(that is an array of constructors from this class), the return type of this method is 
Constructor<?>[] and not Constructor<T>[] as might be expected. 
This less informative return type is necessary since after being returned from
 this method, the array could be modified to hold Constructor objects for 
 different classes, which would violate the type guarantees of Constructor<T>[].

 */
