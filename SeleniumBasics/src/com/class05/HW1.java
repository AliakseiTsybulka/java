package com.class05;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Testerovich");
		List<WebElement> sexRB = driver.findElements(By.xpath("//input[@name = 'sex']"));
		String expectedSRB = "Male";
		int clickableSRB = 0;
		for (WebElement SRB : sexRB) {
			if (SRB.isEnabled()) {
				clickableSRB++;
		}	else if (SRB.getAttribute("value")==expectedSRB) {
			SRB.click();
			}
		}
		int yearsRB = 0;
		List<WebElement> years = driver.findElements(By.xpath("//input[@name = 'exp']"));
		for (WebElement year : years) {
			if (year.isEnabled())
				year.click();
			yearsRB++;
		}
		if (years.size() == yearsRB) {
			System.out.println("All years of experience radio buttons are clickable");
		}
		driver.findElement(By.xpath("//input[@id= 'datepicker']")).sendKeys("05/18/2019");
		List<WebElement> professions = driver.findElements(By.xpath("//input[@name ='profession']"));
		for (WebElement prof : professions) {
			prof.click();
		}
		List<WebElement> tools = driver.findElements(By.xpath("//input[@name ='tool']"));
		int toolscount = 0;
		for (WebElement tool : tools) {
			if (tool.isEnabled()) {
				toolscount++;
				tool.click();
				tool.click();
			}
			if (tools.size() == toolscount) {
				System.out.println("All Automation Tools checkboxes are clickable");
			}
			driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		}
		driver.quit();
	}
}
/*
TC 1: Tools QA check all elements
Open chrome browser
Go to “https://www.toolsqa.com/automation-practice-form/”
Fill out:
First Name
Last Name
Check that sex radio buttons are enabled and select “Male”
Check all Years of Experience radio buttons are clickable
Date
Select both checkboxes for profession
Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
Quit browser
*/