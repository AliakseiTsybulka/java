package com.class12;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;


public class FlightSearch extends CommonMethods {

		@BeforeMethod
		public void setUP(){
			setUpDriver("chrome", "https://aa.com/");	
		}
		@Test
		public void searchFlight() throws InterruptedException {
			sendText(findByCSS("input[name='originAirport']"), "BOS");
			Thread.sleep(1000);
			sendText(findByCSS("input[name='destinationAirport']"), "DEN");
			Thread.sleep(1000);
			clickOnElement(findByXpath("//input[@id='aa-leavingOn']/following-sibling::button"));
			Thread.sleep(1000);
			WebElement depMonth = findByXpath("//div[contains(@class, 'first')]");
			while(!depMonth.getText().contains("October")) {
				clickOnElement(findByXpath("//a[@title='Next']"));
				depMonth = findByXpath("//div[contains(@class, 'first')]");
			}
			List <WebElement> depCells=driver.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
			for(WebElement cell: depCells) {
				if(cell.getText().equals("18")) {
					cell.click();
					break;
				}
			}
			Thread.sleep(1000);
			clickOnElement(findByXpath("//input[@id='aa-returningFrom']/following-sibling::button"));
			WebElement retMonth = findByXpath("//div[contains(@class, 'ui-corner-left')]/div");
			while(!retMonth.getText().contains("December")) {
				clickOnElement(findByXpath("//a[@title='Next']"));
				retMonth = findByXpath("//div[contains(@class, 'first')]");
			}
			List <WebElement> retCells=driver.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
			for(WebElement cell: retCells) {
				if(cell.getText().equals("24")) {
					cell.click();
					break;
				}
			}
			Thread.sleep(3000);
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}