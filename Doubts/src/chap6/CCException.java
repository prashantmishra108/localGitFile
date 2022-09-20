package chap6;

import java.util.Vector;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
public class CCException {
public static void main(String[] s) {
	Vector <A> obj = new Vector<A>();
	obj.add(new B());
	obj.add(new C());
	//C cobj = obj.get(1);//cast to C cl]ass..it do not throws any CCException
}
}
