package best;
public class SpiralArray {static int b=0;
static int a[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
public static void main(String[] args) {
	SpiralArray.spiral(0,0);
}//00	01	02	03	13	23	33	32	31	30	20	10	11	12	22	21	
 static void spiral(int i,int j){
	System.out.println(a[i][j]);
	if(i==0 && j==0){while(j<4)spiral(i,j++);}
	else if(i==0 && j==3){while()}
 }
}
