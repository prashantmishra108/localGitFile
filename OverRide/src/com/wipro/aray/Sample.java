package com.wipro.aray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
	List<Bean> list = new ArrayList<Bean>();	
	list.add(new Bean("Ram",101,44,1000.00));
	list.add(new Bean("Sam",105,22,500.00));
	list.add(new Bean("Bam",104,88,5000.00));
	list.add(new Bean("Dam",107,11,2000.00));
	list.add(new Bean("Mam",103,33,2000.00));
	list.add(new Bean("Jam",108,66,2000.00));
	String a=new String("b");
	String b=new String("b");
	System.out.println(a.equals(b));
		Iterator it = list.iterator();
		while(it.hasNext()){
		System.out.println(it.next());
	}
		System.out.println("Enter 1 for name wise, 2 for Emp-Id wise, 3 for Roll wise, 4 for salary wise sorting");
		Scanner in = new Scanner(System.in);
		int index = Integer.parseInt(in.nextLine());
		if(index==1){ System.out.println("hi1");
		Collections.sort(list,new Bean.MyNameComp());
		System.out.println("bye");
		}
		else if(index==2){
			Collections.sort(list,new Bean.MyIdComp());
		}
		else if(index==3){
			Collections.sort(list,new MyRollComp());
		}
		else if(index==4){
			Collections.sort(list,new MySalComp());
		}
		Iterator itt = list.iterator();
		while(itt.hasNext()){
		System.out.println(itt.next());
		}
		ArrayList< Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(11);
		al.add(14);
		Collections.sort(al);System.out.println(al);
	}
}
