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
			
			PreparedStatement ps = conn.prepareStatement("insert into leaves values(?,?,?)");
			
			
			int x = ps.executeUpdate();
			ps.setDate(1, leave.getFrom());
			ps.setInt(2, leave.getTotalday());
			ps.setInt(3, leave.getEmpid());
			ps.setString(4, "pending..");
			
			
			
			
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
