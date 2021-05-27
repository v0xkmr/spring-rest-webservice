package com.springboot.rest.webservices;

public class HelloWorldBean {

	private String message;
	
	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
