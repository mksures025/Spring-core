package com.springcore.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/springcore/autowire/xml/autowireconfig.xml");

		Employee emp1 = context.getBean("emp1", Employee.class);
		
		System.out.println(emp1);
	}

}
