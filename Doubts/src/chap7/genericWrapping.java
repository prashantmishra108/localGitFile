package chap7;
import java.util.ArrayList;
import java.util.List;
public class genericWrapping {
public static void main(String[] args) {
	List<AA> listA = new ArrayList<AA>();//The Basic Generic 
	List<BB> listB = new ArrayList<BB>();//Collection Assignment Problem
	new genericWrapping().processElements(listA);//listA dont work only List <AA> works
	List<AA> listUknown0 = new ArrayList<? extends OO>();//Generic Wildcards
	List<BB> listUknown = new ArrayList<BB>();// Generic Wildcards
	List<? extends AA> listUknown2 = new ArrayList <OO>();//super class of AA dont work
	List<? super   AA> listUknown3 = new ArrayList<AA>();//BB or subclass of AA dont work
	List<? super   AA> listUknown4 = new ArrayList<OO>();//BB dont work
	new AA().processElements(listUknown);
	new AA().processElements(listUknown2);
	new AA().processElements(listUknown3);
	new AA().processElements(listUknown4);
	AA.insertElements(listUknown3);	}
public void processElements(List<AA> elements){
	   for(AA o : elements){
	      System.out.println(o.getValue());
	   }}}
 class AA extends OO {
	 public static void insertElements(List<? super AA> list){
		    list.add(new AA());list.add(new BB());list.add(new CC()); }
	 public char[] getValue() { return null;	}
	 public void processElements(List<? super AA> elements){
		   for(Object o : elements){ System.out.println(o); }}}
 class OO {}   class BB extends AA { }   class CC extends AA { }