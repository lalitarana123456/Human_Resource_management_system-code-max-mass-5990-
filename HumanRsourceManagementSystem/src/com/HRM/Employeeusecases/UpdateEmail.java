package com.HRM.Employeeusecases;

import java.util.Scanner;

import com.HRM.dao.EmployeeDao;
import com.HRM.dao.EmployeeDaoImpl;
import com.HRM.exception.EmployeeException;

public class UpdateEmail {
	
	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employeeID. :");
		int id = sc.nextInt();
		
		System.out.println("Enter new_Email. :");
		String email = sc.next();
		
		EmployeeDao em = new EmployeeDaoImpl();
		try {
			String newpass = em.UpdateByEmail(id, email);
			
			System.out.println(newpass);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
	}

}
