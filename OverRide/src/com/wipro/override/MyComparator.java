package com.wipro.override;

import java.util.Comparator;

import com.wipro.aray.Bean;

public class MyComparator implements Comparator<Bean>{
	 
    @Override
    public int compare(Bean e1, Bean e2) {
    	System.out.println("in my comp");
    	return e1.getName().compareTo(e2.getName());
    }
}
