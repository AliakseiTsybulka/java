package com.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class task extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("Chrome","https://the-internet.herokuapp.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement hello = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String expectedText = "Hello World!";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		if (hello.isDisplayed() && hello.getText().equalsIgnoreCase(expectedText)) {
			System.out.println("The element is present on this page");
		} else {
			System.out.println("Write a new code please!");
		}
		driver.quit();
	}

}
//TC 1: Verify element is present
//Open chrome browser
//Go to �https://the-internet.herokuapp.com/�
//Click on �Click on the �Dynamic Loading� link
//Click on �Example 1...� and click on �Start�
//Verify element with text �Hello World!� is displayed
//Close the browser