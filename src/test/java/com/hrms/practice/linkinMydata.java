package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class linkinMydata {

	@Test
	public void linkTomydb() throws SQLException {
		
		CompanyDb cdb = new CompanyDb("59Mohamed@", "root", "jdbc:mysql://127.0.0.1:3306/company");

		Connection conn = DriverManager.getConnection(cdb.dbUrl, cdb.dbUsername, cdb.dbPassword);

		System.out.println("db connected successfully!!!");
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("select * from branch");
		rs.next();

		String branch1 = rs.getObject("branch_name").toString();

		System.out.println(branch1);

		List<String> brancheNames = new ArrayList<String>();
		List<Integer> branchIds = new ArrayList<Integer>();
 
		while (rs.next()) {
			brancheNames.add(rs.getObject("branch_name").toString());
			branchIds.add(rs.getInt("branch_id"));
			
			System.out.println(rs.getObject("branch_name").toString()+" "+rs.getInt("branch_id"));

		}
		
		System.out.println(brancheNames);
		System.out.println(branchIds);

	}

}
