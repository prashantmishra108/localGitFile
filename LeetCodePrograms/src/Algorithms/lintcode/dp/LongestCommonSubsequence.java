package Algorithms.lintcode.dp;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		//String a="KTEURFJS";
	//	String b="TKWIDEUJS";
		String a="tbc";
		String b="abc";
		
		System.out.println(longestCommonSubsequence(a,b));
	}
	
    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public static int longestCommonSubsequence(String A, String B) {
        // write your code here
        if (A == null || B == null) {
            return 0;
        }
        
        int lenA = A.length();
        int lenB = B.length();
        int[][] D = new int[lenA + 1][lenB + 1];
        
        for (int i = 0; i <= lenA; i++) {
            for (int j = 0; j <= lenB; j++) {
                if (i == 0 || j == 0) {
                    D[i][j] = 0;
                } else {
                    if (A.charAt(i - 1) == B.charAt(j - 1)) {
                        D[i][j] = D[i - 1][j - 1] + 1;
                    } else {
                        D[i][j] = Math.max(D[i - 1][j], D[i][j - 1]);
                    }
                }
            }
        }
        
        return D[lenA][lenB];
    }
}
/*KTEURFJS   
TKWIDEUJS	[[0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
	 [0, 0, 1, 1, 1, 1, 1, 1, 1, 1],
	 [0, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	 [0, 1, 1, 1, 1, 1, 2, 2, 2, 2],
	 [0, 1, 1, 1, 1, 1, 2, 3, 3, 3],
	 [0, 1, 1, 1, 1, 1, 2, 3, 3, 3], 
	 [0, 1, 1, 1, 1, 1, 2, 3, 3, 3],
	 [0, 1, 1, 1, 1, 1, 2, 3, 4, 4],
	 [0, 1, 1, 1, 1, 1, 2, 3, 4, 5]]
*/