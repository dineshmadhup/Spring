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
	
	// add an init method
		public void doMyStartupStuff() {
			System.out.println("MarkettingTeam: doMyStartupStuff--- inside method doMyStartupStuff");
		}
		
	// add a destroy method
		public void doMyCleanupStuff() {
			System.out.println("MarkettingTeam: doMyCleanupStuff---: inside method doMyCleanupStuff");
		}


}
