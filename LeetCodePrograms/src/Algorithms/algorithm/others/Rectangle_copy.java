package Algorithms.algorithm.others;
import java.util.Stack;


public class Rectangle_copy {
	    public static void main(String[] args){
	        int[] input ={4,3,2,1};//  {4,2,0,3,2,5};// length of input array-6 and heights varying
	        int result = largestRectangleArea(input);
	        System.out.printf("Result: %d\n", result);
	    }
	    
	    public static int largestRectangleArea(int[] height) {
	        if (height == null || height.length == 0){
	            return 0;
	        }
	        Stack<Integer> stack = new Stack<Integer>();
	        int rightBoard = 0;
	        int maxArea = 0;
	        stack.push(rightBoard);//0 is the first element in stack //4 3 2 1 //{4,2,0,3,2,5}; ->histogram
	        //height.length=6
	        for (rightBoard = 1; rightBoard <= height.length; rightBoard ++){
	            int leftBoard;
	            int h;
	            int wide;
	            int currentHeight = 0;
	            if (rightBoard < height.length){
	            	//take valid current height within height limits
	                currentHeight = height[rightBoard];
	            }
	            while (!stack.empty() && currentHeight < height[stack.peek()]){
	                /* get the left board of the rectangle. */ //  4 3 2 1                  {4,2,0,3,2,5}; ->histogram
	                leftBoard = stack.pop();
	                h = height[leftBoard];
	                if (stack.empty()){
	                    wide = rightBoard;
	                }else{
	                    wide = rightBoard - stack.peek() -1;
	                }                                   
	                maxArea = Math.max(maxArea, h*wide);
	            }
	            stack.push(rightBoard);
	        }
	        return maxArea;
	    }
	}
