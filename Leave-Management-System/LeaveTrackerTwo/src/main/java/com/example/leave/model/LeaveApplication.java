package com.example.leave.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveApplication 
{
    @Id
	public String lid;
	
	public String eid;
	
	public String ltype;
	public String lreason;
	private LocalDate adate;
	private LocalDate sdate;
	private LocalDate edate;
	private String remleaves;
	private String lstatus;
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getLtype() {
		return ltype;
	}
	public void setLtype(String ltype) {
		this.ltype = ltype;
	}
	public String getLreason() {
		return lreason;
	}
	public void setLreason(String lreason) {
		this.lreason = lreason;
	}
	public LocalDate getAdate() {
		return adate;
	}
	public void setAdate(LocalDate adate) {
		this.adate = adate;
	}
	public LocalDate getSdate() {
		return sdate;
	}
	public void setSdate(LocalDate sdate) {
		this.sdate = sdate;
	}
	public LocalDate getEdate() {
		return edate;
	}
	public void setEdate(LocalDate edate) {
		this.edate = edate;
	}
	public String getRemleaves() {
		return remleaves;
	}
	public void setRemleaves(String remleaves) {
		this.remleaves = remleaves;
	}
	public String getLstatus() {
		return lstatus;
	}
	public void setLstatus(String lstatus) {
		this.lstatus = lstatus;
	}
	@Override
	public String toString() {
		return "LeaveApplication [lid=" + lid + ", eid=" + eid + ", ltype=" + ltype + ", lreason=" + lreason
				+ ", adate=" + adate + ", sdate=" + sdate + ", edate=" + edate + ", remleaves=" + remleaves
				+ ", lstatus=" + lstatus + "]";
	}
	
}
