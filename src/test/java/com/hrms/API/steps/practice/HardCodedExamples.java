package com.hrms.API.steps.practice;

import io.cucumber.java.en.Given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
import org.junit.runners.MethodSorters;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;

/*
 * this @FixMethodOrder we will execute @Test annotation in ascending order
 * Alphabetical order */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardCodedExamples {

	static String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

	static String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUxNzAxMjUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTIxMzMyNSwidXNlcklkIjoiNzE4In0.ozVsmhqLhGfqiRtj9lo38QXiCTA13UMZOmHex4SszH0";
	public static String empId;

	/**
	 * Rest Assured given - prepare your request when - you are making the call to
	 * the endpoint then - validating
	 * 
	 * @param args
	 * 
	 * 
	 */

	@Test
	public void aPostcreateEmployee() {

		RequestSpecification creatEmployeeRequest = given().header("Content-type", "application/json")
				.header("Authorization", token)
				.body("{\r\n" + "  \"emp_firstname\": \"Delmari\",\r\n" + "  \"emp_lastname\": \"raww\",\r\n"
						+ "  \"emp_middle_name\": \"del\",\r\n" + "  \"emp_gender\": \"M\",\r\n"
						+ "  \"emp_birthday\": \"1996-01-11\",\r\n" + "  \"emp_status\": \"Worker\",\r\n"
						+ "  \"emp_job_title\": \"Developer\"\r\n" + "}");
		Response creatEmployeeResponse = creatEmployeeRequest.when().post("/createEmployee.php\r\n" + "");
		creatEmployeeResponse.prettyPrint();

		/*
		 * jsonPath() to view response body which lets us get the employee ID and Store
		 * it as global variable so that we may use it with others
		 */
		empId = creatEmployeeResponse.jsonPath().getString("Employee[0].employee_id");

		System.out.println(empId);

		creatEmployeeResponse.then().assertThat().statusCode(201);

		/*
		 * verifing message using equal to method _ manually import statis package
		 * import static org.hamcrest.Matchers.*;
		 */
		creatEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));

	}

	@Test
	public void bGetCreatedEmployee() {
		/*
		 * preparing request for /getOneEmployee.php
		 */

		RequestSpecification getCreatedEmpRequest = given().header("Content-type", "application/json")
				.header("Authorization", token).queryParam("employee_id", empId).log().all();

		/*
		 * Making calls to retrieve created employee
		 */
		Response getCreatedEmpResponse = getCreatedEmpRequest.when().get("/getOneEmployee.php");
		String response = getCreatedEmpResponse.prettyPrint();

		String employeeId = getCreatedEmpResponse.body().jsonPath().get("employee[0].employee_id");

		boolean verifiEmpIdisMatch = employeeId.contentEquals(empId);
		Assert.assertTrue(verifiEmpIdisMatch);

		getCreatedEmpResponse.then().assertThat().statusCode(200);

		JsonPath js = new JsonPath(response);

		String emplIdd = js.getString("employee[0].employee_id");
		String empfname = js.getString("employee[0].emp_firstname");
		String empLname = js.getString("employee[0].emp_lastname");
		String empMname = js.getString("employee[0].emp_middle_name");
		String empGender = js.getString("employee[0].emp_gender");
		String empBirthDay = js.getString("employee[0].emp_birthday");
		String empStatus = js.getString("employee[0].emp_status");
		String empJobTitle = js.getString("employee[0].emp_job_title");
		System.out.println(emplIdd);
		System.out.println(empGender);

		// verify employee ids matches
		Assert.assertTrue(emplIdd.contentEquals(empId));
		Assert.assertEquals(empId, emplIdd);

		// Verify expected firstname matches actual firstname

		Assert.assertTrue(empfname.contentEquals("Delmari"));
		// Verify expected middle name is matches actual middle name

		Assert.assertTrue(empMname.equals("del"));

		// verify expected lastname is matches actual lastname

		Assert.assertTrue(empLname.contentEquals("raww"));

		// verify expected gender matches actual gender
		Assert.assertTrue(empGender.contentEquals("Male"));

		// verify expected job title matches actual jobtitle

		Assert.assertTrue("Values are not matches", empJobTitle.contentEquals("Developer"));

	}

	@Test
	public void cGetAllEmployees() {
		// preparing /getAllemployees.php request

		RequestSpecification getAllEmployeeRequest = given().header("Content-type", "application/json")
				.header("Authorization", token).log().all();

		Response getAllEmployeeResponse = getAllEmployeeRequest.when().get("/getAllEmployees.php");

		// getAllEmployeeResponse.prettyPrint();

		String allEmployess = getAllEmployeeResponse.body().asString();

		JsonPath js = new JsonPath(allEmployess);

		int sizeOfList = js.getInt("Employees.size()");

		System.out.println(sizeOfList);
		// print all the employees ids

		for (int i = 0; i < sizeOfList; i++) {

			String aids = js.getString("Employees[" + i + "].employee_id");

			// System.out.println(aids);
			if (aids.contentEquals(empId)) {

				System.out.println("employee id " + empId + " is present is the body");
				String empfname = js.getString("Employees[" + i + "].emp_firstname");
				System.out.println(empfname);
				break;

			}

		}

	}

	public void dPutUpdateCreatedEmployee() {
		
		RequestSpecification updateCreatedEmpRequest = given().header("Content-type","application/json").header("Authorization",token).body("{\r\n" + 
				"  \"employee_id\": \""+empId+"\",\r\n" + 
				"  \"emp_firstname\": \"Khalid\",\r\n" + 
				"  \"emp_lastname\": \"Sonni\",\r\n" + 
				"  \"emp_middle_name\": \"Lol\",\r\n" + 
				"  \"emp_gender\": \"F\",\r\n" + 
				"  \"emp_birthday\": \"1999-06-11\",\r\n" + 
				"  \"emp_status\": \"Self-Employee\",\r\n" + 
				"  \"emp_job_title\": \"Database Administrator\"\r\n" + 
				"}");
		
		Response updateCreatedEmployeeResponse = updateCreatedEmpRequest.when().put("/updateEmployee.php");
		
		updateCreatedEmployeeResponse.prettyPrint();
		
		
		
		
	}

}