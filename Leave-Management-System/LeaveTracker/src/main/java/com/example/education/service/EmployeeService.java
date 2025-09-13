package com.example.education.service;

import java.util.List;

import com.example.education.model.Employee;


public interface EmployeeService 
{

public Employee savepayment(Employee e1);
	
	public List<Employee> getallemployee();
	
	public Employee fetchinfobyemployeeId(String  eid);	
	
	
}
