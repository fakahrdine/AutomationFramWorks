package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonFunctions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;

public class LoginSteps extends CommonFunctions {

	@When("user enter valid admin {string} and {string}")
	public void user_enter_valid_admin_username_and_password(String adUserN, String adPsw) {
		sendText(login.userName, adUserN);
		sendText(login.passWord, adPsw);

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		click(login.loginBtn);

	}

	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
		boolean isContainsAdmin = dash.WelcomeBtn.getText().contains("Admin");

		Assert.assertTrue("admin is not displayed", isContainsAdmin);

	}

	@When("user enter valid ess {string} and {string}")
	public void user_enter_valid_ess_username_and_password(String essUserN, String essPws) {
		sendText(login.userName, essUserN);
		sendText(login.passWord, essPws);

	}

	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
		boolean isContainsessName = dash.WelcomeBtn.getText().contains("Mohamed");

		Assert.assertTrue("admin is not displayed", isContainsessName);

	}

	@When("I enter invalid username and password and see error message")
	public void i_enter_invalid_username_and_password_and_see_error_message(io.cucumber.datatable.DataTable dataTable) {
		SoftAssertions softAssert = new SoftAssertions();
		List<Map<String, String>> inValidLoginCredentials = dataTable.asMaps();

		for (int i = 0; i < inValidLoginCredentials.size(); i++) {

			Map<String, String> Maps = inValidLoginCredentials.get(i);
			String username = Maps.get("userName");
			String password = Maps.get("passWord");
			sendText(login.userName, username);
			sendText(login.passWord, password);
			click(login.loginBtn);

			// boolean errorMsgisPresent = login.invalidCredentialsErrorMsg.isDisplayed();

			softAssert.assertThat(login.invalidCredentialsErrorMsg.getText()).isEqualTo(Maps.get("errorMessage"));
			takeScreenShot(username);
			// Assert.assertTrue("error message didnt displayed or is wrong msg",
			// errorMsgisPresent);

		}
		softAssert.assertAll();

	}

}
