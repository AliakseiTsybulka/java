package com.class29;

public interface WebDriver extends TakesShreenshot, Executes{

	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}