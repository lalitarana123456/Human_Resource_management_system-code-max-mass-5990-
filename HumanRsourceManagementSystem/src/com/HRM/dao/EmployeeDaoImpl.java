package com.HRM.dao;
import com.HRM.dto.*;
import com.HRM.exception.EmployeeException;
import com.HRM.utility.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String EmployeeRegistration(EmployeeDTO emp) {
		
		String message = "registeration process fail..";
		
		try (Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			ps.setInt(1, emp.getEmpid());
			ps.setString(2, emp.getEmpname());
			ps.setString(3, emp.getEmpemail());
			ps.setString(4, emp.getEmppassword());
			ps.setString(5, emp.getEmpmobile());
			ps.setDouble(6, emp.getEmpsalary());
			
			
			int x = ps.executeUpdate();
			if(x>0) {
				message = "Registeration successfully..";
			}
			
			
			
		}catch (SQLException e) {
			
			message = e.getMessage();
		}
		
		
		return message;
		
	}



}
