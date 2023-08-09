package com.java.exception;

public class ProblemException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Problem problem;

    public ProblemException(Problem problem) {
		super();
		this.problem = problem;
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	
}
