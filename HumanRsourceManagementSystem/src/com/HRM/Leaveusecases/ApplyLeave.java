package com.HRM.Leaveusecases;

import java.util.Scanner;

import com.HRM.dao.LeaveDao;
import com.HRM.dao.LeaveDaoImpl;
import com.HRM.dto.LeaveDTO;

public class ApplyLeave {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee_id :");
		int id = sc.nextInt();
		
		System.out.println("Enter date leave from.. :");
	    String d = sc.next();
		
		System.out.println("Enter total_day of leave :");
		int l = sc.nextInt();
		
		LeaveDTO le = new LeaveDTO();
		le.setEmpid(id);
		le.setFrom(d);
		le.setTotalday(l);
		
		
		LeaveDao leave = new LeaveDaoImpl();
		String msg = leave.ApplyLeave(le);
		
		System.out.println(msg);
		
		
		
		
	}

}
