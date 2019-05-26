package com.class06;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement options = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select department = new Select(options);
		List <WebElement> departments = department.getOptions();
		System.out.println("There is "+departments.size()+" departments availible.");
		for (WebElement print : departments) {
			System.out.println(print.getText());
		}
		department.selectByVisibleText("Computers");
		Thread.sleep(4000);
	}
}
/*
TC 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department
Select Computers
Quit browser
*/