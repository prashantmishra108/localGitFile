package best;

//Java program for implementation of QuickSort
public class QuickSort {
	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		System.out.println("pivot="+pivot);
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				printArray(arr);
				System.out.println("in if and i="+i+"  and j="+j);

			}
		}
		System.out.println();
		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		printArray(arr);
		// System.out.print("pi=");
		System.out.print(i+1); 
		System.out.println("    "+arr[i+1]);
		return i + 1;
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be sorted,
	 * low --> Starting index, high --> Ending index
	 */
	void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("  ");
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 9, 0, 8, 1, 6, 2, 5, 3, 4, 7 };// {1,2,3,4,6,7,8,9,5};
		int n = arr.length;
		printArray(arr);
		System.out.println();
		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);

		// System.out.println("sorted array");
		printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra */