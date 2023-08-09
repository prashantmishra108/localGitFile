package com.wipro.override;

import java.util.ArrayList;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.wipro.aray.Bean;


public class OverRidingComparator  {

	
	public static void main(String args[])  
	{  
		
		List<Bean> list = new ArrayList<Bean>();	
		list.add(new Bean("Ram",101,44,1000.00));
		list.add(new Bean("Sam",105,22,500.00));
		list.add(new Bean("Bam",104,88,5000.00));
		list.add(new Bean("Dam",107,11,2000.00));
		list.add(new Bean("Mam",103,33,2000.00));
		list.add(new Bean("Jam",108,66,2000.00));
	 
		Collections.sort(list,new MyComparator());
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	
	}
	
}

	

