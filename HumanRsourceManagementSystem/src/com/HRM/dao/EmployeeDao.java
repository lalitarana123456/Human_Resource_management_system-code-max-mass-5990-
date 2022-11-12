package com.HRM.dao;
import com.HRM.dto.*;
import com.HRM.exception.EmployeeException;

public interface EmployeeDao {

	
	public String EmployeeRegistration(EmployeeDTO emp);
	
	public EmployeeDTO EmployeeLogin(String email,String password)throws EmployeeException;
	
 	public EmployeeDTO ViewProfile(int emplid)throws EmployeeException;
 	
 	public String UpdateByName(String name,String newname)throws EmployeeException;
 	
 	public String UpdateByEmail(int empid,String email)throws EmployeeException;
 	
 	public String UpdateByPassword(int empid,String pass)throws EmployeeException;
 	
 	public String UpdateByMobile(int empid,String phone)throws EmployeeException;

 	
	

}
