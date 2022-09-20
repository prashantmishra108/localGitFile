package chap5;

import java.io.IOException;

import chap4.*;
//extends can be used for other package with correct import
class supA extends Jude{
	public static void methA(int j)throws IOException{
		System.out.println("supA");
	}
	public void me(){}//overriding methods return types sud be same
	
}

public class StaticNoOverride extends supA{
 public StaticNoOverride() {
	// TODO Auto-generated constructor stub
}
	public static void methA(int j){
		System.out.println("staticNo Override");
	}
	public static void main(String[] args) {
		supA obj = new StaticNoOverride();
		try {
			obj.methA(5);//new supA().methA(7);//static method cant be overridden
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void me(){System.out.println("meek me");}
}
