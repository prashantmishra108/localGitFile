package Algorithms.divide2;

public class SearchInsert {
	
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,0,1,2,3};
		System.out.println(searchInsert1(arr,1));
	}
    public static int searchInsert1(int[] A, int target) {
        if (A == null || A.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = A.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] > A[right]) {
                left = mid + 1;
            } else {
                right = mid ;
            }
        }
        System.out.println("array turning point is left="+left+"  right="+right);
        int start=left;
        left=0;
        right = A.length-1;
        
        if(target>=A[start] && target <= A[right])
        	left=start;
        else
        	right=start;
        	
        while(left<=right) {
        	int mid = left+(right-left)/2;
        	if(A[mid]==target)
        		return mid;
        	else if (A[mid]<target)
        		left=mid+1;
        	else
        		right=mid-1;
        }
        
        
        return -1;
    }
    
    // sol 2:
    public static int searchInsert2(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }
        
        int left = 0;
        int right = A.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = A[mid];
            
            if (num == target) {
                return mid;
            } else if (num < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
}