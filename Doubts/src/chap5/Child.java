package chap5;
import chap4.*;
public class Child extends Parent {
	public Child(){System.out.println("Child");}
	//if parent class constrctr is package modifies then base 
	//class of other package cant access it
	public static void main(String[] args) {
	new Child();
}
	 public void print(){}//not restricting the access
}
