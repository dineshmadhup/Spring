package com.branch.springwork;

public class EngineeringTeam implements Manager {
	
	//define a private field for dependency
	private EmployeeService empService;
	
	
	//define a constructor for dependency injection
	public EngineeringTeam(EmployeeService empService) {
		this.empService = empService;
	}
	

	@Override
	public String getDailyTaskUpdate() {
		return "Engineering Team:---All Employee is updating daily task!";
	}


	@Override
	public String getDailySale() {
		return "Engineering team:---" + empService.getMarketSaleStatus();
	}

}
