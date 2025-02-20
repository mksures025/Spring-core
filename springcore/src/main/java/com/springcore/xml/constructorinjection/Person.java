package com.springcore.xml.constructorinjection;

public class Person {
	
	private String name;
	private int personId;
	
	public Person() {
		super();
	}

	public Person(String name, int personId) {
		super();
		this.name = name;
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + "]";
	}

}
