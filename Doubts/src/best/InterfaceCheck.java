package best;

public class InterfaceCheck {
public static void main(String[] args) {
	
}
}

class implInterface1 implements interface1{
	void meth1(){
		++a; //The final field interface1.a cannot be assigned
		System.out.println("a="+a);
	}
}
interface interface1{
	 int a=4;
	
}

