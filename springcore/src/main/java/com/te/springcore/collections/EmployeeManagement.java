package com.te.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeManagement {
	public static void main(String[] args) {
		
		
	ApplicationContext context	=new ClassPathXmlApplicationContext("/com/te/springcore/collections/collectionconfig.xml");
		
	Employee employee1 = context.getBean("employee1",Employee.class);
	
	System.out.println(employee1);
	
    
	
	
	}

}
