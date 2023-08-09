package com.wipro.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.wipro.aray.Bean;
import com.wipro.overridecomparable.BeanComparable;

public class OverRidingComparable {

	public static void main(String[] args) {
		
		List<BeanComparable> list = new ArrayList<BeanComparable>();	
		list.add(new BeanComparable("Ram",101,44,1000.00));
		list.add(new BeanComparable("Sam",105,22,500.00));
		list.add(new BeanComparable("Bam",104,88,5000.00));
		list.add(new BeanComparable("Dam",107,11,2000.00));
		list.add(new BeanComparable("Mam",103,33,2000.00));
		list.add(new BeanComparable("Jam",108,66,2000.00));
	 
		Collections.sort(list);
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
		
		
		
		
	}
	
}
