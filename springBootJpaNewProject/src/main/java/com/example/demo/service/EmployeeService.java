package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;



public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findById(long id);
	public List<Employee> findAll();
	

}
