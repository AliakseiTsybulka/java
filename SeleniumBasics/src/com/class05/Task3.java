package com.class05;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int clickableRB = 0;
		int clickableCB = 0;
		String expectedCB = "Selenium WebDriver";
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> years = driver.findElements(By.xpath("//input[@name = 'exp']"));
		for (WebElement year : years) {
			if (year.isEnabled())
				year.click();
			clickableRB++;
		}
		if (years.size() == clickableRB) {
			System.out.println("All radio buttons are clickable");
		}
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type= 'checkbox']"));	
		for (WebElement checkBox : checkBoxes) {
			String value = checkBox.getAttribute("value");
			if (checkBox.isEnabled()) {
				clickableCB++;
			}if (!value.equalsIgnoreCase(expectedCB)) {
				checkBox.click();
				Thread.sleep(2000);
				checkBox.click();
			}if (value.equalsIgnoreCase(expectedCB)) {
				checkBox.click();
			}if (checkBoxes.size() == clickableCB) {
				System.out.println("All check boxes are clickable");
			}	
		}	
	}
}
/*
 * Check all Years of Experience radio buttons are clickable
 * ----------------------------------------------- Check all Automation Tools
 * checkboxes are clickable and keep “Selenium WebDriver” option as selected
 */