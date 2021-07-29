package com.phoenix.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * @author md.faisal
 * @version 1.0
 * @creation date 28-Jul-2021
 */
//Bean class of spring- it subscribe spring frame work
@Component
public class Greeting {

	@Value("Happy Birthday!")
	private String message;
	
	public Greeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Greeting object is created");
	}
	
	//business logic method
	public String greet() {
		return message;
	}
	
}
