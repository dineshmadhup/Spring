package com.branch.springwork;

public class MarkettingTeam implements Manager {
	

	//define a private field for dependency
	private EmployeeService empService;
	
	
	//define a constructor for dependency injection
	public MarkettingTeam(EmployeeService empService) {
		this.empService = empService;
	}
	

	@Override
	public String getDailyTaskUpdate() {
		return "Marketting team:--- Working hard to make customer happy";
	}

	@Override
	public String getDailySale() {
	
		return "Marketting team:--- " + empService.getMarketSaleStatus();
	}


}
