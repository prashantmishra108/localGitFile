package thomasCormen;

public class MaxSumArray {
public static void main(String[] args) {
	int a[]=new int[]{-1,-4,-2,3,4};
	System.out.println(MaxSumArray.findMaxSum(a));
}
public static int findMaxSum(int a[]){
	int maxsum=0;int calcsum=0;
	for (int i=0;i<a.length;i++){
	calcsum=Math.max(calcsum, calcsum+a[i]);
	if(calcsum>maxsum)maxsum=calcsum;
	System.out.println(calcsum);
	}	
	return maxsum;
}
}
