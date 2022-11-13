package com.HRM.Employeeusecases;

import java.util.Scanner;

import com.HRM.dao.EmployeeDao;
import com.HRM.dao.EmployeeDaoImpl;
import com.HRM.dto.EmployeeDTO;
import com.HRM.exception.EmployeeException;

public class ViewProfileUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee_id..");
		int id = sc.nextInt();
		
		
		EmployeeDao emp = new EmployeeDaoImpl();
		try {
			EmployeeDTO ep = emp.ViewProfile(id);
			
			System.out.println(ep);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
