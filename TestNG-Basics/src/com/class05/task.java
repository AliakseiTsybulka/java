package com.class05;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class task extends CommonMethods {
	
	String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
	String expected = "Welcome, Tester! | Logout";
	
    @BeforeMethod(alwaysRun =true)
    public void setUP() {
        setUpDriver("chrome", url);
            sendText(findByCSS("input[id*='username']"), "Tester");
            sendText(findByCSS("input[id*='password']"), "test");
            findByCSS("input[id*='button']").click();
            WebDriverWait wait = new WebDriverWait(driver, 30);
        	wait.until(ExpectedConditions.elementToBeClickable(findByXpath("//a[text()='Logout']")));
            WebElement hello = findByCSS("div.login_info");
            Assert.assertEquals(hello.getText(), expected);
        } 
    
	@DataProvider(name ="setOfData")
	public Object [][] setUpData(){
		Object [][] data = new Object[2][11];
		
		data[0][0]="1";
		data[0][1]="100";
		data[0][2]="100";
		data[0][3]="Lara Croft";
		data[0][4]="666 Lenin St";
		data[0][5]="St. Petersburg";
		data[0][6]="FL";
		data[0][7]="12345";
		data[0][8]="Visa";
		data[0][9]="1234567890098765";
		data[0][10]="02/24";
		
		
		data[1][0]="2";
		data[1][1]="150";
		data[1][2]="300";
		data[1][3]="Zlatan Ibrahimovich";
		data[1][4]="Galaxy Stadium";
		data[1][5]="Los Angeles";
		data[1][6]="CA";
		data[1][7]="54321";
		data[1][8]="MasterCard";
		data[1][9]="9900112233221144";
		data[1][10]="09/21";
		return data;
	}
    
	@Test(dataProvider = "setOfData")
	public void  testUsers(String quantity, String price, String total, String customerName, String street, String city, String state, String zip, String card , String cardNr, String date) throws IOException {
	driver.findElement(By.xpath("//a[text()='Order']")).click();
	driver.findElement(By.xpath("//input[contains(@id,'Quantity')]")).sendKeys(quantity);
	driver.findElement(By.xpath("//input[contains(@id,'Price')]")).sendKeys(price);
	driver.findElement(By.xpath("//input[contains(@id,'Total')]")).sendKeys(total);
	driver.findElement(By.xpath("//input[contains(@id,'Name')]")).sendKeys(customerName);
	driver.findElement(By.xpath("//input[contains(@id,'TextBox2')]")).sendKeys(street);
	driver.findElement(By.xpath("//input[contains(@id,'TextBox3')]")).sendKeys(city);
	driver.findElement(By.xpath("//input[contains(@id,'TextBox4')]")).sendKeys(state);
	driver.findElement(By.xpath("//input[contains(@id,'TextBox5')]")).sendKeys(zip);
	driver.findElement(By.xpath("//input[contains(@value,'"+card+"')]")).click();
	driver.findElement(By.xpath("//input[contains(@id,'TextBox6')]")).sendKeys(cardNr);
	driver.findElement(By.xpath("//input[contains(@name,'TextBox1')]")).sendKeys(date);
	if(customerName.contains("Lara Croft")) {
	takeScreenshot("taskOne", "smartbearsoftwareUserOne");
	}
	else  {
		takeScreenshot("taskOne", "smartbearsoftwareUserTwo");
	}
	driver.findElement(By.xpath("//a[contains(@id,'InsertButton')]")).click();	
	}

	@AfterMethod 
	public void tearDown() {
	driver.close();

	}
}
/*
TC 1: Saucedemo Username1(Data Provider - Quantity:, Customer name:,Street: City:, State: ,Zip:,Card:,Card Nr:, Expire date )
Step 1: Open browser and navigate to smartbearsoftware
Step 2: Enter valid username, password and click login button
Step 3: Verify user successfully logged in
Step 4: Click on Order
Step 5: Make an order for two user,enter all the information for both users(Quantity:, Customer name:,Street: City:, State: ,Zip:,Card:,Card Nr:, Expire date)
Step 6: Take ScreenShot before submitting each user
*/