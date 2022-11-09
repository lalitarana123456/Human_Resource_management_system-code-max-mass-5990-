package com.HRM.utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	
	public static Connection ProvideConnection() {
		Connection conn = null;
		
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	    
	   
		String url = "jdbc:mysql://localhost:3306/human_resource_management_system";
		
		try{
			conn = DriverManager.getConnection(url, "root", "Shreeram@7");
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		
		
		
		return conn;
		
	}

}
