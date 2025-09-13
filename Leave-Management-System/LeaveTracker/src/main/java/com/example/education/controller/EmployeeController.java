package com.example.education.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.education.model.Employee;
import com.example.education.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:5173")
public class EmployeeController 
{
	@Autowired
	EmployeeService es;

	@PostMapping("/saveemployeedata")
	public Employee one(@RequestBody Employee e1)
	{
		e1.setEid(UUID.randomUUID().toString());
		Employee ek=es.savepayment(e1);
		return ek;
	}
	
	@GetMapping("/fetchemployeedata")
	public List<Employee> two()
	{
		List<Employee> e1=es.getallemployee();
		return e1;
		
	}
	
	@GetMapping("/fetchdatabyusingEmployeeID/{eid}")
	public Employee three(@PathVariable String eid)
	{
		Employee e = es.fetchinfobyemployeeId(eid);
		return e;
	}
	
	
	
}

