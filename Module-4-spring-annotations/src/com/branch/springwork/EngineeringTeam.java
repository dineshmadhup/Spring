package com.branch.springwork;

import org.springframework.stereotype.Component;

@Component("eng") //eng is the bean id
//@Component
public class EngineeringTeam implements Manager {
	

	@Override
	public String getDailyTaskUpdate() {
		return "Engineering Team:getDailyTaskUpdate ---All Employee is updating daily task!";
	}


}
