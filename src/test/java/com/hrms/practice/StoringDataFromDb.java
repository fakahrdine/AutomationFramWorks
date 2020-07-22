package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StoringDataFromDb {

	String dbUsername = "root";

	String dbPassword = "59Mohamed@";

	String dbUrl = "jdbc:mysql://127.0.0.1:3306/company";

	//@Test
	public void getConnctionhardCodedstoring() throws SQLException {
		String sql = "select * from branch_supplier";

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		List<Map<String, String>> listData = new ArrayList<Map<String, String>>();
		while (rs.next()) {

			Map<String, String> map = new LinkedHashMap<String, String>();
			map.put("branch_id", rs.getObject("branch_id").toString());
			map.put("supplier_name", rs.getObject("supplier_name").toString());
			map.put("supply_type", rs.getObject("supply_type").toString());

			listData.add(map);
		}

		System.out.println(listData);

	}

	@Test
	public void getConnctiondynamicdatastoring() throws SQLException {
		String sql = "select * from employee where super_id is not null";

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		List<Map<String, String>> listData = new ArrayList<Map<String, String>>();
		Map<String, String> map;

		ResultSetMetaData rsm = rs.getMetaData();
		int cols = rsm.getColumnCount();

		while (rs.next()) {
			map = new LinkedHashMap<String, String>();
			for (int i = 1; i <= cols; i++) {
				map.put(rsm.getColumnName(i), rs.getObject(i).toString());
				

			}
			// adding the row map tothe list before jumpig to the next row the database
			listData.add(map);
			

		}
		
		System.out.println(listData);
		
		
		
		
	}
}