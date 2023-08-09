package com.wipro.aray;

import java.util.Comparator;

public class MyRollComp implements Comparator<Bean>{
	 
    @Override
    public int compare(Bean e1, Bean e2) {
        if(e1.getRoll() > e2.getRoll()){
            return 1;
        } else {
            return -1;
        }
    }
}