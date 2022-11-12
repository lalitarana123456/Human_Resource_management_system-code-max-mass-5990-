package com.HRM.Departmentusecase;

import java.util.Scanner;

import com.HRM.dao.AdminDao;
import com.HRM.dao.AdminDaoImpl;
import com.HRM.dao.DepartmentDao;
import com.HRM.dao.DepartmentDaoImpl;
import com.HRM.dto.DepartmentDTO;

public class AddDepartmentUsecase {

	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department_id..");
		int depid = sc.nextInt();
		
		System.out.println("Enter department_name..");
		String depname = sc.next();
		
		System.out.println("Enter department_description...");
		String desc = sc.next();
		
		
		DepartmentDTO dep = new DepartmentDTO();
		dep.setDepid(depid);
		dep.setDepnamne(depname);
		dep.setDepdesc(desc);
		
		
		
		DepartmentDao ad = new DepartmentDaoImpl();
		
		String msg = ad.AddNewDepartments(dep);
		System.out.println(msg);
		
		
		
	}
	
	
	
	
}
