package com.class06;
import java.util.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.Promise;
public class TC1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\User\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		String expectedMessage = "I am an alert box!";
		driver.findElement(By.cssSelector("button[onclick*='Alert']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String message = alert.getText();
		if (expectedMessage.equalsIgnoreCase(message)) {
			System.out.println(expectedMessage+" is presented on this alert");
		alert.accept();
		}else {
			System.out.println("You'll better provide valid message");
		}
		Thread.sleep(2000);
		String expectedConfirm = "Press a button!";
		driver.findElement(By.cssSelector("button[onclick*='Confirm']")).click();
		Thread.sleep(2000);
		Alert alertConfirm = driver.switchTo().alert();
		Thread.sleep(2000);
		String confirmMessage = alertConfirm.getText();
		if (confirmMessage.equalsIgnoreCase(expectedConfirm)) {
			System.out.println(expectedConfirm+" is presented on this confirm alert");
		}else {
			System.out.println("Where is valid confirm alert?");
		}
		alertConfirm.dismiss();
		Thread.sleep(2000);
		String expectedPromt = "Please enter your name";
		driver.findElement(By.cssSelector("button[onclick*='Prompt']")).click();
		Thread.sleep(2000);
		Alert alertPromt = driver.switchTo().alert();
		Thread.sleep(2000);
		String promtMessage = alertPromt.getText();
		if (expectedPromt.equalsIgnoreCase(promtMessage)) {
		System.out.println(expectedPromt+" is presented on this promt alert");
		alertPromt.sendKeys("Tester Testerovich Testerski");
		Thread.sleep(2000);
		alertPromt.accept();
		}else {
			System.out.println("No such an alert");
		}
		Thread.sleep(12000);
		driver.quit();
	}
}
/*
TC 1: JavaScript alert text verification
Open chrome browser
Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
Verify
alert box with text “I am an alert box!” is present
confirm box with text “Press a button!” is present
prompt box with text “Please enter your name” is present
Quit browser
*/