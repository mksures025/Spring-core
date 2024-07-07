package com.springcore.steriotype;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@Component("op")
@Scope("prototype")
public class Student {

	@Value("suresh")
	private String studentName;
	@Value("chennai")
	private String city;
	
	// to inject list from xml file 
	@Value("#{temp}")
	private List<String> address;
 
	public Student() {
		super();
	}

	public Student(String studentName, String city, List<String> address) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}

	

}
