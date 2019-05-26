package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

		public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub
	        System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.navigate().to("https://www.saucedemo.com");
	      driver.findElement(By.id("user-name")).sendKeys("standard_user");
	      Thread.sleep(2000);
	      driver.findElement(By.id("password")).sendKeys("secret_sauce");
	      Thread.sleep(2000);
	      driver.findElement(By.className("btn_action")).click();
	      driver.close();
	 
	    }
}
