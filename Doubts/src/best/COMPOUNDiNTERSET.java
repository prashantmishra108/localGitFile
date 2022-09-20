package best;

public class COMPOUNDiNTERSET {

	public static void main(String[] args) {
		int i = 1;
		double effectivePer = 12, effectivePer1 = 12.0;
		effectivePer = effectivePer + 12 + (effectivePer * 12.00 * 0.01);
		effectivePer1 = effectivePer1 + 12 + ((effectivePer1 * 12.0) / 100);
		for (i = 1; i < 30; i++) {
			effectivePer = effectivePer + 12 + (effectivePer * 12.00 * 0.01);
		}
		System.out.printf("effectiveper = " + effectivePer);
	}
}
