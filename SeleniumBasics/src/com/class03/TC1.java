package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("test.rasmi@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.name("pass")).sendKeys("Syntax123");
			driver.findElement(By.partialLinkText("Forgot")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			driver.findElement(By.name("pass")).sendKeys("Syntax123");
			Thread.sleep(1000);
			driver.findElement(By.id("u_0_2")).click();
			Thread.sleep(6000);
			driver.close();

}
}