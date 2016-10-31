package com.branch.springwork;

import org.springframework.stereotype.Component;

@Component
public class SalesEmployeeService implements EmployeeService {

	@Override
	public String getMarketSaleStatus() {
		
		return "I am Sales Employee group";
	}

}
