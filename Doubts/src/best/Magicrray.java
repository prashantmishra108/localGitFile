package best;

public class Magicrray {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		a = new int[][]{{1,1,1},{1,1,1},{1,1,1}};
		int sum[] = new int[10];
		boolean flag = true; int k=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				{
					sum[k] = sum[k] + a[i][j];
				}
				System.out.println(sum[i]);
				if( k>0 && sum[k]!=sum[k-1])
				{
					flag = false;
					break;
				}
				k++;
		}
		if(flag==true)System.out.println("magic");
		else System.out.println("not magic");
	}
}
