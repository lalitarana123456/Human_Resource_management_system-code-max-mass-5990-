package com.HRM.dto;

public class AdminDTO {
	
	private int adminId;
	private String aname;
	private String email;
	private String phone;
	private String password;
	
	public AdminDTO() {
		
	}
	
																																									
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	@Override
	public String toString() {
		return "AdminDTO [adminId=" + adminId + ", aname=" + aname + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + "]";
	}
	
	
	
	
	
}
