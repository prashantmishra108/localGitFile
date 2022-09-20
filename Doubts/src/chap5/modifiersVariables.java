package chap5;

public class modifiersVariables {
public static void main(String[] args) {
	base obj = new base();
	obj.display();
	obj = new sub();
	obj.b += 1;
	System.out.println("main b= "+obj.b);
	obj.display();
}
}
class base{
	private int a=100;
	protected int b = 200;
	public int c = 300;
	int d = 400;
	public void display(){
		System.out.println("private = "+a+"\nprotected = "+b+"\npublic = "+c+"\npackage = "+d);
	}
}
class sub extends base{
	public sub(){this(105);}
	public sub(int a){
		super.b = super.b +1;
		System.out.println("sub b= "+b);
		super.c +=1;
		this.c += 1;
		this.d += 1;
	}
}