package com.HRM.utility;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("dbdetails.properties");
		
		p.setProperty("url", "jdbc:mysql://localhost:3306/human_resource_management_system");
		p.setProperty("username", "root");
		p.setProperty("password", "Shreeram@7");
		p.setProperty("drivername", "com.mysql.cj.jdbc.Driver");
		
		
		p.store(os, null);
		
	}

}
