package com.branch.springwork;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new	ClassPathXmlApplicationContext("applicationContext.xml");
		
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
