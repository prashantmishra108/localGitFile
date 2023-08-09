package Algorithms.lintcode.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KSumPairOfIntegers {
//	Read more: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz74zvIxesP
	public static void main(String args[]) {

		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		prettyPrint(numbers, 7);
		prettyPrint(numbersWithDuplicates, 7);
		System.out.println("with hashset");
		printPairsUsingSet(numbersWithDuplicates,7);
	}

	/**
	 * * Prints all pair of integer values from given array whose sum is * is equal
	 * to given number. * complexity of this solution is O(n^2)
	 */
	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}
	}

	/** * Utility method to print input and output for better explanation. */
	public static void prettyPrint(int[] givenArray, int givenSum) {
		System.out.println("Given array : " + Arrays.toString(givenArray));
		System.out.println("Given sum : " + givenSum);
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
		printPairs(givenArray, givenSum);
	}

	/**
	 * Given an array of integers finds two elements in the array whose sum is equal
	 * to n.
	 * 
	 * @param numbers
	 * @param n
	 */
	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {//{ 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };(3, 4) (5, 2) (9, -2) 
			return;
		}
		Set set = new HashSet(numbers.length);

		for (int value : numbers) {
			int target = n - value;

			// if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				set.add(value);
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}
}

/*
 * Output: Given array: { 2, 4, 3, 5, 7, 8, 9 }; Given sum : 7 Integer numbers,
 * whose sum is equal to value : 7 (2, 5) (4, 3) Given array : [2, 4, 3, 5, 6,
 * -2, 4, 7, 8, 9] Given sum : 7 Integer numbers, whose sum is equal to value :
 * 7 (2, 5) (4, 3) (3, 4) (-2, 9)
 */