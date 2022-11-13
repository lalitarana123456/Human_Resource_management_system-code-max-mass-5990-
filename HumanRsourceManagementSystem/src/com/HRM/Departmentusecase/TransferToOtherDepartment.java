package com.HRM.Departmentusecase;

import java.util.Scanner;

import com.HRM.dao.DepartmentDao;
import com.HRM.dao.DepartmentDaoImpl;
import com.HRM.exception.DepartmentException;

public class TransferToOtherDepartment {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter employeeID..");
	    int id = sc.nextInt();
	    
	    System.out.println("Enter new_department_name");
	    String dname = sc.next();
	    
	    DepartmentDao de = new DepartmentDaoImpl();
	    
	    try {
			String msg = de.TransferToDepartment(dname, id);
			System.out.println(msg);
		} catch (DepartmentException e) {
			
			e.printStackTrace();
		}
	}

}
