package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.hrms.utils.ConfigsReader;

public class JDBCDemo {

	String dbUsername = "syntax_hrm";

	String dbPassword = "syntaxhrm123";
	// jdbc:driver type:hostname:port/database name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void jdbc() throws SQLException {
		Connection conn = DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"), dbUsername, dbPassword);
	System.out.println(conn.getSchema());
	
	//System.out.println(conn.getClientInfo());
		System.err.println("Db connection is successfull");

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("select *from hs_hr_employees");
		rs.next();
		String fistname1 = rs.getString("emp_firstname");

		System.out.println(fistname1);

		rs.next();
		String fistname2 = rs.getString("emp_firstname");

		System.out.println(fistname2);

		rs.next();
		String employeeNum = rs.getObject("emp_number").toString();

		System.out.println(employeeNum);

		while (rs.next()) {

			String firstnamecol = rs.getObject("emp_firstname").toString();
			System.out.println(firstnamecol);
		}

		ResultSet rs1 = st.executeQuery("select *from ohrm_job_title");

		
		List<String> jobtitles = new ArrayList<String>();

		while (rs1.next()) {
			jobtitles.add(rs1.getObject("job_title").toString());
			
		}
		
	for (String jobs : jobtitles) {
		
		System.out.println(jobs);
	}

	}

}
