package com.HRM.dao;
import com.HRM.dto.*;
import com.HRM.exception.EmployeeException;
import com.HRM.utility.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	@Override
	public EmployeeDTO EmployeeLogin(String email, String password)throws EmployeeException {
		
        EmployeeDTO ad = new EmployeeDTO();
		
		try(Connection conn = DBUtility.ProvideConnection()){
   
			PreparedStatement ps = conn.prepareStatement("select * from employee where eemail=? AND epassword=?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				
				ad.setEmpid(rs.getInt("eid"));
				ad.setEmpname(rs.getString("ename"));
				ad.setEmpemail(rs.getString("eemail"));
				ad.setEmppassword(rs.getString("epassword"));
				ad.setEmpmobile(rs.getString("emobile"));
				
				
			}else {
				throw new EmployeeException("Not found..");
			}
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		return ad;
		
	}

	@Override
	public EmployeeDTO ViewProfile(int emplid) throws EmployeeException {
		    EmployeeDTO ad = new EmployeeDTO();
			
			try(Connection conn = DBUtility.ProvideConnection()){
	   
				PreparedStatement ps = conn.prepareStatement("select * from employee where eid=?");
				
				ps.setInt(1, emplid);
				
				
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					
					
					ad.setEmpid(rs.getInt("eid"));
					ad.setEmpname(rs.getString("ename"));
					ad.setEmpemail(rs.getString("eemail"));
					ad.setEmppassword(rs.getString("epassword"));
					ad.setEmpmobile(rs.getString("emobile"));
					
					
				}else {
					throw new EmployeeException("Not found..");
				}
				
				
				
			}catch (SQLException e) {
				e.printStackTrace();
				throw new EmployeeException(e.getMessage());
			}
			
			return ad;
	}

	@Override
	public String UpdateByName(String name, String newname) throws EmployeeException {
		String msg = "Name Updation fail..";
		
	    try (Connection conn = DBUtility.ProvideConnection()){
			
	    	PreparedStatement ps = conn.prepareStatement("UPDATE employee set ename=? where ename=?");
	    	ps.setString(1, newname);
	    	ps.setString(2, name);
	    	
	    	int x = ps.executeUpdate();
	    	if(x>0) {
	    		msg = "Name updated successfully..";
	    	}
	    	
	    	
		} catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public String UpdateByEmail(int empid, String email) throws EmployeeException {
		String msg = "Email Updation fail..";
		
	    try (Connection conn = DBUtility.ProvideConnection()){
			
	    	PreparedStatement ps = conn.prepareStatement("UPDATE employee set eemail=? where eid=?");
	    	ps.setString(1, email);
	    	ps.setInt(2, empid);
	    	
	    	int x = ps.executeUpdate();
	    	if(x>0) {
	    		msg = "Email updated successfully..";
	    	}
	    	
	    	
		} catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public String UpdateByPassword(int empid, String pass) throws EmployeeException {
        String msg = "Password Updation fail..";
		
	    try (Connection conn = DBUtility.ProvideConnection()){
			
	    	PreparedStatement ps = conn.prepareStatement("UPDATE employee set epassword=? where eid=?");
	    	ps.setString(1, pass);
	    	ps.setInt(2, empid);
	    	
	    	int x = ps.executeUpdate();
	    	if(x>0) {
	    		msg = "Password updated successfully..";
	    	}
	    	
	    	
		} catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public String UpdateByMobile(int empid, String phone) throws EmployeeException {
        String msg = "Mobile Updation fail..";
		
	    try (Connection conn = DBUtility.ProvideConnection()){
			
	    	PreparedStatement ps = conn.prepareStatement("UPDATE employee set emobile=? where eid=?");
	    	ps.setString(1, phone);
	    	ps.setInt(2, empid);
	    	
	    	int x = ps.executeUpdate();
	    	if(x>0) {
	    		msg = "Mobile updated successfully..";
	    	}
	    	
	    	
		} catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		
		return msg;
	}



}
