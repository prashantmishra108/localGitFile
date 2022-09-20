package best;

import java.util.Arrays;

public class RotateArrayCyclic {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int rotateByTimes = 2;
		while(rotateByTimes>0) {
			rotateByOne(arr);
			rotateByTimes--;
		}
		Arrays.stream(arr).forEach(x->System.out.print(" "+x));
		System.out.println();
	}
	
	static void rotateByOne(int arr[]) {
		int last = arr[arr.length-1]; int temp=0;
		for(int i=arr.length-1;i>0;i--) {
			temp=arr[i-1];
			arr[i]=temp;
			
		}
		arr[0]=last;
		
	}
}
//1234 is totation of 4123 check - check if 4123 is substring of 12341234