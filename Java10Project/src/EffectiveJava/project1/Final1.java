package EffectiveJava.project1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

//final broken
public class Final1 {
	static Integer i=5; public int j=0;static int a[]= {1,2,3};
	private static final Integer[] PRIVATE_VALUES = {1,2,3};
	public static final List<Integer> VALUES =
	Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
public static void main(String[] args) {
	final Integer j = new Integer(i);
	final int b[] = a;a[1]=10;
	i=4;System.out.println(j+" "+b[1]);
	PRIVATE_VALUES[2] = 6;
	System.out.println(VALUES);
	Properties p = new Properties();
	p.setProperty("a", "a");
	
	
}
}
interface a{int ab=9;}
