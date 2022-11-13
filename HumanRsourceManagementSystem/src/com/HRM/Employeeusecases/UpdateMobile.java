package com.HRM.Employeeusecases;

import java.util.Scanner;

import com.HRM.dao.EmployeeDao;
import com.HRM.dao.EmployeeDaoImpl;
import com.HRM.exception.EmployeeException;

public class UpdateMobile {
	
	
public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employeeID. :");
		int id = sc.nextInt();
		
		System.out.println("Enter new_mobile no. :");
		String phone = sc.next();
		
		EmployeeDao em = new EmployeeDaoImpl();
		try {
			String newpass = em.UpdateByMobile(id, phone);
			
			System.out.println(newpass);
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
	}

}
