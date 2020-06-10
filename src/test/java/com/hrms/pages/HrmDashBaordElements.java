package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class HrmDashBaordElements {

	@FindBy(id = "welcome")
	public WebElement WelcomeBtn;

	@FindBy(xpath = "//a[text()='Logout']")

	public WebElement logOutBtn;

	@FindBy(xpath = "//a[@target='_blank']/img")

	public WebElement hrmsLogo;

	@FindBy(xpath = "//a[text()='About']")

	public WebElement aboutBtn;

	@FindBy(xpath = "//a[text()='Change Password']")
	public WebElement changePasswordBtn;

	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']/b")

	public WebElement adminPageBtn;

	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']/b")
	public WebElement leavePageBtn;

	@FindBy(xpath = "//a[@id='menu_time_viewTimeModule']/b")

	public WebElement timePageBtn;

	@FindBy(xpath = "//a[@id='menu_recruitment_viewRecruitmentModule']/b")

	public WebElement recruitmentPageBtn;

	@FindBy(xpath = "//a[@id='menu__Performance']/b")

	public WebElement performancePageBtn;

	@FindBy(xpath = "//a[@id='menu_dashboard_index']/b")
	public WebElement dashBaordPageBtn;

	@FindBy(xpath = "//a[@id='menu_directory_viewDirectory']/b")
	public WebElement directoryPageBtn;

	public HrmDashBaordElements() {
		PageFactory.initElements(BaseClass.driver, this);

	}

	public String getTitle() {

		return BaseClass.driver.getTitle();
	}

}
