package chap3;

import java.util.Scanner;

public class ScannerDelimiter {
public static void main(String[] args) {
Scanner scanner = new Scanner("12, 42, 8m, 78, 99, 42");
scanner.useDelimiter("\\s*,\\s*");
while(scanner.hasNextInt())
System.out.println(scanner.nextInt());
Scanner scanner1 = new Scanner("one , 2three 4");
scanner1.useDelimiter("\\d");
while(scanner1.hasNext()){
	if(scanner1.hasNextInt())
System.out.println(scanner.nextInt());
scanner1.next();
}
String s ="one , 2three 4";
String a[] = s.split("\\d");
//System.out.println(a.length);
}}