package com.springcore.xml.constructorinjection.objectinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeManagementSystem {
	
	public static void main(String[] args) {
		
 ApplicationContext context=
		 new ClassPathXmlApplicationContext("/com/springcore/constructorinjection/objectinj/objectconfig.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee);
		
		Addition addition = context.getBean("addition",Addition.class);
		
		addition.sum();
	}

}
