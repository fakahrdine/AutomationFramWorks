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

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

public class EnhancedDataStoring {

	public EnhancedDataStoring() {
		ConfigsReader.readPropertieas(Constants.PROPERTIES_FILE_PATH);

	}

//	

	@Test
	public void storeData() throws SQLException {
		// EnhancedDataStoring en = new EnhancedDataStoring();
		String dbUserName = ConfigsReader.getProperty("dbUsername");
		String dbPassword = ConfigsReader.getProperty("dbPassword");
		String dbUrl = ConfigsReader.getProperty("dbUrl");

		String query = " select *from hs_hr_emp_locations;";

		Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);

		ResultSetMetaData rsMetaData = rs.getMetaData();

		List<Map<String, String>> listData = new ArrayList<>();

		Map<String, String> map;

		while (rs.next()) {
			map = new LinkedHashMap<>();

			for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {

				map.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());

			}
			listData.add(map);
		}

		System.out.println(listData);

	}

}
