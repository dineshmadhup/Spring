package com.branch.springwork;

import org.springframework.beans.factory.annotation.Value;

public class EngineeringTeam implements Manager {


	private EmployeeService empService;
	
	@Value("${foo.email}") //field level injection
	private String email;
	
	@Value("${foo.team}") //field level injection
	private String team;

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

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
