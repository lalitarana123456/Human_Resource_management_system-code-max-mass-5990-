package com.HRM.dto;

public class EmployeeDTO {
	
	private int empid;
	private String empname;
	private String empemail;
	private String emppassword;
	private String empmobile;
	private double empsalary;
	
	
	public EmployeeDTO() {
		
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getEmpmobile() {
		return empmobile;
	}
	public void setEmpmobile(String empmobile) {
		this.empmobile = empmobile;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeDTO [empid=" + empid + ", empname=" + empname + ", empemail=" + empemail + ", emppassword="
				+ emppassword + ", empmobile=" + empmobile + ", empsalary=" + empsalary + "]";
	}
	
	

}
