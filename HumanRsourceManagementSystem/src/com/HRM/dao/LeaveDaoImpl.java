package com.HRM.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.HRM.dto.LeaveDTO;
import com.HRM.exception.DepartmentException;
import com.HRM.exception.EmployeeException;
import com.HRM.exception.LeaveException;
import com.HRM.utility.DBUtility;

public class LeaveDaoImpl implements LeaveDao{

	
	@Override
	public String ApplyLeave(LeaveDTO leave){
		
		
		String msg = "Leave process fail..";
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into leaves values(?,?,?,?)");
			ps.setInt(1, leave.getEmpid());
			ps.setString(2, leave.getFrom());
			ps.setInt(3, leave.getTotalday());
			ps.setString(4, "pending");
			
			int x = ps.executeUpdate();

					
			if(x>0) {
				msg = "leave applied successfully..";
			}
			
			
			
		}catch (SQLException e) {
		
			e.printStackTrace();
			
		}
		
		
		return msg;
	}

	@Override
	public String CheckLeaveStatus(int eid) throws DepartmentException, EmployeeException,LeaveException {
		String msg = "in progress..";
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			
			PreparedStatement ps = conn.prepareStatement("select status from leaves where empid=? ");
			ps.setInt(1, eid);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				msg = rs.getString("status");
			}else {
				throw new LeaveException(" not found..");
			}
			
			
		}catch (SQLException e) {
			
			e.printStackTrace();
			throw new LeaveException(e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public int LeaveRequest() {
		int req = 0;
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select status from leaves where status=?");
			ps.setString(1, "pending");
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				req++;
				
				
			}
			
			
			
			
			
		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		
		
		
		return req;
	}

	@Override
	public String UpdateLeaveRequest(String update)throws LeaveException {
		
		String upd = "Updation fail..";
		
		try(Connection conn = DBUtility.ProvideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("Update leaves set status=? where status=?");
			ps.setString(1, update);
			ps.setString(2, "pending");
			int x = ps.executeUpdate();
			
			
			if(x>0) {
				upd = "successfuly updated..";
			}else {
				throw new LeaveException("Not found..");
			}
			
		}catch (SQLException e) {
			
			e.printStackTrace();
			throw new LeaveException(e.getMessage());
	
		}
		
		
		
		return upd;
	}

}
