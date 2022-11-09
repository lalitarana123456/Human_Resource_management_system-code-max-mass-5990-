package com.HRM.dto;

public class DepartmentDTO {
	
	private int depid;
	private String depnamne;
	private String depdesc;
	
	
	
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDepnamne() {
		return depnamne;
	}
	public void setDepnamne(String depnamne) {
		this.depnamne = depnamne;
	}
	public String getDepdesc() {
		return depdesc;
	}
	public void setDepdesc(String depdesc) {
		this.depdesc = depdesc;
	}
	
	
	public DepartmentDTO() {
		
	}
	
	
	@Override
	public String toString() {
		return "DepartmentDTO [depid=" + depid + ", depnamne=" + depnamne + ", depdesc=" + depdesc + "]";
	}
	
	

}
