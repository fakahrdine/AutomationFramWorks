package com.hrms.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

public class CompanyDb {

	String dbPassword;

	String dbUsername;

	String dbUrl;

	public CompanyDb(String dbPassword, String dbUsername, String dbUrl) {

		this.dbPassword = dbPassword;
		this.dbUsername = dbUsername;
		this.dbUrl = dbUrl;

	}

	public static void createEmployeePayLaod() {

		JSONObject jo = new JSONObject();
		jo.put("emp_firstname", "Arjon");
		jo.put("emp_lastname", "Karawn");
		jo.put("emp_middle_name", "kk");
		jo.put("emp_gender", "M");
		jo.put("emp_birthday", "1999-01-11");
		jo.put("emp_status", "Worker");
		Set<String> jsonSet = jo.keySet();
		

		for (String key : jsonSet) {

			System.out.println(key);
		}

		Map<String, Object> joMap = jo.toMap();

		System.out.println(joMap);

		String empS = joMap.get("emp_status").toString();

		System.out.println(empS);

		List<String> valueList = new ArrayList<>();
		for (Object keys : joMap.keySet()) {
			String values = joMap.get(keys).toString();

			System.out.println(values);
			valueList.add(values);

		}
		System.out.println(valueList);
		
//	String[] names=	jo.getNames(jo);
//	System.out.println(names[].toString());
		
		
	}

	public static void main(String[] args) {

		createEmployeePayLaod();

	}

}
