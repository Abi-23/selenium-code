package com.hrms.first;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Testng {
	
	@BeforeClass
	public void login() {
		System.out.println("Login Completed");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("Logout Completed");
	}
	
	@Test(priority=2)
	public void checkin() {
		System.out.println("Employee Checked-in");
	}
	
	@Test(priority=3)
	public void checkout() {
		System.out.println("Employee Checked-out");
	}
	
	@Test(priority=1)
	public void addEmployee() {
		System.out.println("Employee Added");
	}
	
	@Test(priority=4)
	public void deleteEmployee() {
		System.out.println("Employee Deleted");
	}

}
