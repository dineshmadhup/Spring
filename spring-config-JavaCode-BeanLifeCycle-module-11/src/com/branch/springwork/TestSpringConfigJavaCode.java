package com.branch.springwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfigJavaCode {

	public static void main(String[] args) {

		//load the spring configuration file
		AnnotationConfigApplicationContext context = 
				new	AnnotationConfigApplicationContext(CompanyConfig.class);
		
		//retrieve bean from spring container
		Manager manager = context.getBean("engineeringTeam", Manager.class);
		
		//call a method on the bean
		System.out.println(manager.getDailyTaskUpdate());
				
		//call a method to get daily sale update
		System.out.println(manager.getDailySale());
		
				
		//close the context
				
		context.close();

		
	
	}

}
