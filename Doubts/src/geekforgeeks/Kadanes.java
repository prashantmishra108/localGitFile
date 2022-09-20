package geekforgeeks;

public class Kadanes {
	public static void main(String[] args) {
		int a[] = new int[]{10,-1,2,-3,-12,3,4,-1};
		int max_so_for = 0;
		int current_max =0;
		for(int i=0;i<a.length;i++){
			current_max = current_max +a[i];
			max_so_for = max(current_max , max_so_for); 
			current_max = current_max<0?0:current_max;
		}
		System.out.println(max_so_for+" "+current_max);
	}
	private static int max(int max_so_far, int max_end) {
		return max_end>max_so_far?max_end:max_so_far;
	}
}
