package Algorithms.dp;

import java.util.ArrayList;
import java.util.List;
//dnt know the question
public class GetRow {
    public static List<Integer> getRow1(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> cur = new ArrayList<Integer>();
        
        if (rowIndex < 0) {
            return cur;
        }
        
        for (int i = 0; i <= rowIndex; i++) {
            cur = new ArrayList<Integer>(); 
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    cur.add(1);
                } else {
                    cur.add(pre.get(j) + pre.get(j - 1));
                }
            }
            pre = cur;
        }
        
        return cur;
    }
   
    public static void main(String[] args) {
		System.out.println(getRow1(10));
	}
    // SOLUTION 2: DO IT just inplace
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<Integer>();
        
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == i) {
                    ret.add(1);
                } else if (j != 0) {
                    // ERROR: use add instead of set
                    //ret.add(ret.get(j) + ret.get(j - 1));
                    ret.set(j, ret.get(j) + ret.get(j - 1));
                }
            } 
        }
        
        return ret;
    }
}