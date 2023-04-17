package best.binarySearch;

public class searchInsert {
    public static void main(String[] args) {  
        int[] A = {1,3,5,6};  
        int target = 0;  
          
        System.out.println(searchInsert(A, target));  
    }  
  
    public static int searchInsert(int[] A, int target) {  
        int low = 0, high = A.length-1;  
        int mid = low + (high-low)/2;  
          
        while(low <= high){  
            mid = low + (high-low)/2;  
            if(A[mid] == target){  
                return mid;  
            }else if(target > A[mid]){  
                low = mid+1;  
            }else{  
                high = mid-1;  
            }  
        }  
          
        // 返回下�?值，此时刚好为适�?��?�入的�?置  
        return low;  
    }  
}
