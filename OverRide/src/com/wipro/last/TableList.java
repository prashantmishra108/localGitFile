package com.wipro.last;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TableList {

	public static void main(String[] args) {
		
		List<TableBean> list = new ArrayList<TableBean>();
		list.add(new TableBean("Sachin",1254,"Railway","Engineer",50000));
		list.add(new TableBean("Vinod",5134,"Bollywood","Hero",50000));
		list.add(new TableBean("Namo",0454,"Politician","Minister",50000));
		list.add(new TableBean("APJ Abdul",9254,"Research","Scientist",50000));
		list.add(new TableBean("Sachin",8974,"Circus","Joker",50000));
		list.add(new TableBean("Zaheer",1254,"Cricket","Bowler",50000));
		list.add(new TableBean("John Kerry",5134,"Politician","Vice-President",50000));
		list.add(new TableBean("Noam",0454,"Professor","Author",50000));
		list.add(new TableBean("Immanuel",9254,"Lecturer","Philosopher",50000));
		list.add(new TableBean("Chetan",8974,"Study","Author",20000));
		list.add(new TableBean("Noam",0454,"Professor","Author",10000));
		list.add(new TableBean("Immanuel",9254,"Lecturer","Philosopher",30000));
		list.add(new TableBean("Chetan",8974,"Study","Author",70000));
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Write Employee Name whose name is repeated");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		Set<TableBean> newSet = new HashSet<TableBean>();
		double salary = 0.00 ;
		int index = 0;
		for(int i=0;i<13;i++){
			if(list.get(i).getEmployeeName().equalsIgnoreCase(name))
			{	
				index = i;
				salary = salary + list.get(i).getSalary();
				
			}
		}	
			String empName = list.get(index).getEmployeeName();
			int id = list.get(index).getEmployeeId();
			String dept = list.get(index).getDept();
			String designation = list.get(index).getDesignation();
			double empSalary = salary;
			newSet.add(new TableBean(empName,id,dept,designation,salary));
			Iterator<TableBean> iterator = newSet.iterator();
			
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
			
		}
		
		
	
	}

