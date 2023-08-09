package com.wipro.user;


public class User {

	
	public User(){
		
	}
	public User(User userBean){
		this.employee_id=userBean.getEmployee_id();
		this.employee_name=userBean.getEmployee_name();
		this.roll_no=userBean.getRoll_no();
		this.occupation=userBean.getOccupation();
		this.salary=userBean.getSalary();
	}
	
public	String employee_id;

public String getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(String employee_id) {
	this.employee_id = employee_id;
}
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public String getRoll_no() {
	return roll_no;
}
public void setRoll_no(String roll_no) {
	this.roll_no = roll_no;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public	String employee_name;
 public	String roll_no;
 public	String occupation;
 public	String salary;

/* public String toString(){
     return "Id:"+this.employee_id+"  Name: "+this.employee_name+"  Roll"+
 this.roll_no+"  Occupation"+this.occupation+"-- Salary: "+this.salary;
 } */

}
