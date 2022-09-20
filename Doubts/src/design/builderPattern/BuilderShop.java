package design.builderPattern;

public class BuilderShop {

	public static void main(String[] args) {
		Phone p = new BuilderPattern().setModel("model").setType(2)
				.getPhone();
		System.out.println(p);
	}
}
