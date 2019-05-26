package com.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class task3 extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("Chrome","https://the-internet.herokuapp.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']")));
		WebElement message = driver.findElement(By.cssSelector("p#message"));
		if (message.isDisplayed()) {
			System.out.println(message.getText());
			System.out.println("Entered message is successfully displayed on this page");
		} else {
			System.out.println("Write a new code please!");
		}
		driver.quit();
	}
}
//1.Open chrome browser
//2.Go to “https://the-internet.herokuapp.com/”
//	3.Click on “Click on the “Dynamic Controls” link
//	4.Click on enable button
//	5.Enter “Hello” and verify text is entered successfully
//	6.Close the browser
