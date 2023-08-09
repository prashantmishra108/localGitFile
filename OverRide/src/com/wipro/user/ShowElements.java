package com.wipro.user;

import java.util.ArrayList;

public class ShowElements {

	public static ArrayList< Employee> n = new ArrayList<Employee>(); 
	public static void main(String[] args) {
		
	
	String id [][] = {{"1234"},{"2134"},{"0134"},{"0555"},{"0123"},{"0987"},{"5675"}
	,{"4567"},{"3245"},{"1243"}};
	String name [][] = {{"ram"},{"sam"},{"tom"},{"jon"},{"sony"},{"jerry"}
	,{"rony"},{"tony"},{"popiye"},{"olive"}};
	String roll_no [][] ={{"4"},{"3"},{"5"},{"7"},{"6"},{"9"},{"8"},{"16"},{"13"},{"15"}};
	String occupation [][] = {{"peon"},{"doctor"},{"engineer"},{"steno"},{"manager"},
			{"pilot"},{"co-pilot"},{"anchor"},{"teacher"},{"student"}};
	String salary [][] = {{"10000"},{"8000"},{"15000"},{"20000"},{"14000"},{"5000"}
	,{"12000"},{"6000"},{"90000"},{"5000"}};
	
	
	
	for(int i=0;i<10;i++){

		Employee userBean = new Employee();
		userBean.setId(id[i][0]);
		userBean.setName(name[i][0]);
		userBean.setSalary(salary[i][0]);
		
	
}
}}