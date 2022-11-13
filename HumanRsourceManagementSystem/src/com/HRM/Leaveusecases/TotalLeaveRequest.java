package com.HRM.Leaveusecases;

import com.HRM.dao.LeaveDao;
import com.HRM.dao.LeaveDaoImpl;

public class TotalLeaveRequest {
	
	public static void main(String[] args) {
		
		
		LeaveDao l = new LeaveDaoImpl();
		int count = l.LeaveRequest();
		System.out.println(count);
	}

}
