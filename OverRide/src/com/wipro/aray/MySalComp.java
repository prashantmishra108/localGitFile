package com.wipro.aray;

import java.util.Comparator;

public class MySalComp implements Comparator<Bean>{
	 
    @Override
    public int compare(Bean e1, Bean e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }

}
