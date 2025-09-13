package com.example.education.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Employee 
{

	@Id
	private String eid;
	private String ename;
	private String email;
	private String username;
	private String password;
	private String department;
	private String designation;
	private LocalDate joiningdate;
	
	@Transient
	private List<LeaveApplication> leave = new ArrayList<LeaveApplication>();

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}

	public List<LeaveApplication> getLeave() {
		return leave;
	}

	public void setLeave(List<LeaveApplication> leave) {
		this.leave = leave;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", department=" + department + ", designation=" + designation
				+ ", joiningdate=" + joiningdate + ", leave=" + leave + "]";
	}
	

	
}
