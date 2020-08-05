package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	@Given("user logged in into HRMS")
	public void user_logged_in_into_HRMS() {
		login.loginTHrms(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));

	}

	@Given("user is navigated to Add Employee Page")
	public void user_is_navigated_to_Add_Employee_Page() {
		addEmp.navigateToAddEmployee();

	}

	@When("user enters employees first {string} and last {string}")
	public void user_enters_employees_first_name_and_last_name(String fName, String lName) {
		wait(3);
		waitForVisibilty(addEmp.firstNText);
		sendText(addEmp.firstNText, fName);
		sendText(addEmp.lastNText, lName);
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		click(addEmp.saveBtn);

	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully() {

		wait(3);

		String empName = pdetails.addedEmpName.getText();
		System.out.println(empName);
		boolean newEmpNameisPresent = pdetails.addedEmpName.isDisplayed();
		Assert.assertTrue("employee name is not displayed ", newEmpNameisPresent);
//		Assert.assertTrue("employee name is not displayed ", newEmpNameisPresent);
//		Assert.assertTrue("employee name is not displayed ", newEmpNameisPresent);

	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		addEmp.empIdTexBox.clear();

	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		click(addEmp.addEmpCredentialsCheckBox);

	}

	@When("user enters login credentials {string} , {string}")
	public void user_enters_login_credentials(String essUsern, String essPass) {
		sendText(addEmp.empUserName, essUsern);
		sendText(addEmp.empPassWord, essPass);
		sendText(addEmp.empConfirmPass, essPass);

	}

	@When("user enters employees first {string} and last {string} and {string}")
	public void user_enters_employees_first_and_last_and(String string, String string2, String string3) {

		sendText(addEmp.firstNText, string);

		sendText(addEmp.empMiddleName, string2);

		sendText(addEmp.lastNText, string3);

	}

}
