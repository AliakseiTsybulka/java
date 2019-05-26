package com.class29;

public class Test {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.closeBrowser();
		driver.execute();
		driver.findElement();
		driver.m2();
		driver.maximizeWindow();
		driver.openBrowser();
		driver.takesScreenShot();
		TakesShreenshot.m1();//access static method in static way by using class name/interface where method is defined
		System.out.println(TakesShreenshot.fileExtension);
	}
}