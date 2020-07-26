package com.hrmsAPI.utils;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class PayloadConstants {

	public static String createEmployeePayLaod() {

		JSONObject jo = new JSONObject();
		jo.put("emp_firstname", "Arjon");
		jo.put("emp_lastname", "Karawn");
		jo.put("emp_middle_name", "kk");
		jo.put("emp_gender", "M");
		jo.put("emp_birthday", "1999-01-11");
		jo.put("emp_status", "Worker");
		jo.put("emp_job_title", "Developer");
		return jo.toString();

	}

//	public static String updateEmployeebody() {
//		
//		String updateEmployee ="{\r\n" + "  \"employee_id\": \"" ++ "\",\r\n" + "  \"emp_firstname\": \"Khalid\",\r\n"
//				+ "  \"emp_lastname\": \"Sonni\",\r\n" + "  \"emp_middle_name\": \"Lol\",\r\n"
//				+ "  \"emp_gender\": \"F\",\r\n" + "  \"emp_birthday\": \"1999-06-11\",\r\n"
//				+ "  \"emp_status\": \"Self-Employee\",\r\n"
//				+ "  \"emp_job_title\": \"Database Administrator\"\r\n" + "}";
//		
//	}

}
