package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
// if object is created in configuration class for respected class then we no need to
// give @componentScan annotation
//@ComponentScan(basePackages = "com.springcore.javaconfig")

public class JavaConfig {
	
	// to get object using bean method 
	@Bean
	public Student getStudent() {
		
		Student student=new Student();
		
		return student;
	}
	
	
//	public Samosa getSamosa() {
//		
//		return new Samosa();
//	}
//	
//	@Bean (name= {"student","temp","con"})
//	public Student getStudent() {
//		
//		Student student=new Student(getSamosa());
//		
//		return student;
//	}
//	
	

}
