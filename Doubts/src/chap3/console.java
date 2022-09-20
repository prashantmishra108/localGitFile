package chap3;

import java.io.Console;

public class console {
public static void main(String[] args) {
	Console obj = System.console();//used to obtain an instance of console class for the currently
	//running jvm
	String read = obj.readLine();
	//System.out.println(read);
}
}
