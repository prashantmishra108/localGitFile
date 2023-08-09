package EffectiveJava.project1;

public class Final2 { public int j=0;
	private static final Integer[] PRIVATE_VALUES = {1,2,3};
	public static final Integer[] values() {
	return PRIVATE_VALUES.clone();
	}
	public static void main(String[] args) {
		
	}
}
