package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPage {

	@FindBy(xpath = "//a[text()='Employee List']")
	public WebElement emplistBtn;

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empNameBox;

	@FindBy(id = "empsearch_id")

	public WebElement empId;

	@FindBy(xpath = "//select[@name='empsearch[employee_status]']")

	public WebElement empStatusDd;

	@FindBy(xpath = "//select[@id='empsearch_termination']")

	public WebElement includeDd;

	@FindBy(xpath = "//input[@id='empsearch_supervisor_name']")

	public WebElement superVisorName;

	@FindBy(id = "empsearch_job_title")

	public WebElement jobTitleDb;

	@FindBy(id = "empsearch_sub_unit")
	public WebElement subUnitDb;

	@FindBy(xpath = "//table[@id='resultTable']//tr//td[2]/a")
	public WebElement empIdInTable;

	@FindBy(css = "input#btnAdd")

	public WebElement addEmpBtn;

	@FindBy(css = "input[id='btnDelete']")

	public WebElement deletEmpBtn;

	@FindBy(id = "searchBtn")

	public WebElement searchBtn;
	@FindBy(xpath = "//a[text()='Next']")

	public WebElement tableNextBtn;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr")

	public WebElement tableHeaderRow;

	public EmployeeListPage() {

		PageFactory.initElements(BaseClass.driver, this);
	}

}
