package chap3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tryst {
public static void main(String[] args) {
	Pattern p = Pattern.compile("ab");
	Matcher m = p.matcher("ab  abc abcd");
	boolean b = false;
	while(b = m.find()){
		System.out.println(m.start()+" "+m.end()+" "+m.regionEnd());
//		System.out.println(m.regionStart());
	}
	
	
}
}
