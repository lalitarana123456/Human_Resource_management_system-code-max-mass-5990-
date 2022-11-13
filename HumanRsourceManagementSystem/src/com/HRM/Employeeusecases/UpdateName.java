package com.HRM.Employeeusecases;

import java.util.Scanner;

import com.HRM.dao.EmployeeDao;
import com.HRM.dao.EmployeeDaoImpl;
import com.HRM.exception.EmployeeException;

public class UpdateName {
	
	
public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employeeID. :");
		int id = sc.nextInt();
		
		System.out.println("Enter new_Name. :");
		String name = sc.next();
		
		EmployeeDao em = new EmployeeDaoImpl();
		try {
			String newpass = em.UpdateByName(id, name);
			
			System.out.println(newpass);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
	}

}
