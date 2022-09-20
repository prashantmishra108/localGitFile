package Oracke;

import java.util.ArrayList;

public class Pair<X,Y>  {  
	  private X first; 
	  private Y second;
	  public Pair(X a1, Y a2) { 
	    first  = a1; 
	    second = a2; 
	  } 
	  public X getFirst()  { return first; } 
	  public Y getSecond() { return second; } 
	  public void setFirst(X arg)  { first = arg; } 
	  public void setSecond(Y arg) { second = arg; } 
public static void main(String[] args) {
	ArrayList<Pair<Integer,Integer>> intPairArr = new ArrayList<Pair<Integer,Integer>>(10) ;
	//Pair<Integer,Integer>[] intPairArr = new Pair<Integer,Integer>[10];
	//Object[] objArr = intPairArr; 
	Pair<String, String>[] intPairAr1 = createArrayOfStringPairs();
	System.out.println(intPairAr1[0].first);


}	
static Pair<String,String>[] createArrayOfStringPairs() { 
	  Pair<String,String>[] arr = new Pair[2]; 
	  arr[0] = new Name("Angelika","Langer");   // fine 
	 
	  
	  arr[1] = new Pair<String,String>("a","b");  // fine (causes ArrayStoreException) 
	  return arr; 
	} 

}
class Name extends Pair<String,String> {

	public Name(String a1, String a2) {
		super(a1, a2);
		// TODO Auto-generated constructor stub
	}  }