package com.hrms.first;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex2_Testng {
	
	@BeforeMethod
	public void login() {
		System.out.println("login completed");
	}

	@Test
	public void addEmp() {
		System.out.println("Employee Added");
	}
	
	@Test
	public void delEmp() {
		System.out.println("Employee Deleted");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout Completed");
	}
}
