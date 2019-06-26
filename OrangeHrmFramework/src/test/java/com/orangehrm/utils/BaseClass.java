package com.orangehrm.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void setUp() {
		ConfigReader.readProperty(Constants.CREDENTIALS_FILEPATH);
		String browser = ConfigReader.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constants.WEBDRIVER_CHROME_PATH);
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.WEBDRIVER_FIREFOX_PATH);
			driver = new FirefoxDriver();
		} else {
			System.err.println("WebDriver is not found");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ConfigReader.getProperty("url"));
	}
	public static void tearDown() {
		driver.quit();
	}
}
