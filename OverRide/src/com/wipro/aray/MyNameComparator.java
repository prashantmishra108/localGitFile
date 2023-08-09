package com.wipro.aray;

import java.util.Comparator;

class MyNameComp implements Comparator<Bean>{
	 
    @Override
    public int compare(Bean e1, Bean e2) {
    	System.out.println("inside mynamecomp");
        return e1.getName().compareTo(e2.getName());
    }
}
