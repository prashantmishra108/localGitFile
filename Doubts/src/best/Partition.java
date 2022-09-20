package best;

public class Partition {

	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,4,6,7,8,9,5};
		partition(a, 0, 8);
		//System.out.println(partition(a, 0, 4));
	}
	
	static int partition(int arr[], int low, int high)
	 {
	     int pivot = arr[high]; 
	     int i = (low-1); // index of smaller element
	     for (int j=low; j<high; j++)
	     {
	         // If current element is smaller than or
	         // equal to pivot
	         if (arr[j] <= pivot)
	         {
	             i++;

	             // swap arr[i] and arr[j]
	             int temp = arr[i];
	             arr[i] = arr[j];
	             arr[j] = temp;
	         }
	     }

	     // swap arr[i+1] and arr[high] (or pivot)
	     int temp = arr[i+1];
	     arr[i+1] = arr[high];
	     arr[high] = temp;
	     QuickSort.printArray(arr);
	     return i+1;
	 }

}
