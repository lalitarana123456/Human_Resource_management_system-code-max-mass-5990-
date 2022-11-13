package com.HRM.Departmentusecase;

import java.util.Scanner;

import com.HRM.dao.DepartmentDao;
import com.HRM.dao.DepartmentDaoImpl;
import com.HRM.exception.DepartmentException;

public class UpdateDescAndName {
	
	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter new_name :");
		String name = sc.next();
		
		System.out.println("Enter new_description :");
		String desc = sc.next();
		
		System.out.println("Enter DepartmentID :");
		int id = sc.nextInt();
		
		
		DepartmentDao dep = new DepartmentDaoImpl();
		try {
			String res = dep.UpdateDepartmentNameAndDepDescriptionByName(name, desc, id);
			
			System.out.println(res);
			
			
		} catch (DepartmentException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	

}
