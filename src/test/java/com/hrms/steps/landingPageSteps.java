package com.hrms.steps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonFunctions;

import io.cucumber.java.en.Then;

public class landingPageSteps extends CommonFunctions {

	@Then("user should see the diffrent main menu taps")
	public void user_should_see_the_diffrent_main_menu_taps(io.cucumber.datatable.DataTable dataTable) {
		List<String> expectedMenuList = dataTable.asList();
		LinkedList<String> acctualMenuList = new LinkedList<String>();

		List<WebElement> menuElement = landingP.LandinPageMenu;

		for (WebElement ele : menuElement) {
			String menuTap = ele.getText();
			System.out.println(menuTap + " ");
			acctualMenuList.add(menuTap);
		}

		System.out.println(acctualMenuList);
		System.out.println(expectedMenuList);

		Assert.assertEquals("THE TWO LISTS ARE NOT MATCHED", expectedMenuList, acctualMenuList);
//		
//		SoftAssertions softAssert = new SoftAssertions();
//		softAssert.assertThat(acctualMenuList).isEqualTo(expectedMenuList);
//		softAssert.assertAll();
//		

	}

}
