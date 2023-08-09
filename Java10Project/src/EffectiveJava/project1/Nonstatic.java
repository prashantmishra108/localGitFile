package EffectiveJava.project1;
public class Nonstatic {
	public static void main(String[] args) {
	abc a1 = new abc(1);
	abc a2 = new abc(10);
	abc a3 = new abc();
	System.out.println(abc.i);
	}}
class abc{
	public abc(int x) {}public abc() {}
	static int i=0;
	 static void meth() {i++;}
	 {meth();}
}
