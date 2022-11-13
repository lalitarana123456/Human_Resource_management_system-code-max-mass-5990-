package com.HRM.dto;

import java.sql.Date;

public class LeaveDTO {
	
	private String from;
	private int totalday;
	private int empid;
	private String status = "pending";
	
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
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
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LeaveDTO() {
		
	}
	@Override
	public String toString() {
		return "LeaveDTO [from=" + from + ", totalday=" + totalday + ", empid=" + empid + "]";
	}
	
	
	
	

}
