package com.exceptions;

public class CustomerExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomerExistException(String msg) {
		super(msg);
	}

}
