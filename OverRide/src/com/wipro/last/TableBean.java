package com.wipro.last;

public class TableBean {

	
	private String employeeName;
	private int employeeId;
	private String dept;
	private String designation;
	private double salary;
	
	public TableBean(String employeeName,int employeeId,String employeedept,String employeeddesignation, double empSalary){
		this.employeeName = employeeName;
	this.employeeId = employeeId;
	this.dept = employeedept;
	this.designation = employeeddesignation;
	this.salary = empSalary;
	}
	
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString(){
	     return "Name: "+this.employeeName+"  id: "+this.employeeId+"Dept : "+
	this.dept+"Designation : "+this.designation+"salary : "+this.salary;
	 
	 }
}
