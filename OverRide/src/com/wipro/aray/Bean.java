package com.wipro.aray;

import java.util.Comparator;

public class Bean {// implements Comparable<Bean> {

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

	public Bean(){}
	
	public Bean(String name,int id,int roll, double salary){
		this.name=name;
		this.id = id;
		this.roll = roll;
		this.salary=salary;
	}

	public String toString(){
	     return "Name: "+this.name+"  id: "+this.id+"roll : "+this.roll+" salary :"+this.salary;
	 
	 }
    static class MyNameComp implements Comparator<Bean>{
	   	 
        @Override
        public int compare(Bean e1, Bean e2) {
        	System.out.println("inside nested name Comp");
            return e1.getName().compareTo(e2.getName());
        }
    } 


	static class MyIdComp implements Comparator<Bean>{
		 
	    @Override
	    public int compare(Bean e1, Bean e2) {
	    	if(e1.getId()> e2.getId()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
	}
}	    
	/*	    static class MyRollComp implements Comparator<Bean>{
	   	 
	        @Override
	        public int compare(Bean e1, Bean e2) {
	            if(e1.getRoll() > e2.getRoll()){
	                return 1;
	            } else {
	                return -1;
	            }
	        }
	    }
	    
	    
	    
	     static  class MySalComp implements Comparator<Bean>{
	    	 
	    	    @Override
	    	    public int compare(Bean e1, Bean e2) {
	    	        if(e1.getSalary() > e2.getSalary()){
	    	            return 1;
	    	        } else {
	    	            return -1;
	    	        }
	    	    }

   	}
	}
*/	 
	

