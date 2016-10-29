package com.branch.springwork;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("eng") //eng is the bean id
@Component
@Scope("singleton")
// @Scope("prototype")
public class EngineeringTeam implements Manager {

	// Using @Qualifier with field
	// @Autowired
	// @Qualifier("randomEmployeeService")
	private EmployeeService empService;

	@Autowired
	public EngineeringTeam(@Qualifier("salesEmployeeService") EmployeeService empService) {
		this.empService = empService;
	}

	// Spring will scan for a component that
	// implements EmployeeService interface
	// our example: MyEmployeeService meets the requirements

	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Engineering team: inside my doMyStartupStuff()");
	}

	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Engineering team: inside my ddoMyCleanupStuff()");
	}

	@Override
	public String getDailyTaskUpdate() {
		return "Engineering Team:getDailyTaskUpdate ---All Employee is updating daily task!";
	}

	@Override
	public String getDailySale() {
		return empService.getMarketSaleStatus();
	}

}
