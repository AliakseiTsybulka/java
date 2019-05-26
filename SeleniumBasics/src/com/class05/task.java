package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[1]"));
        boolean check = logo.isDisplayed();
        if (check) {
        	System.out.println("Page contains robot logo");
        } else {
        	System.out.println("Page doesn't contains robot logo");
        }
        WebElement products = driver.findElement(By.cssSelector("div.product_label"));
        String result = products.getText();
        if (result.equalsIgnoreCase("products")) {
        	System.out.println("Text PRODUCTS is availible on this page");
        } else {
        	System.out.println("Text PRODUCTS is NOT availible on this page");
        }
        
        	
	}

}
