package com.example.leave.service;

import java.util.List;

import com.example.leave.model.LeaveApplication;


public interface LeaveService 
{

    public LeaveApplication savedata(LeaveApplication l1);
	
	public List<LeaveApplication> getalldata();
	
	public LeaveApplication fetchinfobyleaveId(String  lid);	
	
	public List<LeaveApplication> fetchinfobyemployeeID(String eid); 
}
