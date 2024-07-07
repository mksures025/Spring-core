package com.te.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDriver {
	
	public static void main(String[] args) {
		
	AbstractApplicationContext  context=	new ClassPathXmlApplicationContext("com/te/springcore/lifecycle/lifeconfig.xml");
		
	  Book book = context.getBean("book",Book.class);
	  
	  System.out.println(book);
	  
	  context.registerShutdownHook();
	  
	  
//	System.out.println("===================================");
//	
//	Pepsi pepsi = context.getBean("pepsi",Pepsi.class );
//	
//	System.out.println(pepsi);
	
	
	
	
	
	
	}

}
