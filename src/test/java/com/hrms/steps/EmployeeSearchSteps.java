package com.hrms.steps;

import com.hrms.utils.CommonFunctions;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonFunctions {

	@Given("user is logged in with valid admin credentails")
	public void user_is_logged_in_with_valid_admin_credentails() {
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.passWord, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

	}

	@Given("user navigate to emoloyee list page")
	public void user_navigate_to_emoloyee_list_page() {
		click(addEmp.pimBtn);
		click(empList.emplistBtn);

	}

	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String empId) {
		sendText(empList.empId, empId);

	}

	@When("clicks on search botton")
	public void clicks_on_search_botton() {
		click(empList.searchBtn);

	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
		System.out.println("the emp name or id is displayed");
		
	
		

	}

	@When("user enters valid employee name {string}")
	public void user_enters_valid_employee_name_and_last_name(String empName) {
		sendText(empList.empNameBox,empName );

	}

}
