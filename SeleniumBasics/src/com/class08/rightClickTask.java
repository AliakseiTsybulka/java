package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;
public class rightClickTask extends CommonMethods {
static String url = "https://www.saucedemo.com";
	
		public static void main(String[] args) throws InterruptedException {
			setUpDriver("chrome",url );
			Thread.sleep(4000);
			WebElement rightClick= driver.findElement(By.cssSelector("input#password"));
			Actions action = new Actions(driver);
			action.contextClick(rightClick).perform();
			Thread.sleep(6000);
			driver.close();
	}

}
