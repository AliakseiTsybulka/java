package com.class28;

public class TestWebDriver {
	public static void main(String[] args) {
		WebDriver browser;
		browser = new ChromeDriver();
		browser.openBrowser();
		browser.closeBrowser();
		browser.maximizeWindow();
		browser.findElement();
		browser = new FirefoxDriver();
		browser.openBrowser();
		browser.closeBrowser();
		browser.maximizeWindow();
		browser.findElement();
	}

}
