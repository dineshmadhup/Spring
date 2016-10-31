package com.branch.springwork;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomEmployeeService implements EmployeeService {

	// create a array of random employee
	private String[] empSales = { "Peter sales is Excellent", "John sales is poor for this month",
			"Kim is very good on sales", "Rodney is doing well on sales" };

	// create a random number
	private Random myRandom = new Random();

	@Override
	public String getMarketSaleStatus() {

		// pick the random string from array
		int index = myRandom.nextInt(empSales.length);

		String bestEmp = empSales[index];

		return bestEmp;

	}

}
