package best;

import chap2.foreach;

public class ReversePair {
	static int a[] = new int[]{1,2,3,4,5,6,7,8};
	static int l=a.length;
	public static void main(String[] args) {
	int i=0;swap(i,i+1);
	for(int x:a){
	System.out.print(x+" ");
	}
}
public static void swap(int i,int j){
	if(j<l-2){
    swap(j+1,j+2);
	}
    int temp = a[i];
	a[i]=a[j];
	a[j]=temp;
  } 
}
