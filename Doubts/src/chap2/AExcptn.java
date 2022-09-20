package chap2;

public class AExcptn {
public static void main(String[] args) {
	try{
		int i=5/0;
		float f=10f/0f;
		System.out.println(f); 
	}
	catch(Exception e){
		//e.printStackTrace();
	}
	finally{
		System.out.println("hello");
	}
}
}
