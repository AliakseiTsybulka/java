package com.class02;
	import org.openqa.selenium.By;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import utils.CommonMethods;

	 public class task extends CommonMethods {
		 
		@BeforeMethod
		public void setUP(){
			setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");	
		}
		@Test()
		public void login() throws InterruptedException {
			sendText(driver.findElement(By.cssSelector("input#txtUsername")), "Admin");
			Thread.sleep(2000);
			sendText(driver.findElement(By.cssSelector("input#txtPassword")), "admin123");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#btnLogin")).click();
		}
		@Test(priority=1)
		public void titleValidation() {
			System.out.println(driver.getTitle()+" is a title");
		}
		
		@Test(enabled = false)
			public void refresh() {
			driver.navigate().refresh();
		}
		
		@AfterMethod
		public void close() {
			driver.close();
		}
	}
/*
TC 1: OrangeHRM Title Validation

TC 2: OrangeHRM Successful Login 
https://opensource-demo.orangehrmlive.com/
Please make sure to use the following:
 annotations:
	@BeforeMethod
	@AfterMethod
	@Test

What would you do if you do not want to execute any specific test case?
SEE DISABLED TEST
What would you do if you want to execute any specific test case first?
I WILL SET THE PRIORITY
*/