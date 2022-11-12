package com.HRM.dao;

import java.util.List;

import com.HRM.dto.DepartmentDTO;
import com.HRM.exception.DepartmentException;

public interface DepartmentDao {
	
	
    public String AddNewDepartments(DepartmentDTO dep);
	
	public List<DepartmentDTO> showDepartments()throws DepartmentException;
	
	public String UpdateDepartmentNameById(int id)throws DepartmentException;
	
	public String UpdateDepartmentDescriptionById(int id)throws DepartmentException;
	
	public String UpdateDepartmentNameAndDepDescriptionByName(String name)throws DepartmentException;

	public String TransferToDepartment()throws DepartmentException;

}
