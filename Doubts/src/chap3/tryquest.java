package chap3;

import java.io.Console;

public class tryquest {

	public static void main(String[] args) {
	
		String s = new String("hello");
		String ss="hello";
		//StringBuffer sbb = "hello";
		StringBuffer sb =new StringBuffer("hello");
		StringBuilder sbi = new StringBuilder("hello");
		if(sb.equals(sb))System.out.println("true1");
		if(ss.equals(sb))System.out.println("true2");
		if(s.equals(sb))System.out.println("true3");
		if(sbi.equals(s))System.out.println("true4");
		if(ss == s)System.out.println("true5");
		
	}
}
