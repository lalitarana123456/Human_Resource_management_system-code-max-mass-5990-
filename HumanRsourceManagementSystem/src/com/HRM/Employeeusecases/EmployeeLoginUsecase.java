package com.HRM.Employeeusecases;

import java.util.Scanner;

import com.HRM.dao.EmployeeDao;
import com.HRM.dao.EmployeeDaoImpl;
import com.HRM.dto.EmployeeDTO;
import com.HRM.exception.EmployeeException;

public class EmployeeLoginUsecase {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email :");
		String e = sc.next();
		
		System.out.println("Enter password :");
		String p = sc.next();
		
		
		EmployeeDao ad = new EmployeeDaoImpl();
		try {
			EmployeeDTO admin = ad.EmployeeLogin(e, p);
			
			System.out.println(admin);
		} catch (EmployeeException e1) {
			
			e1.printStackTrace();
		}
		
	}

}
