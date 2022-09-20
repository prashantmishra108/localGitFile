package interfaces;

public class Interfc {
public static void main(String[] args) {
	ab a = new ab();
}
}

 abstract class ab{
	abstract void b();
	ab retobj(){
		return new ab();
	}
}