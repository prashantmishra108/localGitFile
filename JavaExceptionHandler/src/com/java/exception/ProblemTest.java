package com.java.exception;

public class ProblemTest {

	public static void main(String[] args) {
		
		
		try {
			Problem p = new Problem();
			p.setTitle("First");
			p.setType("Second");
//			new ProblemException(p).get
			throw new ProblemException(p);
			
		}
		catch(ArithmeticException e) {
			//ArithmeticExceptionSub e1 = new ArithmeticExceptionSub("5001", ExceptionErrorMessages.EXCEED_TEMPLATES_ALLOWED);
			e.printStackTrace();
			logError(e);
		}
		
	}
	
	public static void logError(Exception ex) {
        System.out.println("logError");
        if (ex instanceof ProblemException && "1".equals("2")) {
        	System.out.println("Exception Problem:");
        	System.out.println(((ProblemException) ex).getProblem().getTitle());
        	throw (ProblemException)ex;
		} /*
			 * else if (ex instanceof ArithmeticExceptionSub) { System.out.println("in");
			 * throw new ArithmeticExceptionSub(((ArithmeticExceptionSub)
			 * ex).getErrorType(), ((ArithmeticExceptionSub) ex).getErrorMessage()); }
			 */
    }
}