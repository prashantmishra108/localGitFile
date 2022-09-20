package best;
/*It does not work for end elements when they are 1*/
public class MaximiseSubSizeMatrix {
static int [][]a=new int[][]{{0,1,1,1},{0,1,1,1}
							 ,{0,1,1,1},{0,1,1,1}};
	public static void main(String[] args) {
	int initCnt=0;	
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			int d=j,count=0;
//count gets the row-wise max length of one's			
			while(d<a.length && a[i][d]==1)
				{ d++;++count;
			} int downCnt=count; System.out.println(count);
			if(count>1 && i<a.length){ int c=i;
				while(c<a.length && downCnt>0){
					while(c<a.length && d>1 && a[c][j+(--d)]==1){
						c++;downCnt--;
					}
				}
			}
		if(d==j){initCnt=Math.max(count, initCnt);}
		}
	}
	System.out.println("m"+initCnt);

	}
}
