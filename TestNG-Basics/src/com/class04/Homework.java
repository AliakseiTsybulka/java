package com.class04;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class Homework  extends CommonMethods {
	
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
    
    @Test(priority=0)
    public void createUsers() {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.elementToBeClickable(findByXpath("//a[@href='Process.aspx']")));
    	findByXpath("//a[@href='Process.aspx']").click();   	
        sendText(findByCSS("input[id*='Name']"), "Lara Croft");
        sendText(findByCSS("input[id*='Box2']"), "666 Lenin St");
        sendText(findByCSS("input[id*='Box3']"), "St. Petersburg");
        sendText(findByCSS("input[id*='Box4']"), "FL");
        sendText(findByCSS("input[id*='Box5']"), "12345");

        driver.findElement(By.cssSelector("input[value='MasterCard']")).click();
        sendText(findByCSS("input[id*='Box6']"), "1234 5678 9009 8765");
        
        
//        findByCSS("input[id*='Button']").click();
    }
}
//    TC 1: WebOrder Verify Successful Login ( )
//    Step 1: Open browser and navigate to WebOrder
//    Step 2: Enter valid username, enter valid password and click on the  login button
//    Step 3: Verify user successfully logged in
    
//    TC 2: WebOrder Creating and verifying Users( )
//    Step 1: Create Two users and fill out all the required fields
//     Step 2: Verify that user one name appears within the table 
//     Step 3: Edit user one  and update user one’s State, assert the new updated State is displayed and save the changes.
//     Step 4: Verify that user two name appears within the table 
//     Step 5: Edit user two and update user two’s City and assert the new updated City is displayed and save the changes.
    
//    @AfterMethod(alwaysRun =true, groups ="Smoke")
//    public void tearDown() {
//        driver.close();
//    }
//}
/*
Identify Priority of Test Cases

TC 3: WebOrder verifying Users( )
        Step 1 : Assert Both User one and User Two are displayed

Note: Create BeforeClass and AfterClass annotations to open browser and logout from the application. 
The creation of users two should depend on the creation of users one.
The validation both users should depend on the creation of both users. Create xml file and share a screenshot of the test.
*/