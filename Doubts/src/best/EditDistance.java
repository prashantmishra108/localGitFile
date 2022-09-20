package best;
public class EditDistance {
	public static void main(String[] args) {
//		System.out.println(minDistance("YZ","Y"));
//		System.out.println(minDistance("password","pss$w#rd"));
		System.out.println(minDistance("AB","A"));
		//	System.out.println(minDistance("A","B"));
	}
	public static int minDistance(String word1, String word2) {
		int len1 = word1.length();
		int len2 = word2.length();
		// len1+1, len2+1, because finally return dp[len1][len2]
		int[][] dp = new int[len1 + 1][len2 + 1];
		for (int i = 0; i <= len1; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= len2; j++) {
			dp[0][j] = j;
		}
/*
0  1  2  
1  0  1  
1
 * iterate through, and check last char
 */
		for (int i = 0; i < len1; i++) {
			char c1 = word1.charAt(i);
			for (int j = 0; j < len2; j++) {
				char c2 = word2.charAt(j);
				//if last two chars equal
				if (c1 == c2) {
					//update dp value for +1 length
					dp[i + 1][j + 1] = dp[i][j];
				} else {
					int replace = dp[i][j] + 1;
					int insert = dp[i][j + 1] + 1;
					int delete = dp[i + 1][j] + 1;
	 
					int min = replace > insert ? insert : replace;
					min = delete > min ? min : delete;
 					dp[i + 1][j + 1] = min;
 					/*for(int ii = 0; ii <= len1; ii++){
 					 * 
0  1  2  
1  0  1  
1
 						for(int jj = 0; jj <= len2; jj++){
 							System.out.print(dp[ii][jj]+"  ");
 						}System.out.println();
 					}System.out.println("-----");*/
				} 
			}
		}
		for(int i = 0; i <= len1; i++){
			for(int j = 0; j <= len2; j++){
				System.out.print(dp[i][j]+"  ");
			}System.out.println();
		}
		return dp[len1][len2];
	}
}
