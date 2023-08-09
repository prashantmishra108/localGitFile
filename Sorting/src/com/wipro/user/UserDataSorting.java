package com.wipro.user;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


import com.wipro.comparable.MyComparable;
import com.wipro.userbean.UserBean;

public class UserDataSorting {

	public static ArrayList<UserBean> userData = new ArrayList<UserBean>();
	static UserDataSorting obj = new UserDataSorting();
	
	
	
	public static void main(String[] args) {
		
		
		obj.addElements();
		
		
		System.out.println("According to which column you want to sort");
		System.out.println("Enter 1 for Employee Id");
		System.out.println("Enter 2 for Employee Name");
		System.out.println("Enter 3 for Employee Roll_No");
		System.out.println("Enter 4 for Employee Occupation");
		System.out.println("Enter 5 for Employee Salary");
//		Scanner scanIn = new Scanner(System.in);
//		String selected_index = scanIn.nextLine();
		String selected_index="1";
		if(selected_index.equalsIgnoreCase("1")){
			TreeSet<UserBean> idComp = new TreeSet<UserBean>(new MyComparable());
			obj.addElements();
			System.out.println(idComp);
		}
		if(selected_index.equalsIgnoreCase("2")){
			TreeSet<UserBean> nameComp = new TreeSet<UserBean>(new MyComparable());
			obj.addElements();
			System.out.println(nameComp);
		}if(selected_index.equalsIgnoreCase("3")){
			TreeSet<UserBean> roll_noComp = new TreeSet<UserBean>(new MyComparable());
			obj.addElements();
			System.out.println(roll_noComp);
		}if(selected_index.equalsIgnoreCase("4")){
			TreeSet<UserBean> occupationComp = new TreeSet<UserBean>(new MyComparable());
			obj.addElements();
			System.out.println(occupationComp);
		}if(selected_index.equalsIgnoreCase("5")){
			TreeSet<UserBean> SalaryComp = new TreeSet<UserBean>(new MyComparable());
			obj.addElements();
			System.out.println(SalaryComp);
		}
	 
}
	
	public void addElements(){
		
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

		UserBean userBean = new UserBean();
		userBean.setEmployee_id(id[i][0]);
		userBean.setEmployee_name(name[i][0]);
		userBean.setRoll_no(roll_no[i][0]);
		userBean.setOccupation(occupation[i][0]);
		userBean.setSalary(salary[i][0]);
		userData.add(userBean);
	}}
//	for(int i=0;i<10;i++){
//		UserBean userBean = new UserBean();
//		System.out.println(userBean.getEmployee_id());;
//		System.out.println(userBean.getEmployee_name());
//		System.out.println(userBean.getRoll_no());
//		System.out.println(userBean.getOccupation());
//		System.out.println(userBean.getSalary());
//		
//	}
	}
	
	
	
}
