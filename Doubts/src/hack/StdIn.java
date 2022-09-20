package hack;

import java.util.Scanner;

public class StdIn {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	//String myString = scanner.next();
try {
	int myInt1 = scanner.nextInt();
	int myInt2 = scanner.nextInt();
	int myInt3 = scanner.nextInt();
	scanner.close()		;

//	System.out.println("myString is: " + myString);
	System.out.println("myInt is: " + myInt1);
	System.out.println("myInt is: " + myInt2);
	System.out.println("myInt is: " + myInt3);
    }
catch (Exception e) {
	//e.printStackTrace();java.util.InputMismatchException
	System.out.println("java.util.InputMismatchException");
}
}
}
