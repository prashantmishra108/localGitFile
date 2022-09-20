package dataStructure;

public class PairTarget {
	public static void main(String[] args) {
		int a[] = {2,4,6,8,10};
		int target = 12, result=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]+a[j])==target)
					result++;
			}
		}
		System.out.println(result);
	}
}
