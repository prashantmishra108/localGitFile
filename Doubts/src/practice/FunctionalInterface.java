package practice;

import java.util.function.Consumer;

public class FunctionalInterface {
 public static void main(String[] args) {
	abc obj = x->x>5;
	abc obj5 = x->x>6;
	System.out.println(obj.test(7));
	Consumer <Integer>  square = val->System.out.println(val*val);
	square.accept(5);
	acceptObject(obj);
 }
 static void acceptObject(abc ob){
	 System.out.println(ob.test(7));
 }
}

interface abc{
	abstract boolean test(int x);
}