package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailspage {

	@FindBy(xpath = "//input[@id='personal_txtEmployeeId']")
	public WebElement pdIdemp;

	@FindBy(xpath = "//div[@id='profile-pic']/h1")

	public WebElement pdEmpName;

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement addedEmpName;

	@FindBy(id = "personal_txtOtherID")
	public WebElement otherIdstext;

	@FindBy(xpath = "//span[@class='validation-error']/following-sibling::img")

	public WebElement licensExperationDateCalenderIcon;

	@FindBy(xpath = "//input[@id='personal_txtSINNo']")

	public WebElement otherSsnNumber;

	@FindBy(xpath = "//input[@id='personal_txtNICNo']")
	public WebElement ssnNumber;

	@FindBy(xpath = "//input[@type='radio']")

	public List<WebElement> genderRadioBtns;

	@FindBy(xpath = "//select[@id='personal_cmbNation']")

	public WebElement nationalityDd;

	@FindBy(xpath = "//input[@id='personal_txtEmpNickName']")
	public WebElement nickNameTxtbox;

	@FindBy(xpath = "//input[@id='personal_txtMilitarySer']")

	public WebElement militaryServicetxtBox;

	@FindBy(xpath = "//select[@id='personal_cmbMarital']")

	public WebElement maritalStatusDd;

	@FindBy(xpath = "//input[@id='personal_DOB']/following-sibling::img")

	public WebElement datOfBirthCalendarIcon;

	@FindBy(name = "personal[chkSmokeFlag]")

	public WebElement smokerCheckBox;

	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement editOrSaveBtn;

	@FindBy(id = "btnAddAttachment")
	public WebElement addBtn;

	@FindBy(id = "ufile")
	public WebElement uplaodFileBtn;

	@FindBy(id = "txtAttDesc")
	public WebElement commentTextBox;

	@FindBy(id = "btnSaveAttachment")
	public WebElement uplaodBtn;

	@FindBy(xpath = "//input[@id='personal_txtLicenNo']")

	public WebElement driverLicenceTextBoxN;

	@FindBy(xpath = "//h1[text()='Personal Details']")

	public WebElement personalDetailText;

	@FindBy(id = "personal_txtLicExpDate")

	public WebElement licenseExpirationDate;

	@FindBy(id = "personal_DOB")
	public WebElement dateOfBirth;

	public PersonalDetailspage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
