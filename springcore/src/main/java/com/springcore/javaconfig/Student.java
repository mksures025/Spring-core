package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//Instead of annotated with component we create the object in the configurstion class
@Component("student")
public class Student {

//	private Samosa samosa;
//
//	public Student(Samosa samosa) {
//		super();
//		this.samosa = samosa;
//	}
//
//	public Samosa getSamosa() {
//		return samosa;
//	}
//
//	public void setSamosa(Samosa samosa) {
//		this.samosa = samosa;
//	}

	public void reading() {

	//	samosa.getDisplay();
		System.out.println("student reading book");

	}

}
