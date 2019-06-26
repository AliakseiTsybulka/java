package com.class11;

import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class GroupTask1 extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "http://uitestpractice.com/");
		findByLinkText("Form").click();
		sendText(findByCSS("input#firstname"), "Tester");
		sendText(findByCSS("input#lastname"), "Testerski");
		selectRB(findElements("label.radio-inline"), "Single");
		selectCB(findElements("label.checkbox-inline"), "Cricket");
		selectValueFromDD(findByCSS("select#sel1"), "Belarus");
		sendText(findByXpath("//input[@id='datepicker']"),"07/05/1989");
		sendText(findByCSS("input#phonenumber"), "929 292 0000");
		sendText(findByCSS("input#username"), "@testerovich");
		sendText(findByXpath("//input[@id='email']"),"zestacaise@gmail.com");
		sendText(findByCSS("textarea#comment"), "I understand the logic how to make a method for date picker but I just sent a text because it's too late and I wanna go sleep ASAP lol");
		sendText(findByCSS("input#pwd"), "don't_tell_anybody_plzzz");
		//quit();
	}

}
/*
TC 1: Users Application Form Fill
1.Open chrome browser
2.Go to “http://uitestpractice.com/”
3.Click on “Forms” link
4.Fill out the entire form
5.Close the browser
MUST USE Functions: 
*/