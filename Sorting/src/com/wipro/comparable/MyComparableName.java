package com.wipro.comparable;

import com.wipro.userbean.UserBean;

public class MyComparableName {

	
	public int compare(UserBean e1,UserBean e2) {
	       
		if(e1.getEmployee_name().compareTo(e2.getEmployee_name())==1){
            return 1;
        } else {
            return -1;
        }
}
}