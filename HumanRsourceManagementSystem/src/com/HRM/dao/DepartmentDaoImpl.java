package com.HRM.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.HRM.dto.DepartmentDTO;
import com.HRM.exception.DepartmentException;
import com.HRM.utility.DBUtility;

public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public String AddNewDepartments(DepartmentDTO dep) {
		String msg = "adding process fail..";
		
	    try (Connection conn = DBUtility.ProvideConnection()){
	    	
	    	PreparedStatement ps = conn.prepareStatement("insert into department values(?,?,?)");
	    	
	    	ps.setInt(1, dep.getDepid());
	    	ps.setString(2, dep.getDepnamne());
	    	ps.setString(3, dep.getDepdesc());
	    	
	    	int  x = ps.executeUpdate();
	    
	    	if(x>0) {
	    		msg = "department added successfully..";
	    	}
	    	
	    	
	    	
	    }catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
			
		}
		
		return msg;
		
	}

	@Override
	public List<DepartmentDTO> showDepartments() throws DepartmentException {

        List<DepartmentDTO> dep = new ArrayList<>();
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps =conn.prepareStatement("select * from department");
		    ResultSet rs = ps.executeQuery();	
			
		    while(rs.next()) {
		    	
		    	DepartmentDTO d = new DepartmentDTO();
		    	d.setDepid(rs.getInt("did"));
		    	d.setDepnamne(rs.getString("dname"));
		    	d.setDepdesc(rs.getString("ddesc"));
		    	
		    	
		    	dep.add(d);
		    }
		 
			
		}catch (SQLException e) {
		
			e.printStackTrace();
			throw new DepartmentException("Not found...");
			
		}
		
		
		return dep;
		
	}

	@Override
	public String UpdateDepartmentNameById(int id) throws DepartmentException {
        String msg = "Updation fail..";
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("UPDATE department SET did=? where did=?");
		    int x = ps.executeUpdate();
		    
		}catch (SQLException e) {
			
		}
		
		
		return msg;
	}

	@Override
	public String UpdateDepartmentDescriptionById(int id) throws DepartmentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateDepartmentNameAndDepDescriptionByName(String name) throws DepartmentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String TransferToDepartment() throws DepartmentException {
		// TODO Auto-generated method stub
		return null;
	}

}
