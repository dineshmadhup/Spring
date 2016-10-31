package com.branch.springwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("eng") //eng is the bean id
@Component
public class EngineeringTeam implements Manager {
	
	private EmployeeService empService;
	
//	@Autowired
//	public EngineeringTeam(EmployeeService empService) {
//		this.empService = empService;
//	}
	
	@Autowired
	public void setEmployeeService(EmployeeService empService) {
		this.empService = empService;
	}
	
	//Spring will scan for a component that
	//implements EmployeeService interface
	//our example: MyEmployeeService meets the requirements

	@Override
	public String getDailyTaskUpdate() {
		return "Engineering Team:getDailyTaskUpdate ---All Employee is updating daily task!";
	}

	@Override
	public String getDailySale() {
		return empService.getMarketSaleStatus();
	}


}
