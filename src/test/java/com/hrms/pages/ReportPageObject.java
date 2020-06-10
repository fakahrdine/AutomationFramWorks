package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportPageObject {
	@FindBy(xpath = "//a[@id='menu_core_viewDefinedPredefinedReports']")
	public WebElement reportBtn;

	@FindBy(id = "search_search")

	public WebElement searchReport;

	@FindBy(xpath = "//input[@name='_reset']")
	public WebElement resetreportSearch;

	@FindBy(xpath = "//input[@name='btnAdd']")
	public WebElement addReportBtn;
	@FindBy(css = "input#btnDelete")
	public WebElement deletReportBtn;

	@FindBy(css = "input#report_report_name")

	public WebElement reportNametxtBox;
	
	

}
