package com.wipro.overridecomparable;

public class BeanComparable implements Comparable<BeanComparable> {
	
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


	
	public BeanComparable(String name,int id,int roll, double salary){
		this.name=name;
		this.id = id;
		this.roll = roll;
		this.salary=salary;
	}

	public String toString(){
	     return "Name: "+this.name+"  id: "+this.id+"roll : "+this.roll+" salary :"+this.salary;
	 
	 }

	@Override
	public int compareTo(BeanComparable o) {
		
		return (int) (this.getSalary()-o.getSalary());
	}

	

	
	
}
