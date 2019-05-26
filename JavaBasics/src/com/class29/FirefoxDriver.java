package com.class29;

public class FirefoxDriver extends Browser implements WebDriver, Report{

	@Override
	public void openBrowser() {
		System.out.println("Opening firefox browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing firefox browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing firefox browser");
	}

	@Override
	public void findElement() {
		System.out.println("Find element in firefox browser");
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh firefox browser");
	}

	@Override
	public void getReport() {
		System.out.println("Report from firefox browser");
	}

	@Override
	public void takesScreenShot() {
		System.out.println("Takin schreenshot in firefox browser");
	}

	@Override
	public void execute() {
		System.out.println("executing code in firefox browser");
	}
}