package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("performance_glitch_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        driver.close();
	}

}
//enter the password with either contains or starts-with xpath