package com.example.education.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.education.model.Employee;
import com.example.education.model.LeaveApplication;
import com.example.education.repo.EmployeeRepo;
import com.example.education.service.EmployeeService;


@Service
public class EmployeeDao implements EmployeeService {

	
	@Autowired
	EmployeeRepo er;
	
	@Autowired
	RestTemplate r1;
	
	
	@Override
	public Employee savepayment(Employee e1) {
		return er.save(e1);
	}

	@Override
	public List<Employee> getallemployee() {
		return er.findAll();
	}

	@Override
	public Employee fetchinfobyemployeeId(String eid) {
		
		List<LeaveApplication>a1=r1.getForObject("http://localhost:7072/leave/fetchemployeeleavebyEmployeeId/"+eid, ArrayList.class);
		Employee e =  er.findById(eid).orElse(null);
		e.setLeave(a1);
		return e;
	}

}
