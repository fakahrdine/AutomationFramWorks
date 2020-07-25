package com.hrms.API.steps.practice;

import org.junit.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class PostRequest {

	public static String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTU2MzM4NjAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTY3NzA2MCwidXNlcklkIjoiNjcyIn0.1oeskVS4-P08SArXJItCg8yQw0v_w6z_T9pbUEYFaFg";
	String BaseUrl = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	// String Endpoin = RestAssured.basePath = "/createEmployee.php";
	public static String fname = "Anwar";

	@Test

	public void createNewEmployee() {
		given()

				.contentType("application/json").auth().oauth2(token)

				.body("{\r\n" + "  \"emp_firstname\": \"" + fname + "\",\r\n" + "  \"emp_lastname\": \"Abdo\",\r\n"
						+ "  \"emp_middle_name\": \"sa\",\r\n" + "  \"emp_gender\": \"M\",\r\n"
						+ "  \"emp_birthday\": \"1998-01-11\",\r\n" + "  \"emp_status\": \"Worker\",\r\n"
						+ "  \"emp_job_title\": \"Developer\"\r\n" + "}");

		when().post("/createEmployee.php").then()

				// .statusCode(201)
				.and().log().all().body("Message", equalTo("Entry Created"));

	}

}
