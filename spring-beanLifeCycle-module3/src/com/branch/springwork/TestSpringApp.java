package com.branch.springwork;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new	ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Manager manager = context.getBean("myTeam", Manager.class);
		
		//call methods on the bean
		System.out.println(manager.getDailyTaskUpdate());
		
		//call our new methods
		System.out.println(manager.getDailySale());
		

		//close the context
		context.close();
	
	}

}
