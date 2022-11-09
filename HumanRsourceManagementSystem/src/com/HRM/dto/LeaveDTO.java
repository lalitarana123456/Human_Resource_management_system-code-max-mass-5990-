package com.HRM.dto;

import java.sql.Date;

public class LeaveDTO {
	
	private Date from;
	private int totalday;
	private int empid;
	
	
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public int getTotalday() {
		return totalday;
	}
	public void setTotalday(int totalday) {
		this.totalday = totalday;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public LeaveDTO() {
		
	}
	@Override
	public String toString() {
		return "LeaveDTO [from=" + from + ", totalday=" + totalday + ", empid=" + empid + "]";
	}
	
	
	
	

}
