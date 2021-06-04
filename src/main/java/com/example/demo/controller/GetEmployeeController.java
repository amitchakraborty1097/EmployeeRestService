package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class GetEmployeeController {

	@GetMapping("/getEmployee")
	public Employee greeting(@RequestParam(value = "name", defaultValue = "Welcome") String name) {
		Employee employee = new Employee(1234,"Amit Chakraborty","Bhopal","IT");
		return employee;
	}
}
