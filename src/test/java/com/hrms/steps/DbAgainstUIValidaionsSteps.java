package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.DbUtils;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DbAgainstUIValidaionsSteps extends CommonMethods {

	public static List<Map<String, String>> dbFirstNamelist;

	@Then("verify table is displayed")
	public void verify_table_is_displayed() {
		Assert.assertEquals("table is not displayes", true, empList.tableIspresent.isDisplayed());

	}

	@Then("get firstname from table")
	public void get_firstname_from_table() {
		System.out.println(empList.getFirstNameFromTable());

	}

	@When("get firstname from database")
	public void get_firstname_from_database() {
		String sqlQuery = "select emp_firstname from hs_hr_employees where employee_id =" + GlobalVariables.empId;
		DbUtils.creatConnection();
		dbFirstNamelist = DbUtils.storeDataFromDb(sqlQuery);
		System.out.println(dbFirstNamelist);

	}

	@Then("validate firstname from UI against db")
	public void validate_firstname_from_UI_against_db() {

		// SoftAssertions sfassert = new SoftAssertions();

		Assert.assertEquals(dbFirstNamelist, empList.getFirstNameFromTable());

	}

}
