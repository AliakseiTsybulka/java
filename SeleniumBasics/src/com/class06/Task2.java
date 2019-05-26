package com.class06;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select")).click();
		Thread.sleep(2000);
		WebElement options = driver.findElement(By.cssSelector("select#countriesSingle"));
		Select country = new Select(options);
		List <WebElement> countryList = country.getOptions();
		System.out.println(countryList.size()+" countries options availible.");
		country.selectByVisibleText("United states of America");
		Thread.sleep(2000);
		WebElement multiOptions = driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select selectMulti = new Select(multiOptions);
		List <WebElement> countries = selectMulti.getOptions();
		System.out.println(countries.size()+" countries options availible for multi choise.");
		selectMulti.selectByIndex(0);
		Thread.sleep(1000);
		selectMulti.selectByIndex(1);
		Thread.sleep(1000);
		selectMulti.selectByIndex(2);
		Thread.sleep(1000);
		selectMulti.selectByIndex(3);
		Thread.sleep(2000);
		selectMulti.deselectByVisibleText("China");
		Thread.sleep(4000);
		driver.quit();
	}
}
/*
TC 2: Select and Deselect values
Open chrome browser
Go to “http://uitestpractice.com/”
Click on “Select” tab
Verify how many options available in the first drop down and then select “United states of America”
Verify how many options available in the second drop down and then select all.
Deselect China from the second drop down
Quit browser (edited) 
*/