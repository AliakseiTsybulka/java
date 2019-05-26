package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class dragAndDropTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CommonMethods.setUpDriver("chrome", "http://jqueryui.com/droppable");
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		
		WebElement target = driver.findElement(By.cssSelector("div#draggable"));
		WebElement source = driver.findElement(By.cssSelector("div#droppable"));
		
		//action.clickAndHold(target).moveToElement(source).release().build().perform();
		Thread.sleep(2000);
		action.dragAndDrop(target, source).build().perform();
	}
}
/*
task
Ahead to https://jqueryui.com/droppable/
handle the frame
drag and drop
close browser
*/