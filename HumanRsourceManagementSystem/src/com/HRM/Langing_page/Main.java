package com.HRM.Langing_page;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 if u r admin..");
		System.out.println("Enter 2 if u r employee..");
		
		
		int user = sc.nextInt();
		
		
		
		
		switch(user) {
		     case 1:
		    	 System.out.println("hii i am admin..");
		    	 String day="sunday";
		    	 
		    	 switch(day) {
		    	      case "sunday":
		    	    	  System.out.println("hii i am employee..");
		    	      case "monday":
		    	    	  System.out.println("hii i am employee..");
		    	 }
		    	 
		    	
		     case 2:
		    	 System.out.println("hii i am employee..");
		    	 break;
		     case 3:
		    	 System.out.println("hii iam staff..");
		    	 break;
		     default:
		    	 System.out.println("not a valid number..");
		}
		
	}

}
