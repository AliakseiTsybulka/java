package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;


public class Task extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
setUpDriver("chrome","http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
        
        String file="C:\\Users\\User\\Desktop\\army.jpg";
        
        driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(file);
        driver.findElement(By.cssSelector("button.gwt-Button")).click();
                
    
        if(getAlertText().contains("File uploaded!")) {
            System.out.println("File uploaded ");
        }else {
            System.out.println("File did not upload");
        }
        
        acceptAlert();
        Thread.sleep(2000);
        CommonMethods.drawBorder(findByCSS("input.gwt-FileUpload"), driver);
        Thread.sleep(2000);
        driver.close();	
	}

}
/*
TC 1: Upload file and Take Screenshot
Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
Upload file
Verify file got successfully uploaded and take screenshot
*/