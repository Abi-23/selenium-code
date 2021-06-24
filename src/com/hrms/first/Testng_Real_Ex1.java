package com.hrms.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_Real_Ex1 {
	
	@Test
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Interview Preparation\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}

}
