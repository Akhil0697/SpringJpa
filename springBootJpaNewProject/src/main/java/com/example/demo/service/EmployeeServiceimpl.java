package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}

	@Override
	public Employee findById(long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
}
