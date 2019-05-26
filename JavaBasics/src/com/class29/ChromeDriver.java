package com.class29;

public class ChromeDriver extends Browser implements WebDriver, Report{

	@Override
	public void openBrowser() {
		System.out.println("Opening chrome browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing chrome browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing chrome browser");
	}

	@Override
	public void findElement() {
		System.out.println("Find element in chrome browser");
	}

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh firefox browser");
	}

	@Override
	public void getReport() {
		System.out.println("Report from chrome browser");
	}

	@Override
	public void takesScreenShot() {
		System.out.println("Takin schreenshot in chrome browser");
	}

	@Override
	public void execute() {
		System.out.println("executing code in chrome browser");
	}
}