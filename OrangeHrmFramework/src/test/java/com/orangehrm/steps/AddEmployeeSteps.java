package com.orangehrm.steps;

import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddEmployeeSteps extends CommonMethods {
	LoginPage login;
	HomePage page;
	AddEmployeePage emp;
	
	@Given("I logged into OrangeHrm")
	public void i_logged_into_OrangeHrm() {
	    login = new LoginPage();
	    login.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
	}

	@When("I click on PIM link")
	public void i_click_on_PIM_link() {
	    page = new HomePage();
	    click(page.PIM);
	}

	@When("I click on Add Employee link")
	public void i_click_on_Add_Employee_link() {
		page = new HomePage();
	    click(page.addEmployee);
	}

	@When("I provide Employee details {string} and {string} and {string} and {string}")
	public void i_provide_Employee_details(String name, String middleName, String lastName, String location) {
	    emp = new AddEmployeePage();
	    sendText(emp.firstName, name);
	    sendText(emp.middleName, middleName);
	    sendText(emp.lastName, lastName);
	    click(emp.location);
	    selectList(emp.locationList, location);
	}

	@Then("I see employee is added successfully {string} and {string}")
	public void i_see_employee_is_added_successfully(String name, String lastName) {
		emp = new AddEmployeePage();
	    waitForElementBeClickable(emp.empCheck, 20);
	    String text = emp.empCheck.getText();
	    Assert.assertEquals(text, name+" "+lastName);
	}
	
	@When("I provide firstname, midlename, lastname and location")
	public void i_provide_firstname_midlename_lastname_and_location() {
		emp = new AddEmployeePage();
	    sendText(emp.firstName, "Tadeusz");
	    sendText(emp.middleName, "Bonaventura");
	    sendText(emp.lastName, "Kosciuszko");
	    click(emp.location);
	    selectList(emp.locationList, "Smart Office");
	}

	@When("I click on create login details")
	public void i_click_on_create_login_details() {
	    click(emp.loginDetails);
	}

	@When("I provide all mandatory fields")
	public void i_provide_all_mandatory_fields() {
		emp.uName.clear();
	    sendText(emp.uName, "CCСucumberTadeus");
	    emp.pass.clear();
	    sendText(emp.pass, "Vasilypupkin@69@@666");
	    emp.passConf.clear();
	    sendText(emp.passConf, "Vasilypupkin@69@@666");
	    waitForElementBeClickable(emp.essRole, 20);
//	    click(emp.essRole);
//	    selectValueFromDD(emp.essRole, "Financial Director");
//	    waitForElementBeClickable(emp.supervisorRole, 20);
//	    click(emp.supervisorRole);
//	    selectValueFromDD(emp.supervisorRole, "CEO");
	    waitForElementBeClickable(emp.saveBtn, 20);
	    emp.saveBtn.click();
	}
	
	@When("I click on save button")
	public void i_click_on_save_button() {
		waitForElementBeClickable(emp.saveBtn, 20);
		emp = new AddEmployeePage();
	    click(emp.saveBtn);
	}

	@Then("I see employee is added successfully")
	public void i_see_employee_is_added_successfully() {
		emp = new AddEmployeePage();
	    waitForElementBeClickable(emp.empCheck, 20);
	    String text = emp.empCheck.getText();
	    Assert.assertEquals(text, "Tadeusz Kosciuszko");
	}
}