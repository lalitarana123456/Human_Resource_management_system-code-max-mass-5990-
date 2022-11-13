package com.HRM.dao;

import com.HRM.dto.LeaveDTO;
import com.HRM.exception.DepartmentException;
import com.HRM.exception.EmployeeException;
import com.HRM.exception.LeaveException;

public interface LeaveDao {
	
    public String ApplyLeave(LeaveDTO leave);//to apply leave
    //only chance to get SQLException so no need to throw department or employee exception;
 	
 	public String CheckLeaveStatus(int eid)throws DepartmentException,EmployeeException,LeaveException;//to check leave is granted or not
 	
 	public int LeaveRequest();//admin will check is there any leave request
 	
 	public String UpdateLeaveRequest(String upd)throws LeaveException;//admin will update the leave request
 	
}
