package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.Constants;

public class LoginPage extends BaseClass {
	@FindBy(css = "input#txtUsername")
	public static WebElement username;
	
	@FindBy(css = "input#txtPassword")
	public static WebElement password;
	
	@FindBy(css = "input#btnLogin")
	public static WebElement loginBtn;
	
	@FindBy(css="img[src*='logo.png']")
	public WebElement logo;
	
	@FindBy(xpath="//div[@class='toast-message']")
    public WebElement message;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void login(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}
	public void enterUsername(String userName) {
		
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
}
