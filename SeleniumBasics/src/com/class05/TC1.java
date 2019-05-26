package com.class05;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int count = 0;
		Iterator <WebElement> linksIt = links.iterator();
		while (linksIt.hasNext()) {
			String linkText = linksIt.next().getText();
			if (!linkText.isEmpty()) {
				count++;
			}
			}
		System.out.println("Total links with text on this page is "+count);
	}

}
/*
Open chrome browser
Go to “https://www.amazon.com/”
Using Iterator get text of each link
Get number of links that has text
*/