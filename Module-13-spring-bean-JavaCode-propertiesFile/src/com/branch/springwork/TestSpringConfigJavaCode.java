package com.branch.springwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfigJavaCode {

	public static void main(String[] args) {

		//load the spring configuration file
		AnnotationConfigApplicationContext context = 
				new	AnnotationConfigApplicationContext(CompanyConfig.class);
		
		//retrieve bean from spring container
		EngineeringTeam engTeam = context.getBean("engineeringTeam", EngineeringTeam.class);
		
		//call a method on the bean
		System.out.println(engTeam.getDailyTaskUpdate());
				
		//call a method to get daily sale update
		System.out.println(engTeam.getDailySale());
		
		// call new methods - properties value injected
		System.out.println("Email: " + engTeam.getEmail());
		
		System.out.println("Team: " + engTeam.getTeam());
		
				
		//close the context
				
		context.close();

		
	
	}

}
