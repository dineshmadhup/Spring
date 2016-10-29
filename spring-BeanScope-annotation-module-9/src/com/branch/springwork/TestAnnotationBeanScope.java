package com.branch.springwork;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAnnotationBeanScope {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new	ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Manager manager = context.getBean("engineeringTeam", Manager.class);
		
		Manager myManager = context.getBean("engineeringTeam", Manager.class);
		
		// check if they are the same
		
		boolean result = (manager == myManager);
				
		// print out the result
		System.out.println("\nPoint to the same object: "+ result);
				
		System.out.println("\nMemory location for manager: "+ manager);
				
		System.out.println("\nMemory location for myManager: "+ myManager);
				
		//close the context
				
		context.close();

		
	
	}

}
