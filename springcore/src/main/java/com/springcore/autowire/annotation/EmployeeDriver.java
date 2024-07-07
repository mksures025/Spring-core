package com.springcore.autowire.annotation;

import com.springcore.autowire.annotation.Employe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/springcore/autowire/annotation/autowireconfig.xml");

		Employe emp1 = context.getBean("emp", Employe.class);

		System.out.println(emp1);
	}

}
