package com.te.springcore.refinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Refmain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/te/springcore/refinjection/refconfig.xml");
	
		A a = context.getBean("refA",A.class);
		
		System.out.println(a);
		
		
	}


}
