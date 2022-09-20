package best;

public class RecursivePow {
	public static void main(String[] args) {
		System.out.println(new RecursivePow().pow(3, 2));
	}

	int pow(int x, int N) {
		int temp = 1;
		if (N == 0)
			return 1;
		temp = pow(x, N / 2);
		if (N % 2 == 0)
			return temp * temp;
		else
			return x * temp * temp;
	}
}
