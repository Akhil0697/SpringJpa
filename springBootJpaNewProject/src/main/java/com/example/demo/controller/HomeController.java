package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class HomeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/")
	public String insertEmployee(Model model)
	{
		Employee employee = new Employee();
		employee.setName("Kishore");
		employee.setDesingnation("Manager");
		employee.setDepartment("Accounts");
		employee.setExp(22);
		
	    Employee emp = 	employeeService.saveEmployee(employee);
		String msg = "Employee "+emp.getName()+" with id "+emp.getId()+" is saved successfully";
		model.addAttribute("employee", emp);
		model.addAttribute("message",msg);
		return "home";
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
