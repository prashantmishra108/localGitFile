package com.wipro.comparable;

import com.wipro.userbean.UserBean;

public class MyComparableRoll {

	public int compare(UserBean e1,UserBean e2) {
	       
		if(e1.getRoll_no().compareTo(e2.getRoll_no())==1){
            return 1;
        } else {
            return -1;
        }
	
}
}