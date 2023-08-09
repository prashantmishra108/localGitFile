package Algorithms.array;
//https://leetcode.com/problems/maximum-subarray/
public class MaxSubArray {
    public static int maxSubArray(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int len = A.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            sum += A[i];
            max = Math.max(max, sum);
            sum = Math.max(0, sum);
        }
        return max;
    }
    public static void main(String[] args) {
    	//int a []= new int []{2,3,4,3};
    	int a []= new int []{-2,1,-3,4,-1,2,1,-5,4};
		int i = maxSubArray(new int [] {-2,1,-3,4,-1,2,1,-5,4});//{2,3,4,3});
		System.out.println(i);//seems its not the largest increasing sequence subarray
	}
}
