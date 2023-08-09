package Algorithms.algorithm.others;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReportFtl {

	public static void main(String[] args) {
		int n=10,m=20;
		List<List<Integer>> collist = new LinkedList<List<Integer>>();
		List<Integer> index = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			index.add(i);
		}
		for(int i=2;i<m;i++) {
			List<Integer> col = new LinkedList<Integer>(); 
			for(int j=1;j<11;j++) {
				col.add(i*j);
			}
			collist.add(col);
		}
//		System.out.println(rowslist.index);
		int i=0;
		while(i<m-2) {
		ListIterator it = collist.get(i).listIterator();
		while(it.hasNext()) {
		System.out.print(it.next()+"  ");
		}
		System.out.println();
		i++;
		}	
	}
}
