package com.class28;

/*Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
 * Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
class ChromeDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Chrome browser opens");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Chrome browser closes");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Chrome browser makes fullscreen window");
	}
	@Override
	public void findElement() {
		System.out.println("Use Ctrl+F to search for an element");
	}
}
class FirefoxDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Firefox browser opens");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Firefox browser closes");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Firefox browser makes fullscreen window");
	}
	@Override
	public void findElement() {
		System.out.println("Use Ctrl+F to search for an element");
	}
}