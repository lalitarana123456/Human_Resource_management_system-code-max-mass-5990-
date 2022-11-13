package com.HRM.Langing_page;

import java.util.List;
import java.util.Scanner;

import com.HRM.dao.AdminDao;
import com.HRM.dao.AdminDaoImpl;
import com.HRM.dao.DepartmentDao;
import com.HRM.dao.DepartmentDaoImpl;
import com.HRM.dao.EmployeeDao;
import com.HRM.dao.EmployeeDaoImpl;
import com.HRM.dao.LeaveDao;
import com.HRM.dao.LeaveDaoImpl;
import com.HRM.dto.AdminDTO;
import com.HRM.dto.DepartmentDTO;
import com.HRM.dto.EmployeeDTO;
import com.HRM.dto.LeaveDTO;
import com.HRM.exception.AdminException;
import com.HRM.exception.DepartmentException;
import com.HRM.exception.EmployeeException;
import com.HRM.exception.LeaveException;

public class Main {
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for Admin..");
		System.out.println("Enter 2 for Employee..");
		
		
		int user = sc.nextInt();
		
		
		
		
		switch(user) {
		     case 1:
		    	 System.out.println("Welcome to Human resourse management system..");
		    	 System.out.println("Login first...");
		    	 
		    	
		 		 System.out.println("Enter email :");
		 		 String e = sc.next();
		 		
		 		 System.out.println("Enter password :");
		 		 String p = sc.next();
		 		 
		 		 AdminDao ad = new AdminDaoImpl();
		 		
		 		 try {
		 			AdminDTO admin = ad.AdminLogin(e, p);
		 			
		 			
		 			 if(admin!=null) {
			 			 System.out.println("successfull login..");
			 			 System.out.println("ID is : "+admin.getAdminId());
			 			 System.out.println("Name is : "+admin.getAname());
			 			 System.out.println("Email is : "+admin.getEmail());
			 			 System.out.println("Mobile no. is : "+admin.getPhone());
			 			 System.out.println("Password is : "+admin.getPassword());
			 			 
			 			 System.out.println();
			 			 System.out.println();
			 			 System.out.println("enter your choice..");
			 			 
			 			 System.out.println("Enter 1 (Employee) related work :");
			 			 System.out.println("Enter 2 (Department) related work :");
			 			 System.out.println("Enter 3 (Leave) related work :");
			 			 System.out.println("Enter 4 if u want to EXIT..");
			 			 
			 			 
			 			 
				    	 
			 		 }
		 		 } catch (AdminException e1) {
		 			
	
		 			System.out.println("error :"+e1.getMessage());
		 			break;
		 		 }
		 		 
		 		
		 		 int choice = sc.nextInt();
		    	 
		    	 
		    	 switch(choice) {
		    	      case 1:
		    	    	   System.out.println("WELCOME TO EMPLOYEE SECTION :");
		    	    	   System.out.println("Enter 1 to Register New Employee :");
		    	    	   System.out.println("Enter 2 to EXIT.. :");
		    	    	   
		    	    	   int empchoice = sc.nextInt();
		    	    	   
		    	    	   switch(empchoice) {
		    	    	         case 1:
		    	    	        	
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
		    	    	     		
		    	    	     		System.out.println("Enter 1 to Exit..");
		    	    	     		System.out.println("Enter 2 to continue");
		    	    	     		
		    	    	     		break;
		    	    	     		
		    	    	        	
		    	    	         case 2:
		    	    	        	 System.out.println("thankyou for visiting....");
		    	    	        	 break;
		    	    	        	 
		    	    	        	 
		    	    	        	 
		    	    	         default :
		    	    	        	 System.out.println("not a valid choice :");
		    	    		   
		    	    	   
		    	    	   }
		    	    	  
		    	    	  
		    	    	  
		    	    	  
		    	      case 2:
		    	    	  System.out.println("WELCOME TO DEPARTMENT SECTION ..");
		    	    	  System.out.println("Enter 1 to add new Department :");
			 			  System.out.println("Enter 2 to View Department :");
			 			  System.out.println("Enter 3 to Update Departments :");
			 			  System.out.println("Enter 4 to Transfer to other Department :");
			 			  System.out.println("Enter 5 to EXIT.. :");
			 			  
			 			  
			 			  int depchoice = sc.nextInt();
			 			  
			 			  switch(depchoice) {
			 			  
			 			       case 1:
			 			    	    System.out.println("TO ADD DEPARTMENT PROVIDE THE REQUIRED FEILDS :");
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
				 			 		
				 			 		
				 			 		
				 			 		DepartmentDao addep = new DepartmentDaoImpl();
				 			 		
				 			 		String msg = addep.AddNewDepartments(dep);
				 			 		System.out.println(msg);
			 			    	    break;
			 			    	    
			 			    	    
			 			    	    
			 			       case 2:
			 			    	   
			 			    	    System.out.println("TO VIEW DEPARTMENT PROVIDE THE REQUIRED FEILDS :"); 
			 			    	    DepartmentDao addept = new DepartmentDaoImpl();
				 			 		try {
				 			 			
				 			 			List<DepartmentDTO> deps = addept.showDepartments();
				 			 			System.out.println(deps);
				 			 			
				 			 			
				 			 			
				 			 		} catch (DepartmentException ex) {
				 			 			ex.printStackTrace();
				 			 		
				 			 		}
			 			    	    break;
			 			    	    
			 			    	    
			 			       case 3:
			 			    	   
			 			    	    System.out.println("TO UPDATE DEPARTMENT PROVIDE THE REQUIRED FEILDS :");
			 			    	    System.out.println("Enter your update preference :");
			 			    	    System.out.println("Enter 1 to update Department_Name :");
			 			    	    System.out.println("Enter 2 to update Department_Description :");
			 			    	    System.out.println("Enter 3 to update both Department_Name-with-Depatment_Description :");
			 			    	
			 			    	    int updchoice = sc.nextInt();
			 			    	    
			 			    	    switch(updchoice) {
			 			    	    
			 			    	         case 1:
			 			    	        	System.out.println("Enter DepartmentID :");
				 			    	   		int id = sc.nextInt();
				 			    	   		
				 			    	   		
				 			    	   		System.out.println("Enter new_name :");
				 			    	   		String name = sc.next();
				 			    	   		
				 			    	   		
				 			    	   		DepartmentDao depup = new DepartmentDaoImpl();
				 			    	   		try {
				 			    	   			String res = depup.UpdateDepartmentNameById(id, name);
				 			    	   			
				 			    	   			System.out.println(res);
				 			    	   			
				 			    	   			
				 			    	   		} catch (DepartmentException ex) {
				 			    	   			
				 			    	   			ex.printStackTrace();
				 			    	   		}
				 			    	   		
			 			    	        	break;
			 			    	        	
			 			    	         case 2:
			 			    	        	System.out.println("Enter DepartmentID :");
				 			    	   		int did = sc.nextInt();
				 			    	   		
				 			    	   		
				 			    	   		System.out.println("Enter new_description :");
				 			    	   		String descr = sc.next();
				 			    	   		
				 			    	   		
				 			    	   		DepartmentDao updep = new DepartmentDaoImpl();
				 			    	   		try {
				 			    	   			String res = updep.UpdateDepartmentDescriptionById(did, descr);
				 			    	   			
				 			    	   			System.out.println(res);
				 			    	   			
				 			    	   			
				 			    	   		} catch (DepartmentException exce) {
				 			    	   			
				 			    	   			exce.printStackTrace();
				 			    	   		}
			 			    	        	
				 			    	   		break;
				 			    	   		
			 			    	         case 3:
			 			    	        	 
			 			    	        	System.out.println("Enter new_name :");
				 			    	   		String n = sc.next();
				 			    	   		
				 			    	   		System.out.println("Enter new_description :");
				 			    	   		String d = sc.next();
				 			    	   		
				 			    	   		System.out.println("Enter DepartmentID :");
				 			    	   		int depids = sc.nextInt();
				 			    	   		
				 			    	   		
				 			    	   		DepartmentDao depart = new DepartmentDaoImpl();
				 			    	   		try {
				 			    	   			String res = depart.UpdateDepartmentNameAndDepDescriptionByName(n, d, depids);
				 			    	   			
				 			    	   			System.out.println(res);
				 			    	   			
				 			    	   			
				 			    	   		} catch (DepartmentException excep) {
				 			    	   			
				 			    	   			excep.printStackTrace();
				 			    	   		}
			 			    	        	 
			 			    	            break;
			 			    	        	
			 			    	            
			 			    	         default :
			 			    	            System.out.println("wrong choice try again..");
			 			    	            break;
			 			    	    	
			 			    	    }
			 			    	   
			 			    	    
			 			       case 4:
			 			    	    System.out.println("TO TRANSFER EMPLOYEE TO DIFFERENT DEPARTMENT PROVIDE THE REQUIRED FEILDS :");
			 			    	    System.out.println("Enter employeeID..");
				 			  	    int id = sc.nextInt();
				 			  	    
				 			  	    System.out.println("Enter new_department_name");
				 			  	    String dname = sc.next();
				 			  	    
				 			  	    DepartmentDao de = new DepartmentDaoImpl();
				 			  	    
				 			  	    try {
				 			  			String msge = de.TransferToDepartment(dname, id);
				 			  			System.out.println(msge);
				 			  		} catch (DepartmentException en) {
				 			  			
				 			  			en.printStackTrace();
				 			  		}
				 			    	    
			 			    	   
		 			    	        break;
		 			    	        
			 			      case 5:
		    	    	           System.out.println("thankyou for visiting....");
		    	    	           break;
			 			   
		 			    	   default :
		 			    		   System.out.println("Invalid choice...");
		 			    		   break;
		 			    	        	
			 			  }
    	    	          break;
		    	    	  
		    	    	  
		    	      case 3:
		    	    	  System.out.println("WELCOME TO LEAVE SECTION ..");
		    	    	  LeaveDao leav = new LeaveDaoImpl();
		    	    	  int x = leav.LeaveRequest();
		    	    	  
		    	    	  if(x>0) {
		    	    		  System.out.println("You have leave request : "+x);
		    	    	  }
		    	    	  
		    	    	  System.out.println("Enter Reject/Accept ..");
			    	      String lest = sc.next();
			    	  		
			    	  		
			    	  	  LeaveDao l = new LeaveDaoImpl();
			    	  	  try {
			    	  		  String lup = l.UpdateLeaveRequest(lest);
			    	  			
			    	  		  System.out.println(lup);
			    	  	  } catch (LeaveException ec) {
			    	  			
			    	  		  ec.printStackTrace();
			    	  	  }
		    	    	  
		    	    	  
		    	    	  break;
		    	    	  
		    	    	  
		    	      case 4:
		    	    	  System.out.println("thankyou for visiting..");
		    	    	  break;
		    	    	  
		    	    	  
		    	    	  
		    	      default :
		    	    	  System.out.println("Please Enter Correct choice..");
		    	    	  break;
		    	 }
		    	 
		    	 break;
		    	 
		    	
		     case 2:
		    	 System.out.println("Welcome to Human resourse management system..");
		    	 System.out.println("Login first...");
		    	 
		    	 System.out.println("Enter email :");
		 		 String emp = sc.next();
		 		
		 		 System.out.println("Enter password :");
		 		 String pass = sc.next();
		 		
		 		
		 		 EmployeeDao employee = new EmployeeDaoImpl();
		 		 try {
		 			EmployeeDTO empl = employee.EmployeeLogin(emp, pass);
		 			
		 			if(empl!=null) {
			 			 System.out.println("successfull login..");
			 			 System.out.println(empl);
			 			 
			 			 System.out.println("enter your choice..");
			 			 System.out.println("Enter 1 to view profile..");
			 			 System.out.println("Enter 2 to Update profile..");
			 			 System.out.println("Enter 3 to Update password..");
			 			 System.out.println("Enter 4 to Request for leave..");
			 			 System.out.println("Enter 5 to Check leaveStatus..");
			 			
			 			 
			 		 }else {
			 			 System.out.println("Login fail..");
			 			 break;
			 		 }
		 			
		 			
		 		 } catch (EmployeeException e1) {
		 			
		 			e1.printStackTrace();
		 			break;
		 		 }
		    	 
		    	 
		 		int empchoice = sc.nextInt();
		 		
		 		switch(empchoice) {
		 	         case 1:
		 		    	System.out.println("Enter employee_id..");
		 				int id = sc.nextInt();
		 				
		 				
		 				EmployeeDao empprofile = new EmployeeDaoImpl();
		 				try {
		 					EmployeeDTO ep = empprofile.ViewProfile(id);
		 					System.out.println(ep);
		 					
		 					System.out.println(ep);
		 				} catch (EmployeeException excep) {
		 					
		 					excep.printStackTrace();
		 				}
		 		    	break;
		 		    	
		 	         case 2:
		 	        	 
		 	        	 System.out.println("TO UPDATE PROFILE ENTER YOUR PREFERENCES..");
		 	        	 System.out.println("Enter 1 to update Name..:");
		 	        	 System.out.println("Enter 2 to update Email..:");
		 	        	 System.out.println("Enter 3 to update Mobile_No...:");
		 	        	 
		 	        	 int upchoice = sc.nextInt();
		 	        	 
		 	        	 switch(upchoice) {
		 	        	      case 1:
		 	        	    	  
		 	        	    	    System.out.println("Enter employeeID. :");
			 	        			int ids = sc.nextInt();
			 	        			
			 	        			System.out.println("Enter new_Name. :");
			 	        			String name = sc.next();
			 	        			
			 	        			EmployeeDao em = new EmployeeDaoImpl();
			 	        			try {
			 	        				String newpass = em.UpdateByName(ids, name);
			 	        				
			 	        				System.out.println(newpass);
			 	        			} catch (EmployeeException et) {
			 	        				
			 	        				et.printStackTrace();
			 	        			}
			 	        			
		 	        	    	  break;
		 	        	    	  
		 	        	    	  
		 	        	      case 2:
		 	        	    	  
		 	        	    	    System.out.println("Enter employeeID. :");
			 	        			int ide = sc.nextInt();
			 	        			
			 	        			System.out.println("Enter new_Email. :");
			 	        			String email = sc.next();
			 	        			
			 	        			EmployeeDao eml = new EmployeeDaoImpl();
			 	        			try {
			 	        				String newpass = eml.UpdateByEmail(ide, email);
			 	        				
			 	        				System.out.println(newpass);
			 	        			} catch (EmployeeException ep) {
			 	        				
			 	        				ep.printStackTrace();
			 	        			}
			 	        			
		 	        	    	  break;
		 	        	    	  
		 	        	      case 3:
		 	        	    	  
		 	        	    	    System.out.println("Enter employeeID. :");
			 	        			int idd = sc.nextInt();
			 	        			
			 	        			System.out.println("Enter new_mobile no. :");
			 	        			String phone = sc.next();
			 	        			
			 	        			EmployeeDao emt = new EmployeeDaoImpl();
			 	        			try {
			 	        				String newpass = emt.UpdateByMobile(idd, phone);
			 	        				
			 	        				System.out.println(newpass);
			 	        			} catch (EmployeeException es) {
			 	        				
			 	        				es.printStackTrace();
			 	        			}
		 	        	    	  break;
		 	        	    	  
		 	        	      default :
		 	        	    	  System.out.println("Invalid number..");
		 	        	    	  break;
		 	        	    	  
		 	        	 
		 	        	 
		 	        	 }
		 	        	 
		 	        	 
		 	        	 
		 	        	 break;
		 	         case 3:
		 	        	 
		 	        	System.out.println("Enter employeeID. :");
			 	   		int ide = sc.nextInt();
			 	   		
			 	   		System.out.println("Enter new_password. :");
			 	   		String passw = sc.next();
			 	   		
			 	   		EmployeeDao em = new EmployeeDaoImpl();
			 	   		try {
			 	   			String newpass = em.UpdateByPassword(ide, passw);
			 	   			
			 	   			System.out.println(newpass);
			 	   		} catch (EmployeeException exception) {
			 	   			
			 	   			exception.printStackTrace();
			 	   		}
			 	   		
		 	        	break;
		 	         case 4:
		 	        	 
		 	        	System.out.println("Enter employee_id :");
			 	   		int ids = sc.nextInt();
			 	   		
			 	   		System.out.println("Enter date leave from.. :");
			 	   	    String d = sc.next();
			 	   		
			 	   		System.out.println("Enter total_day of leave :");
			 	   		int l = sc.nextInt();
			 	   		
			 	   		LeaveDTO le = new LeaveDTO();
			 	   		le.setEmpid(ids);
			 	   		le.setFrom(d);
			 	   		le.setTotalday(l);
			 	   		
			 	   		
			 	   		LeaveDao leave = new LeaveDaoImpl();
			 	   		String msg = leave.ApplyLeave(le);
			 	   		
			 	   		System.out.println(msg);
			 	   		
		 	        	break;
		 	        	
		 	        	
		 	         case 5:
		 	        	 
		 	        	System.out.println("Enter employeeID :");
			 	   		int idst = sc.nextInt();
			 	   		
			 	   		
			 	   		LeaveDao ls = new LeaveDaoImpl();
			 	   		try {
			 	   			String st = ls.CheckLeaveStatus(idst);
			 	   			System.out.println(st);
			 	   			
			 	   		} catch (DepartmentException | EmployeeException | LeaveException ex) {
			 	   			
			 	   			ex.printStackTrace();
			 	   		}
			 	   		
		 	        	break;
		 			
		 		}
		    	 
		    	 
		     default:
		    	 System.out.println("not a valid number..");
		    	 break;
		}
		
	}

}
