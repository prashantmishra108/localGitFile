package Algorithms.array;

public class Rotate {
    public static int[][] rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 
           || matrix[0].length == 0) {
            return matrix;       
        }
        
        int n = matrix.length;
        int top = 0, down = n - 1, left = 0, right = n - 1;
        
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                int tmp = matrix[top][left + i];
                // �?�上边等于左边
                matrix[top][left + i] = matrix[down - i][left];
                
                // �?�左边等于下边
                matrix[down - i][left] = matrix[down][right - i];
                
                // �?�下边等于�?�边
                matrix[down][right - i] = matrix[top + i][right];
                
                // �?��?�边等于上边
                matrix[top + i][right] = tmp;
            }
            top++;
            right--;
            left++;
            down--;
            
            n -= 2;
        }
        
        return matrix;
    }
    
    public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int m[][] = rotate(a);
		
	}
}