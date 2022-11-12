package com.HRM.Employeeusecases;

import java.util.Scanner;

import com.HRM.dao.EmployeeDao;
import com.HRM.dao.EmployeeDaoImpl;
import com.HRM.dto.EmployeeDTO;

public class InsertEmployee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee_Id : ");
		int empid = sc.nextInt();
		
		System.out.println("Enter Employee_Name :");
		String empname = sc.next();
		
		System.out.println("Enter Employee_Email :");
		String empemail = sc.next();
		
		System.out.println("Enter Employee_Password :");
		String emppass = sc.next();
		
		System.out.println("Enter Employee_Phone_no. :");
		String empphone = sc.next();
		
		System.out.println("Enter Employee_Salary : ");
		double empsalary = sc.nextDouble();
		
		EmployeeDTO employee = new EmployeeDTO();
		employee.setEmpid(empid);
		employee.setEmpname(empname);
		employee.setEmpemail(empemail);
		employee.setEmppassword(emppass);
		employee.setEmpmobile(empphone);
		employee.setEmpsalary(empsalary);
		
		
		
		EmployeeDao emp = new EmployeeDaoImpl();
		String res = emp.EmployeeRegistration(employee);
		
		System.out.println(res);
	}

}
