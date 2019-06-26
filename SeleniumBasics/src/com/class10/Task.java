package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		String linkText = "Sortable Data Tables";
		driver.findElement(By.linkText(linkText)).click();;
		List <WebElement> tableOneRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("TABLE 1 Number of rows = "+tableOneRows.size());
		List <WebElement> tableOneCols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println("TABLE 1 Number of colums = "+tableOneCols.size());
		List <WebElement> tableTwoRows=driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));
		System.out.println("TABLE 2 Number of rows = "+tableOneRows.size());
		List <WebElement> tableTwoCols=driver.findElements(By.xpath("//table[@id='table2']/thead/tr/th"));
		System.out.println("TABLE 2 Number of colums = "+tableOneCols.size());
	}

}
//TC 1: Table headers and rows verification
//
//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Sortable Data Tables” link
//Verify tables consist of 4 rows and 6 columns
//Print name of all column headers
//Print data of all rows