package best;

public class HelloComplie {
	String title;
	int val;

	public HelloComplie() {
		title += "world";
	}

	public HelloComplie(int val) {
		this.val = val;
		title = "hell";
		//HelloComplie();//The method HelloComplie() is undefined for the type HelloComplie
	}// its thought of as a method instead of constructor

}
