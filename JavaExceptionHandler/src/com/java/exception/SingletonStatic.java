package com.java.exception;

import java.util.Scanner;

public class SingletonStatic {

	
	public static void main(String[] args) {
		 int i = 5;
		/*
		 * Scanner in = new Scanner(System.in); int j = in.nextInt();
		 */
		try {
			int d = 5/0;
		}
		catch(ArithmeticException e) {
			ArithmeticExceptionSub e1 = new ArithmeticExceptionSub("5001", ExceptionErrorMessages.EXCEED_TEMPLATES_ALLOWED);
			e.printStackTrace();
			logError(e1);
		}
		
	}
	
	public static void logError(Exception ex) {
        
		System.out.println("logError");
        if (ex instanceof NumberFormatException) {
            throw new NumberFormatException("CONNECTION_ERROR_MESSAGE");
        } else if (ex instanceof ArithmeticExceptionSub) {
        	System.out.println("in");
            throw new ArithmeticExceptionSub(((ArithmeticExceptionSub) ex).getErrorType(), ((ArithmeticExceptionSub) ex).getErrorMessage());
        }
    }
}


