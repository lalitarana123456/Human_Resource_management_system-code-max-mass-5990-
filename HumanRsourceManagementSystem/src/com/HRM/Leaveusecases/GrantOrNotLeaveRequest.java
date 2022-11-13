package com.HRM.Leaveusecases;

import java.util.Scanner;

import com.HRM.dao.LeaveDao;
import com.HRM.dao.LeaveDaoImpl;
import com.HRM.exception.LeaveException;

public class GrantOrNotLeaveRequest {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Reject/Accept ..");
		String lest = sc.next();
		
		
		LeaveDao l = new LeaveDaoImpl();
		try {
			String lup = l.UpdateLeaveRequest(lest);
			
			System.out.println(lup);
		} catch (LeaveException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
