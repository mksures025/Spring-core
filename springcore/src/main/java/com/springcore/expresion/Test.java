package com.springcore.expresion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=
			new ClassPathXmlApplicationContext("/com/springcore/expresion/expresionconfig.xml");
		
		 Demo demo = context.getBean("demo",Demo.class);
		
		System.out.println(demo);
		
		SpelExpressionParser expression=new SpelExpressionParser();
		Expression parseExpression = expression.parseExpression("2+5");
		System.out.println(parseExpression.getValue());
		
		
		
	}

	
	
	
	
	
}
