package com.class01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class task extends CommonMethods {

	@BeforeMethod
	public void setUP(){
		setUpDriver("chrome", "https://www.saucedemo.com/");
		System.out.println("Title is: "+driver.getTitle());
	}
	
	@Test
	public void login()  {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "standard_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String expectedWord = "Products";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[text()='Products']"), "Products"));
		WebElement word = driver.findElement(By.xpath("//div[text()='Products']"));
		if (word.getText().equalsIgnoreCase(expectedWord)) {
			System.out.println(expectedWord+" is present on this web page");
		}
	}

		@AfterMethod
		public void logout() {
			String button = "//button[text()='Open Menu']";
			driver.findElement(By.xpath(button)).click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));
			driver.findElement(By.linkText("Logout")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.bot_column")));
			driver.close();
		}
	
}
//TC 1: Swag Lab Title and Login Verification
//
//@BeforeMethod should contain navigation to the URL and title verification
//
//@Test should contain steps to login and “Product” word verification
//
//@AfterMethod should logOut from the application and close the browser