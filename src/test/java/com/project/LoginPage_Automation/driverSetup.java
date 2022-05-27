package com.project.LoginPage_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverSetup {
	
public static WebDriver driver;
	
	@BeforeSuite
	public static void setBrowserEnv() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("setBrowserEnv() method executed");
	}
	
	@AfterSuite
	public static void browserClose() throws InterruptedException{
		driver.close();
		driver.quit();
		
		System.out.println("browserClose() method executed");
	}

}
