package com.wipro.override;


import java.util.Comparator;

public class Bean {//implements Comparable<Bean> {

	private String name;
	private int id;
	private int roll;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	public Bean(String name,int id,int roll, double salary){
		this.name=name;
		this.id = id;
		this.roll = roll;
		this.salary=salary;
	}

	public String toString(){
	     return "Name: "+this.name+"  id: "+this.id+"roll : "+this.roll+" salary :"+this.salary;
	 
	 }

	/*@Override
	public int compareTo(Bean a) {
		System.out.println("in bean");
		int i=Integer.parseInt(this.name);
		int j = Integer.parseInt(a.getName());
		return i-j;
	}*/

	
}