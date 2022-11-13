package com.HRM.Departmentusecase;

import java.util.List;

import com.HRM.dao.DepartmentDao;
import com.HRM.dao.DepartmentDaoImpl;
import com.HRM.dto.DepartmentDTO;
import com.HRM.exception.DepartmentException;

public class ShowDepartmentUsecases {
	
	
	public static void main(String[] args) {
		
		DepartmentDao ad = new DepartmentDaoImpl();
		try {
			
			List<DepartmentDTO> deps = ad.showDepartments();
			System.out.println(deps);
			
			
			
		} catch (DepartmentException e) {
			
			e.printStackTrace();
		}
	}

}
