package best;

public class ParamContruct extends testCons1 {
	public ParamContruct(int i) {
		System.out.println("ParamContruct1");
	}

	public static void main(String[] args) {
		// ParamContruct p = new ParamContruct(3);
		// testCons1 p2 = new ParamContruct(3);
		// testCons1 p1 = new testCons1(3);
		System.out.println("ji");
	}
}

class testCons1 extends testCons2 {
	public testCons1(int r) {
		System.out.println("testCons11");
	}

	public testCons1() {
		System.out.println("wi");
	}
}

class testCons2 {
	public testCons2() {
		System.out.println("wi5");
	}

	public testCons2(int j) {
		System.out.println("testCons12");
	}

}
