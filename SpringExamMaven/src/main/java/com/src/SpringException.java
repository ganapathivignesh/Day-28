package com.src;

public class SpringException extends RuntimeException{
	
	private String springException;
	
	public SpringException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public String getSpringException() {
		return springException;
	}

	public void setSpringException(String springException) {
		this.springException = springException;
	}
	

}
