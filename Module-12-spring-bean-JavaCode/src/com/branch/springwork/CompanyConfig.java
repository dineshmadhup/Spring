package com.branch.springwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:company.properties")
public class CompanyConfig {

	// add support to resolve ${...} properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	// define bean for MyEmployeeService
	@Bean
	public EmployeeService myEmployeeService() {
		return new MyEmployeeService();
	}

	// define bean for our Engineering Team AND inject dependency
	@Bean
	public Manager engineeringTeam() {
		return new EngineeringTeam(myEmployeeService());
	}

}
