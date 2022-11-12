package com.HRM.dao;

import com.HRM.dto.LeaveDTO;
import com.HRM.exception.DepartmentException;
import com.HRM.exception.EmployeeException;
import com.HRM.exception.LeaveException;

public interface LeaveDao {
	
    public String ApplyLeave(LeaveDTO leave);//only chance to get SQLException so no need to throw department or employee exception;
 	
 	public String CheckLeaveStatus(int eid)throws DepartmentException,EmployeeException,LeaveException;
 	
 	public int LeaveRequest();
 	
 	public String UpdateLeaveRequest(String upd)throws LeaveException;
 	
}
