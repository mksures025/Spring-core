package com.te.springcore.lifecycle;

public class Example {

	private String subject;

	public Example() {
		super();
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	//@PostConstruct
	public void init() {
		System.out.println("i am from examble and initialize the bean");
	}
	
	public void destroy() {
		System.out.println("i am from examble and destroy the bean");
	}

}
