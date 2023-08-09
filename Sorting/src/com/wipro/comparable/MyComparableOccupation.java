package com.wipro.comparable;

import com.wipro.userbean.UserBean;

public class MyComparableOccupation {

	public int compare(UserBean e1,UserBean e2) {
	       
		if(e1.getOccupation().compareTo(e2.getOccupation())==1){
            return 1;
        } else {
            return -1;
        }
	
}
}