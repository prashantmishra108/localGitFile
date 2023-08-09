package Algorithms.divide2;

public class Pow_1219_2014 {
	public static void main(String[] args) {
		System.out.println(pow(5,-1));
	}
    public static double pow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        // base case: when n = 0, the result is 1;
        if (n == 0) {
            return 1;
        }
        // X^(-n) = X^(n + 1) * X
        // X^n = 1/(x^(-n))
        if (n < 0) {
            double ret = x * pow(x, -(n + 1));
            return (double)1/ret;
        }
        
        double ret = pow(x, n / 2);
        ret = ret * ret;
        
        if (n % 2 != 0) {
            ret = ret * x;
        }
        
        return ret;
    }
}