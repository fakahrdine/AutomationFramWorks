package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonFunctions;

public class AddEmployePageObjects extends CommonFunctions {

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']/b")
	public WebElement pimBtn;
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmpBtn;
	@FindBy(xpath = "//div[text()=' First Name']")
	public WebElement firstNlabel;
	@FindBy(xpath = "//input[@id='lastName']/preceding-sibling::div")
	public WebElement lastNlable;
	@FindBy(xpath = "//label[text()='Employee Id']")
	public WebElement empIdlabel;
	@FindBy(xpath = "//label[text()='Photograph']")
	public WebElement photoGrapthLabel;
	@FindBy(css = "input#firstName")
	public WebElement firstNText;
	@FindBy(css = "input#lastName")
	public WebElement lastNText;
	@FindBy(xpath = "//input[@id='photofile']")
	public WebElement choseFileBtn;
	@FindBy(id = "btnSave")
	public WebElement saveBtn;

	@FindBy(id = "chkLogin")
	public WebElement addEmpCredentialsCheckBox;

	@FindBy(xpath = "//input[@name='user_name']")
	public WebElement empUserName;
	@FindBy(css = "input#user_password")
	public WebElement empPassWord;
	@FindBy(id = "re_password")
	public WebElement empConfirmPass;

	@FindBy(xpath = "//select[@id='status']")
	public WebElement empStatusDd;

	@FindBy(id = "btnSave")
	public WebElement empSaveBtn;

	@FindBy(xpath = "//span[text()='Required'][@for='firstName']")

	public WebElement FnRequiredFeildLabel;

	@FindBy(xpath = "//span[text()='Required'][@for='lastName']")
	public WebElement lnRequiredFeildlabel;

	@FindBy(id = "employeeId")
	public WebElement empIdtext;

	@FindBy(xpath = "//h1[text()='Add Employee']")
	public WebElement addEmpText;

	@FindBy(xpath = "//label[text()='Accepts jpg, .png, .gif up to 1MB. Recommended dimensions: 200px X 200px']")
	public WebElement imgExetentionlabel;
	@FindBy(id = "middleName")

	public WebElement empMiddleName;

	@FindBy(xpath = "//span[contains(text(),'and lower case characters')]")
	public WebElement passInstructionsMsg;

	@FindBy(id = "employeeId")
	public WebElement empIdTexBox;

	public AddEmployePageObjects() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToAddEmployee() {
		click(pimBtn);
		click(addEmpBtn);

	}

}
