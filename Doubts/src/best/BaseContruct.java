package best;

public class BaseContruct {
	public BaseContruct() {
		//this(5);
		System.out.println("BaseContruct");
	}
	public BaseContruct(int i){
		//this();
		System.out.println("i="+i);
	}
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("staticblock");
	}

	public static void main(String[] args) {
		C2Class b = new C2Class();
		System.out.println("tMain");
		BaseContruct obj = new BaseContruct(10);
	}
}

class C2Class extends BaseContruct {
	String s;

	public C2Class() {
		super(5);
		System.out.println("C2Class");
		s = "Tiger";
	}
}