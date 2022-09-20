package constructPack;

public class BClass2  extends BClass1{

	BClass2(String s){
		super(1);
		System.out.println("Bclass2");
	}
	
	BClass2(){ super(null);
		//when you try to create constructor of its child class, the no-arg constructor of 
	//parent class is always called first.If it doesn't exist, you get compiler error.
	}
	void adds(){System.out.println("bc1jokes");}
	void add(){ this.adds();
		System.out.println("bc2joke");
		super.add();
		}
	void meth(){System.out.println("meth2");}
	public static void main(String[] args) {
		BClass2 bb = new BClass2();bb.add();
		System.out.println("Bclass2");
		BClass2 b2 = new BClass2();
		BClass1 b1 = new BClass2();
		b1.meth();
	}
	
	
	
}
/*
if bclass1 is nt having a default constructor and at the same time if the same class has parameterised constructor 
then bclass2 wont work unless it calls parameterised constructor.
if we are not using super() then default super() workds and it asks for default constructor on bclass1 from bclass2
Java error: Implicit super constructor is undefined. Must explicitly invoke another constructor*/
