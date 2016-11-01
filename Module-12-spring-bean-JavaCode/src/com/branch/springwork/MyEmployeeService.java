package com.branch.springwork;


public class MyEmployeeService implements EmployeeService {

	@Override
	public String getMarketSaleStatus() {
		return "Market Sale is Current and Progressive!";
	}

}
