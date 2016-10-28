package com.branch.springwork;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new	ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Manager manager = context.getBean("eng", Manager.class);
		
		//call a method on the bean
		System.out.println(manager.getDailyTaskUpdate());
		
		
		//close the context
				
		context.close();

		
	
	}

}
