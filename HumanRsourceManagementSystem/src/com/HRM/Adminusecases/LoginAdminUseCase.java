package com.HRM.Adminusecases;

import java.util.Scanner;

import com.HRM.dao.AdminDao;
import com.HRM.dao.AdminDaoImpl;
import com.HRM.dto.AdminDTO;
import com.HRM.exception.AdminException;

public class LoginAdminUseCase {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email :");
		String e = sc.next();
		
		System.out.println("Enter password :");
		String p = sc.next();
		
		
		AdminDao ad = new AdminDaoImpl();
		try {
			AdminDTO admin = ad.AdminLogin(e, p);
			
			System.out.println(admin);
		} catch (AdminException e1) {
			
			e1.printStackTrace();
		}
		
		
		
	}
	

}
