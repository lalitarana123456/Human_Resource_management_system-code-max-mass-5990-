package com.HRM.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.HRM.dto.AdminDTO;
import com.HRM.exception.AdminException;
import com.HRM.utility.DBUtility;




public class AdminDaoImpl implements AdminDao{

	@Override
	public AdminDTO AdminLogin(String email,String password)throws AdminException {
	   
		AdminDTO ad = new AdminDTO();
		
		try(Connection conn = DBUtility.ProvideConnection()){
   
			PreparedStatement ps = conn.prepareStatement("select * from admin where aemail=? AND apassword=?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				AdminDTO admin  = new AdminDTO();
				admin.setAdminId(rs.getInt("aid"));
				admin.setAname(rs.getString("aname"));
				admin.setEmail(rs.getString("aemail"));
				admin.setPhone(rs.getString("aphone"));
				admin.setPassword(rs.getString("apassword"));
				
				
				ad = admin;
			}else {
				throw new AdminException("Not found..");
			}
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException(e.getMessage());
		}
		
		return ad;
		
	}

	

}
