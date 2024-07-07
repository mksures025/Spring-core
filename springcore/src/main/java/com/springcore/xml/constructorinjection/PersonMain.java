package com.springcore.xml.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PersonMain {

	public static void main(String[] args) {
		
	
		BeanFactory beanFactory
		= new XmlBeanFactory(new ClassPathResource("/com/springcore/constructorinjection/ciconfig.xml"));
  ApplicationContext context=new ClassPathXmlApplicationContext("/com/springcore/constructorinjection/ciconfig.xml");
   
   Person person = context.getBean("person",Person.class);
		
		Person person1= beanFactory.getBean("person",Person.class);
   
   System.out.println(person);

	}

}
