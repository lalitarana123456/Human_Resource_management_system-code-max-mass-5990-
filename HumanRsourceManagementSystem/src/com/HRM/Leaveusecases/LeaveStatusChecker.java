package com.HRM.Leaveusecases;

import java.util.Scanner;

import com.HRM.dao.LeaveDao;
import com.HRM.dao.LeaveDaoImpl;
import com.HRM.exception.DepartmentException;
import com.HRM.exception.EmployeeException;
import com.HRM.exception.LeaveException;

public class LeaveStatusChecker {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employeeID :");
		int id = sc.nextInt();
		
		
		LeaveDao l = new LeaveDaoImpl();
		try {
			String st = l.CheckLeaveStatus(id);
			System.out.println(st);
			
		} catch (DepartmentException | EmployeeException | LeaveException e) {
			
			e.printStackTrace();
		}
	}

}
