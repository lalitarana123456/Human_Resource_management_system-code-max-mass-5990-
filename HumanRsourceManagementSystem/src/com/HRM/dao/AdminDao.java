package com.HRM.dao;

import com.HRM.dto.AdminDTO;
import com.HRM.exception.AdminException;

public interface AdminDao {
	
	public AdminDTO AdminLogin(String email,String password)throws AdminException;
	

	

}
