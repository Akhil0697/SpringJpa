package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class HomeController {
	private EmployeeService employeeService;
	@GetMapping("/")
	public String insertEmployee()
	{
		Employee employee = new Employee();
		employee.setName("Kishore");
		employee.setDesingnation("Manager");
		employee.setDepartment("Accounts");
		employee.setExp(22);
		
	Employee emp = 	employeeService.saveEmployee(employee);
		return "Employee "+emp.getName()+" with id "+emp.getId()+" is saved successfully";
	}
	
	@PostMapping("/")
	public String insertEmployee1()
	{
		Employee employee = new Employee();
		employee.setName("Kishore");
		employee.setDesingnation("Manager");
		employee.setDepartment("Accounts");
		employee.setExp(22);
		
	Employee emp = 	employeeService.saveEmployee(employee);
		return "Employee "+emp.getName()+" with id "+emp.getId()+" is saved successfully";
	}
}
