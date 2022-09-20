package walmart;

public class SticklerTheifII {
	public static void main(String[] args) {
	//int hval[] = { 6, 7, 1, 3, 8, 2, 4 };
						// 0  1  2   3  4  5  6
		int hval[] = {10,3,3,13 };
		int n = hval.length;
		System.out.println("Maximum loot value : " + maxLoot(hval));
	}
	public static int maxLoot(int [] nums){
		if(nums.length == 0) return 0;
		int dp[] = new int [nums.length+1];
		dp[0]=0;
		dp[1]=nums[0];
		for(int i=1;i<nums.length;i++) {
			System.out.println("dp["+i+"]="+dp[i]+"  " +"dp["+(i-1)+"]="+dp[i-1] 
					+" nums["+i+"]="+( dp[i-1]+nums[i]));
			dp[i+1] = Math.max(dp[i], dp[i-1]+nums[i]);
			System.out.println("dp["+(i+1)+"]="+dp[i+1]);
		}
		return dp[nums.length];
	}
}
