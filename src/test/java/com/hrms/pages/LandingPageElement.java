package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class LandingPageElement {

	@FindBy(xpath = "//div[@class='menu']/ul/li/a")

	public List<WebElement> LandinPageMenu;

	public LandingPageElement() {
		PageFactory.initElements(BaseClass.driver, this);

	}

}
