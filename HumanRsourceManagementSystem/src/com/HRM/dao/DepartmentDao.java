package com.HRM.dao;

import java.util.List;

import com.HRM.dto.DepartmentDTO;
import com.HRM.exception.DepartmentException;

public interface DepartmentDao {
	
	
    public String AddNewDepartments(DepartmentDTO dep);
	
	public List<DepartmentDTO> showDepartments()throws DepartmentException;
	
	public String UpdateDepartmentNameById(int id , String newname)throws DepartmentException;
	
	public String UpdateDepartmentDescriptionById(int id,String desc)throws DepartmentException;
	
	public String UpdateDepartmentNameAndDepDescriptionByName(String name,String desc,int depid)throws DepartmentException;

	public String TransferToDepartment(String dname,int id)throws DepartmentException;

}
