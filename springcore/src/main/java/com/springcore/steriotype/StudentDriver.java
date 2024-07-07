package com.springcore.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/springcore/steriotype/steriotypeconfig.xml");

		Student student = context.getBean("op",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress().getClass().getName());
		
		
		// to check scope annotation
		Student student2=context.getBean("op",Student.class);
		System.out.println("hashcode for student 1: "+student.hashCode());
		System.out.println("hashcode for student 2: "+student2.hashCode());
	}

}
