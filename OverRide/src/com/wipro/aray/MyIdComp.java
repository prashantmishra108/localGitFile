package com.wipro.aray;

import java.util.Comparator;

public class MyIdComp implements Comparator<Bean>{
	 
    @Override
    public int compare(Bean e1, Bean e2) {
        if(e1.getId()> e2.getId()){
            return 1;
        } else {
            return -1;
        }
    }

}
