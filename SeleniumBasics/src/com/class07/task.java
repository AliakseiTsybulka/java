package com.class07;

import org.openqa.selenium.By;

public class task extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		Thread.sleep(2000);
		
		
	}

}
/*
TC 1: ToolsQA Frame verification
Open chrome browser
Go to “https://www.toolsqa.com/iframe-practice-page/”
Click on “Blogs” link inside first frame
Verify element “Interactions” is present in second frame
Navigate to Home Page
Quit browser
*/