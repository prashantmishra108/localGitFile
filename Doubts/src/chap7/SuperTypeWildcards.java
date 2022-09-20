package chap7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SuperTypeWildcards {
public static void main(String[] args) {
	List <? super Apple> appList = new ArrayList<>();
	writeTo(appList );
}	
static void writeTo (List<? super Apple> apples) {
apples.add(new Apple());
apples.add(new Jonathan());
System.out.println(apples.toArray());
//apples.add(new Orange());
//apples.add(new Object());
//apples.add(new Fruit()); // Error
}
}
//: generics/CovariantArrays.java
class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}
