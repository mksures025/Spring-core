package com.springcore.javaconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DemoMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		  // directly using string present in component annotation
		//Student student = context.getBean("student", Student.class);
		
		//using method signature to get bean 
		Student student = context.getBean("getStudent", Student.class);
		// Student student = context.getBean("temp",Student.class);

		// BeanFactory factory=new XmlBeanFactory(new ClassPathResource(null));

		System.out.println(student);
		student.reading();
	}

}
