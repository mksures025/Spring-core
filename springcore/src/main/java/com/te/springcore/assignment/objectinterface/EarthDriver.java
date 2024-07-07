package com.te.springcore.assignment.objectinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EarthDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context=
		new ClassPathXmlApplicationContext("/com/te/springcore/assignment/objectinterface/interfaceconfig.xml");
		
		Earth earth = context.getBean("earth",Earth.class);
		
		System.out.println(earth);
		String creatureName = earth.getCreature().creatureName();
		String creatureType = earth.getCreature().creatureType();
		
		System.out.println("Frmom human object Creature Name : "+creatureName);
		System.out.println("Frmom human object Creature Type : "+creatureType);
		
		
	}

}
