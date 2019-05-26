package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@type,'email')]")).sendKeys("test.rasmi@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'passw')]")).sendKeys("Syntax123");
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[starts-with(@type,'passw')]")).sendKeys("Syntax123");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(6000);
		driver.close();

	}

}
