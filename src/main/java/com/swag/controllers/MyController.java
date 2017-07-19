package com.swag.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swag.Employee;

@RestController
public class MyController {
	
	@RequestMapping(value="/employee", method = RequestMethod.GET)
	public Employee firstpage() {
		Employee emp = new Employee();
		emp.setEmpid("1");
		emp.setName("xyz");
		
		return emp;
	}
		@RequestMapping(value = "/custom", method = RequestMethod.POST)
		public String employee() {
			return "emp";
		}
		
	
	
}
