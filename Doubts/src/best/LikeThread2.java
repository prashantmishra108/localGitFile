package best;

public class LikeThread2 {

	public LikeThread2() {

	}

	public void st() {
		System.out.println("run.");
		throw new RuntimeException("Problem");
	}

	public static void main(String[] args) {
		LikeThread2 t = new LikeThread2();
		t.st();
		System.out.println("End of method.");// nt printed
	}
}