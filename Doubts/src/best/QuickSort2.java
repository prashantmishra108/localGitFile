package best;

public class QuickSort2 {
	public static void main(String args[])
	 {	 int arr[] = {10,9,8,7};
	     int n = arr.length;
	     QuickSort2 ob = new QuickSort2();
	     QuickSort2.QuickSort2(arr, 0, n-1);
	     System.out.println("sorted array");
	     QuickSort.printArray(arr);
	 }
	private static void swap(int a[],int left,int right){
		int temp = 0;
		temp=a[left];
		a[left]=a[right];
		a[right]=temp;
	}
	public static void QuickSort2(int []a,int low,int high){
		int pivot;
		if(high>low){
		 pivot = partition(a,low,high);
		 QuickSort2(a, low, pivot-1);
		 QuickSort2(a, pivot+1, high);
		}
	}
	
	public static int partition(int[]a,int low,int high){
		int left=low,right=high,pivot=a[low];
		while(left<right){
			while(a[left]<=pivot){
				left++;
			}
			while(a[right]>pivot){
				right--;
			}
			if(left<right)swap(a,left,right);
		}
		a[low]=a[right];
		a[right]=pivot;
		return right;
	}
}
