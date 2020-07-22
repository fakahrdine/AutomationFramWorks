package com.hrms.utils;

import java.sql.*;
import java.util.*;

public class DbUtils {

	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	public static List<Map<String, String>> listData;

	/**
	 * this method will create connection to database
	 * 
	 */
	public static void creatConnection() {

		try {
			conn = DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"),
					ConfigsReader.getProperty("dbUsername"), ConfigsReader.getProperty("dbPassword"));
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Retrieve data and store it inside a list of maps
	 * 
	 * @param sql
	 * @return List<Map<String,String>>
	 */
	public static List<Map<String, String>> storeDataFromDb(String sql) {

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			listData = new ArrayList<Map<String, String>>();
			ResultSetMetaData rsMd = rs.getMetaData();
			while (rs.next()) {
				Map<String, String> rowMap = new LinkedHashMap<>();
				for (int i = 1; i <= rsMd.getColumnCount(); i++) {
					rowMap.put(rsMd.getColumnName(i), rs.getObject(i).toString());

				}
				listData.add(rowMap);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listData;
	}

	/**
	 * this method will close the connection to the database
	 */
	public static void closeResources() {

		try {

			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
