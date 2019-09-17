package com.exceptions;

public class CustomerDoesNotExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomerDoesNotExistException(String msg) {
		super(msg);
	}

}
