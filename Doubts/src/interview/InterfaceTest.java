package interview;

public class InterfaceTest {
	public static void main(String[] args) {
		abstractclass obj = new abstractclass();//Cannot instantiate the type abstractclass
	}
}
abstract class abstractclass{
	static abstract void ab();
}
interface interfaceclass{
	void abc();
	abstract private void cde();//interface cannot even have protected methods
//after adding private-Illegal modifier for the interface method cde; 
//only public, abstract, default, static and strictfp are permitted	
	default void cdedefault() {
	}
	static void cdestatic() {
	}
//Illegal combination of modifiers for the interface
//method abc; only one of abstract, default, or static permitted	
}
abstract class abcd{
	abstract void ab();
	
}