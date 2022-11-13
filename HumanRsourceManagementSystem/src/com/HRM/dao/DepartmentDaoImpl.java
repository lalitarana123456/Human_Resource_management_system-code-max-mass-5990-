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
	public String UpdateDepartmentNameById(int id, String newname) throws DepartmentException {
        String msg = "Updation fail..";
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("UPDATE department SET dname=? where did=?");
			ps.setString(1, newname);
			ps.setInt(2, id);
		    int x = ps.executeUpdate();
		    
		    if(x>0) {
		    	msg  = "successfully updated ..";
		    	
		    }else {
		    	throw new DepartmentException("not found.");
		    }
		    
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentException(e.getMessage());
			
		}
		
		
		return msg;
	}

	@Override
	public String UpdateDepartmentDescriptionById(int id,String desc) throws DepartmentException {
        String msg = "Updation fail..";
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("UPDATE department SET ddesc=? where did=?");
			ps.setString(1, desc);
			ps.setInt(2, id);
		    int x = ps.executeUpdate();
		    
		    if(x>0) {
		    	msg  = "successfully updated ..";
		    	
		    }else {
		    	throw new DepartmentException("not found.");
		    }
		    
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentException(e.getMessage());
			
		}
		
		
		return msg;
	}

	@Override
	public String UpdateDepartmentNameAndDepDescriptionByName(String name,String desc, int depid) throws DepartmentException {
        String msg = "Updation fail..";
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("UPDATE department SET dname=?,ddesc=? where did=?");
			ps.setString(1, name);
			ps.setString(1, desc);
			ps.setInt(2, depid);
		    int x = ps.executeUpdate();
		    
		    if(x>0) {
		    	msg  = "successfully updated ..";
		    	
		    }else {
		    	throw new DepartmentException("not found.");
		    }
		    
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentException(e.getMessage());
			
		}
		
		
		return msg;
	}

	@Override
	public String TransferToDepartment(String dname,int id) throws DepartmentException {
        String msg = "Updation fail..";
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("UPDATE department SET dname=? where did=?");
			ps.setString(1, dname);
			ps.setInt(2, id);
		    int x = ps.executeUpdate();
		    
		    if(x>0) {
		    	msg  = "successfully updated ..";
		    	
		    }else {
		    	throw new DepartmentException("not found.");
		    }
		    
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentException(e.getMessage());
			
		}
		
		
		return msg;
	}

}
