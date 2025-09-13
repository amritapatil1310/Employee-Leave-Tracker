package com.example.leave.controller;

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

import com.example.leave.model.LeaveApplication;
import com.example.leave.service.LeaveService;

@RestController
@RequestMapping("/leave")
@CrossOrigin(origins = "http://localhost:5173")
public class LeaveController 
{
	@Autowired
	LeaveService ls;
	
	
	@PostMapping("/saveLeavedata")
	public LeaveApplication one(@RequestBody LeaveApplication l1)
	{
		l1.setLid(UUID.randomUUID().toString());
		LeaveApplication lk=ls.savedata(l1);
		return lk;
	}
	
	@GetMapping("/fetchalldata")
	public List<LeaveApplication> two()
	{
		List<LeaveApplication> l1=ls.getalldata();
		return l1;
		
	}
	
	@GetMapping("/fetchdatabyusingLeaveID/{lid}")
	public LeaveApplication three(@PathVariable String lid)
	{
		LeaveApplication la = ls.fetchinfobyleaveId(lid);
		return la;
	}
	
	@GetMapping("/fetchemployeeleavebyEmployeeId/{eid}")
	public List<LeaveApplication> four(@PathVariable String eid)
	{
		return ls.fetchinfobyemployeeID(eid);
		
	}
	
	

}

