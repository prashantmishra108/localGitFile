package com.java.exception;


public class ArithmeticExceptionSub extends ArithmeticException{

    private static final long serialVersionUID = 1L;

    private final String errorType;
    private final ExceptionErrorMessages errorMessage;

    public ArithmeticExceptionSub(String errorType, ExceptionErrorMessages errorMessage) {
        super(errorMessage.message);
        this.errorType = errorType;
        this.errorMessage = errorMessage;
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getErrorType() {
		return errorType;
	}

	public ExceptionErrorMessages getErrorMessage() {
		return errorMessage;
	}
}

