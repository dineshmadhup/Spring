package com.branch.springwork;

public class EngineeringTeam implements Manager {


	private EmployeeService empService;


	public EngineeringTeam(EmployeeService empService) {
		this.empService = empService;
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
