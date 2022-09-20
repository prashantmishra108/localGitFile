package best;

public  class StaticCheck extends abc {

	static int x = 5, j=5;
	public static void main(String[] args) {
	StaticCheck obj = new StaticCheck();
	obj.x = 5;
	int j=25;//this j belongs to main method only , not to the object at all
	obj.j=06;
	
	StaticCheck.x = 5;
	System.out.println(obj.x==StaticCheck.x);
	System.out.println(obj.j== j);
	System.out.println(j);
	System.out.println(obj.j);
	System.out.println("called static method");
	add(7);//addfinal();
	abc staticobj = new StaticCheck();
	staticobj.add(8);
	}
	public final void addfinal(int a) { System.out.println("a "+a);}//cannot override or even write, but write is possible if static
	public static void add(int a) { System.out.println("a "+a);}
}
 class abc{
	public  static void add(int b) { System.out.println("base class called due to base class reference of the staticobj b="+b);}
	//public final void addfinal(int a) { System.out.println("a "+a);}
 }
 interface protectedcheck{
	// protected int a=9;
 }
