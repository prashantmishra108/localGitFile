package chap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ashwanijha {

	public static double m() {
		List pCashFlows=Arrays.asList(
		
	 11125.0,11125.0,11125.0,11125.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,
					  14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,
					  14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,
					  14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0,14240.0);
		
		int len = pCashFlows.size();
		double[] values = new double[len];

		double guess = 0.1d;

		int maxIterationCount = 20;
		double absoluteAccuracy = 1E-8;

		double x0 = guess;
		double x1;

		int i = 0;

		for (int z= 0; z < len; z++)
		{
		values[z]= (Double) pCashFlows.get(z);
		}
//System.out.println("length"+values.length);
int dd = 1;
		        while (i < maxIterationCount) {
		        	
		            // the value of the function (NPV) and its derivate can be calculated in the same loop
		            double fValue = 0;
		            double fDerivative = 0;
		            for (int k = 0; k < values.length; k++) {
		                fValue += values[k] / Math.pow(1.0 + x0, k);
		                fDerivative += -k * values[k] / Math.pow(1.0 + x0, k + 1);
		            }

		            // the essense of the Newton-Raphson Method
		            x1 = x0 - fValue/fDerivative;
System.out.println("x1 "+x1  +"x0 "+x0);
System.out.println("aaa"+absoluteAccuracy);
		            if (Math.abs(x1 - x0) <= absoluteAccuracy) {
		                return x1;
		            }

		            x0 = x1;
		            ++i;
		        }
		        // maximum number of iterations is exceeded
		        //System.out.println(maxIterationCount+ i);
		        return 200.00;
	}
	public static void main(String[] args) {
		System.out.println("hi"+m());
		
	}
}
