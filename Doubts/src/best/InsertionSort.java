package best;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = new int[] { 5, 4, 3, 2, 1 };
		int j, i, key;
		for (j = 1; j < a.length; j++) {
			key = a[j];
			i = j - 1;
			while (i > -1 && a[i] > key) {
				a[i + 1] = a[i];
				i = i - 1;
			}
			//System.out.println(Arrays.toString(a));
			a[i + 1] = key;
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println(Arrays.toString(a));
	}
}
