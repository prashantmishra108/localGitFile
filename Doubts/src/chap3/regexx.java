package chap3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexx {
public static void main(String[] args) {
	String abc = "dddd15r1tyr3rewy9th388mmm";
	String reg = "\\d";
	Pattern pat = Pattern.compile(reg);
	Matcher mat = pat.matcher(abc);
	while(mat.find()){
	//System.out.println(mat.find());
	System.out.println(mat.group());
	System.out.println("count = "+mat.regionStart());
	}
	
}
}
