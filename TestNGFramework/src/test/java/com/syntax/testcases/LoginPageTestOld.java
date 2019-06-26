package com.syntax.testcases;

import org.testng.annotations.Test;

import com.syntax.pages.LoginPageWithoutPageFactory;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class LoginPageTestOld extends BaseClass{

	@Test
	public void loginToOrangeHRM() {
		
		LoginPageWithoutPageFactory login=new LoginPageWithoutPageFactory();
		
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "06I@PjFbgM");
		CommonMethods.click(login.btnLogin);
		
	}
}