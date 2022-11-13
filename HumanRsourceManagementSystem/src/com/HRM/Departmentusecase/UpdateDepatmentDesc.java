package com.HRM.Departmentusecase;

import java.util.Scanner;

import com.HRM.dao.DepartmentDao;
import com.HRM.dao.DepartmentDaoImpl;
import com.HRM.exception.DepartmentException;

public class UpdateDepatmentDesc {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter DepartmentID :");
		int id = sc.nextInt();
		
		
		System.out.println("Enter new_description :");
		String desc = sc.next();
		
		
		DepartmentDao dep = new DepartmentDaoImpl();
		try {
			String res = dep.UpdateDepartmentDescriptionById(id, desc);
			
			System.out.println(res);
			
			
		} catch (DepartmentException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
