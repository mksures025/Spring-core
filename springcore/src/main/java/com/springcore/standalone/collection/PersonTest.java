package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/springcore/standalone/collection/standaloneconfig.xml");
		
		Person person = context.getBean("person1",Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("==============================");
		System.out.println(person.getFeatures());
		System.out.println(person.getFeatures().getClass().getName());
		System.out.println("==============================");
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());

		
	}

}
