package chap2;
import java.util.ArrayList;
public class foreach {
public static void main(String[] args) {
	int a[]=new int[]{1,2,3,4,5,6};
	int array[][]=new int[10][10];
	ArrayList<int[]> ie = new ArrayList<int[]>();
	for (int j=0;j<5;j++){
		for (int k=0;k<5;k++){
			array[j][k]=k+j+k+10;
		System.out.println("j= "+j+ " k=" +k+"  array a[j][k] = "+ array[j][k]);
		}
	}
	ie.add(0,array[0]);
	for(int[] i :ie){
		for(int j:i)
		System.out.println(j);
	}
}
}
