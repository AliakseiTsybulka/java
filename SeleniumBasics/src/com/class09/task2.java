package com.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class task2 extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("Chrome","https://the-internet.herokuapp.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));
		WebElement back = driver.findElement(By.cssSelector("p#message"));
		String expectedText = "It's back!";	
		if (back.getText().equalsIgnoreCase(expectedText)) {
			System.out.println("Expected message is displayed on this page");
		} else {
			System.out.println("Write a new code please!");
		}
		driver.quit();
	}

}
//TC 2: Verify element is clickable1.Open chrome browser
//	2.Go to “https://the-internet.herokuapp.com/”
//	3.Click on “Click on the “Dynamic Controls” link
//	4.Select checkbox and click Remove
//	5.Click on Add button and verify “It's back!” text is displayed6.
//	Close the browser
