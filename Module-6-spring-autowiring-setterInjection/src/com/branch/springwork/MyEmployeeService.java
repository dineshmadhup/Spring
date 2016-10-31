package com.branch.springwork;

import org.springframework.stereotype.Component;

@Component // spring will scan all component and add
public class MyEmployeeService implements EmployeeService {

	@Override
	public String getMarketSaleStatus() {
		return "Market Sale is Current and Progressive!";
	}

}
