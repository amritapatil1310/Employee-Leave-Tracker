package com.example.leave.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.leave.model.LeaveApplication;
import com.example.leave.repo.LeaveRepo;
import com.example.leave.service.LeaveService;

@Service
public class LeaveDao implements LeaveService 
{
	
	@Autowired
	LeaveRepo lr;


	
	@Override
	public LeaveApplication savedata(LeaveApplication l1) {
		return lr.save(l1);
	}

	@Override
	public List<LeaveApplication> getalldata() {
		return lr.findAll();
	}

	@Override
	public LeaveApplication fetchinfobyleaveId(String lid) {
		return lr.findById(lid).orElse(null);
	}

	@Override
	public List<LeaveApplication> fetchinfobyemployeeID(String eid) {
		return lr.findByEid(eid);
	}

}
