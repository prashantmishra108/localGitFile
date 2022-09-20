package chap3;

import java.util.Scanner;

public class scannerCheck {
public static void main(String[] args) {
	String s = "hello suchi3547ta  860 hhhh  \n 88686 hello deepak hello neeraj";
	Scanner scan = new Scanner(s).useDelimiter("\\s*hello\\s*");
	//remove hello and then only three words shall remain
	scan.next();//suchi3547ta  860 hhhh  88686
	System.out.println(scan.next());scan.next();	//System.out.println(scan.next());//scan.next();
	System.out.println(scan.hasNext());
	//System.out.println(scan.next());
	//System.out.println(scan.next());
	scan.close();
}
}
