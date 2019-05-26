package com.class05;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement monthDD = driver.findElement(By.id("month"));
		Select month = new Select(monthDD);
		List<WebElement> allOptions = month.getOptions();
		if (allOptions.size() == 13) {
			System.out.println("12 month options in FB");
		}
		WebElement daysDD = driver.findElement(By.id("day"));
		Select day = new Select(daysDD);
		List<WebElement> daysOptions = day.getOptions();
		if (daysOptions.size() == 32) {
			System.out.println("31 days options in FB");
		}
		WebElement yearDD = driver.findElement(By.id("year"));
		Select year = new Select(yearDD);
		List<WebElement> yearOptions = year.getOptions();
		if (yearOptions.size() == 116) {
			System.out.println("115 year options in FB");
		}
		month.selectByIndex(7);
		day.selectByIndex(5);
		year.selectByVisibleText("1989");
		
		Thread.sleep(4000);
		driver.quit();
	}
}
/*
 * TC 1: Facebook dropdown verification Open chrome browser Go to
 * “https://www.facebook.com” Verify: month dd has 12 month options day dd has
 * 31 day options year dd has 115 year options Select your date of birth Quit
 * browser
 */