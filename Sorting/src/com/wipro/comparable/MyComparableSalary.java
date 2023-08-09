package com.wipro.comparable;

import com.wipro.userbean.UserBean;

public class MyComparableSalary {

	public int compare(UserBean e1,UserBean e2) {
	       
		if(e1.getSalary().compareTo(e2.getSalary())==1){
            return 1;
        } else {
            return -1;
        }
	
}
}