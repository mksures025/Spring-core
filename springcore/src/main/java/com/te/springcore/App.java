package com.te.springcore;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
     ApplicationContext context= new ClassPathXmlApplicationContext("com/te/springcore/config.xml");
     
//     Student student1 = (Student) context.getBean("student1");
     // 1st student object
     Student student1 = context.getBean("student1",Student.class);
     System.out.println(student1);
     
     //2nd student object
     
     Student student2 = context.getBean("student2",Student.class);
     
     System.out.println(student2);
     
     
    }
}
