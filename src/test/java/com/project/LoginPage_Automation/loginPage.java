package com.project.LoginPage_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginPage extends driverSetup{
	
	public static String url = "https://redgrocer.com/";
	public static String email = "mh.hassann19@gmail.com";
	public static String pass = ";qwertyuio@$";
		
	
		@BeforeClass
		public static void openPage() throws InterruptedException{
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		@Test(priority=1)
		public static void login() throws InterruptedException{
			driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Use Email Instead']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			Thread.sleep(3000);
			System.out.println("Login() method executed successfully");
			
		}
		
		@AfterClass
		public static void Logout() throws InterruptedException{
			driver.findElement(By.xpath("//a[contains(@class,'text-reset d-inline-block opacity-60 py-2')][normalize-space()='Logout']")).click();
			Thread.sleep(3000);
			System.out.println("Logout() method executed successfully");
		}

}
