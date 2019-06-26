package com.orangehrm.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.orangehrm.utils.BaseClass;

	public class AddEmployeePage extends BaseClass{
		
		@FindBy(id="firstName")
	    public WebElement firstName;
	    
	    @FindBy(id="middleName")
	    public WebElement middleName;
	    
	    @FindBy(id="lastName")
	    public WebElement lastName;
	    
	    @FindBy(id="employeeId")
	    public WebElement employeeId;
	    
	    @FindBy(xpath="//div[@id='location_inputfileddiv']//input")
	    public WebElement location;
	    
	    @FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
	    public WebElement locationList;
	    
	    @FindBy(xpath="//input[@id='chkLogin']")
	    public WebElement createLoginDetails;
	    
//	    @FindBy(css="a#systemUserSaveBtn")
//	    public WebElement saveBtn;
	    
	    @FindBy(id = "systemUserSaveBtn")
	    public WebElement saveBtn;
	    
	    @FindBy(xpath="//span[@id='pim.navbar.employeeName']")
	    public WebElement empCheck;
	    
	    @FindBy(xpath="//label[text()='Create Login Details']")
	    public WebElement loginDetails;
	    
	    @FindBy(css="input#username")
	    public WebElement uName;
	    
	    @FindBy(css="input#password")
	    public WebElement pass;
	    
	    @FindBy(css="input#confirmPassword")
	    public WebElement passConf;
	    
	    @FindBy(css="select#essRoleId")
	    public WebElement essRole;
	    
	    @FindBy(css="select#supervisorRoleId")
	    public WebElement supervisorRole;
	    
	    public AddEmployeePage() {
	        PageFactory.initElements(driver,this);
	    }
	}