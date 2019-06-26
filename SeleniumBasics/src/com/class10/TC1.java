package com.class10;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import utils.CommonMethods;

public class TC1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
		setUpDriver("chrome", url);
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		
		String expectedValue = "Susan McLaren";
		String updatedValue = "Susan McLarenovich";
		
		for (int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
		
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]/td[13]")).findElement(By.cssSelector("input[onclick*='editOrder$4']")).click();;
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.findElement(By.cssSelector("input[value='"+expectedValue+"']")).clear();
				driver.findElement(By.cssSelector("input[id*='Name']")).sendKeys("Susan McLarenovich");
				driver.findElement(By.cssSelector("a[id*='Update']")).click();
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
				}
		}
			for (int j=1; j<=rows.size(); j++) {
				String rowTextAgain=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+j+"]")).getText();
			
				if(rowTextAgain.contains(updatedValue)) {
					System.out.println("Updated last name of the customer is displayed");
		}
	}
}
}

//TC 1: Table headers and rows verification
//
//Open chrome browser
//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//Login to the application
//Verify customer “Susan McLaren” is present in the table
//Click on customer details
//Update customers last name
//Verify updated customers name is displayed in table
//Close browser