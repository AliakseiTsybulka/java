package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class hoverOver extends CommonMethods {
static String url = "https://www.toolsqa.com";
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome",url );
		Thread.sleep(4000);
		String parentId = driver.getWindowHandle();
		WebElement hoverOver = driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
		Thread.sleep(2000);
		Actions action= new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
/*
Hover over the Tutorial menu
//Click on Software Testing Tutorial
//Close the browser
*/