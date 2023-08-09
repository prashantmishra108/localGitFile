package Algorithms.algorithm.others;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisII {
	
	public static void main(String[] args) {
		
		generateParenthesis(3);
	}
	
	public static void generateParenthesis(int i){
		List<String> output_arr = new ArrayList<>();
		generateOutputArr(output_arr,"",0,0,i);
		System.out.println(output_arr);
	}
	
	public static void generateOutputArr(List<String> output_arr ,String current_string,
			int open, int close, int max) {
		if(current_string.length()==2*max) {
			output_arr.add(current_string);
			return;
		}
		if(open<max)
			generateOutputArr(output_arr,current_string+"(",open+1,close,max);
		
		if(close<open)
			generateOutputArr(output_arr,current_string+")",open,close+1,max);
		
	}
}
