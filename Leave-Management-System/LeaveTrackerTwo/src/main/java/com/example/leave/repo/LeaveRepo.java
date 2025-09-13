package com.example.leave.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.leave.model.LeaveApplication;

public interface LeaveRepo extends JpaRepository<LeaveApplication, String>
{

	public List<LeaveApplication> findByEid(String eid);
}
