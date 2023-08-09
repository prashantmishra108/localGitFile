package com.wipro.comparable;

import java.util.Comparator;

import com.wipro.userbean.UserBean;


public class MyComparable implements Comparator<UserBean>{
	 
	   
	 
	public int compare(UserBean e1,UserBean e2) {
       
		if(e1.getEmployee_id().compareTo(e2.getEmployee_id())==1){
            return 1;
        } else {
            return -1;
        }
}}