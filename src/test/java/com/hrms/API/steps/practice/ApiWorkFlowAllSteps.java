package com.hrms.API.steps.practice;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import com.hrmsAPI.utils.ApiConstants;
import com.hrmsAPI.utils.PayloadConstants;
import com.oracle.jrockit.jfr.ContentType;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiWorkFlowAllSteps {

	String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

	static RequestSpecification request;
	static Response response;
	static String EmployeeId;

	@Given("a request is prepared to create an employee")
	public void a_request_is_prepared_to_create_an_employee() {
		request = given().header("Content-Type", io.restassured.http.ContentType.JSON)
				.header("Authorization", TokenGenerationSteps.token).body(PayloadConstants.createEmployeePayLaod());

	}

	@When("a Post call is made to create an employee")
	public void a_Post_ca_is_made_to_create_an_employee() {
		response = request.when().post(ApiConstants.CREAT_EMPLOYEE_ENDPOINT);
	}

	@Then("the status code for creating is {int}")
	public void the_status_code_for_creating_is(Integer statusCode) {
		response.then().assertThat().statusCode(statusCode);

	}

	@Then("the employee is created and response contains key {string} and value {string}")
	public void the_employee_is_created_and_response_contains_key_and_value(String key, String value) {

		response.then().assertThat().body(key, equalTo(value));
	}

	@Then("employee ID {string} is stored as a global variable to be used fo other calls")
	public void employee_ID_is_stored_as_a_global_variable_to_be_used_fo_other_calls(String empId) {
		EmployeeId = response.body().jsonPath().getString(empId);
		System.out.println(EmployeeId);
	}

	@Given("a request is prepared to retriev the created employee")
	public void a_request_is_prepared_to_retriev_the_created_employee() {
		request = given().header("Content-Type", "application/json").header("Authorization", TokenGenerationSteps.token)
				.queryParam("employee_id", EmployeeId);

	}

	@When("a Get call is made to retrieve the created employee")
	public void a_Get_call_is_made_to_retrieve_the_created_employee() {
		response = request.when().get(ApiConstants.GET_ONE_EMPLOYEE_ENDPOINT);

	}

	@Then("the status code for retrieving the created employee is {int}")
	public void the_status_code_for_retrieving_the_created_employee_is(Integer statusCode) {
		response.then().assertThat().statusCode(statusCode);

	}

	@Then("the retrieved employee Id at {string} matches the globally stored employee Id")
	public void the_retrieved_employee_Id_at_matches_the_globally_stored_employee_Id(String value) {
		String empID = response.body().jsonPath().getString(value);

		Assert.assertTrue(empID.contentEquals(EmployeeId));

	}

//	@Then("the retrieved data matches the data used to create an employee")
//	public void the_retrieved_data_matches_the_data_used_to_create_an_employee(DataTable dataTable) {
//		
//		List<Map<String, String>> expectedData = dataTable.asMaps();	
//		List<Map<String, String>> actualData =  response.jsonPath().get("")	;	
//		int index = 0;		
//		for(Map<String, String> map : expectedData) {			
//			Set<String> keys = map.keySet();		
//			for(String key : keys) {
//				String expectedValue = map.get(key);
//				String actualValue = actualData.get(index).get(key);
//				Assert.assertEquals(expectedValue, actualValue);
//			}			
//			index ++;			
//		}	
//		String empID = response.body().jsonPath().getString(EmployeeId);
//		Assert.assertTrue(empID.contentEquals(EmployeeId));
//	}

}
