package Algorithms.array;

public class LongestIncreasingSubsequence {
    /* lis() returns the length of the longest
       increasing subsequence in arr[] of size n */
    static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        /* Compute optimized LIS values in
           bottom up manner *///{100,90,80,20,40,50,30,20};
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;
    }
 
    public static void main(String[] args) {
		int a[]= {100,90,80,20,40,50,30,20};
    	int i = lis(a,8);
    	System.out.println(i);
	}
}