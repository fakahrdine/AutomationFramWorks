package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Rsdbmetadata {

	String dbUsername = "root";

	String dbPassword = "59Mohamed@";

	String dbUrl = "jdbc:mysql://127.0.0.1:3306/company";

	@Test
	public void getConnction() throws SQLException {
		String sql = "select * from branch_supplier";

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		System.out.println("connected successfuly");

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			String branchid = rs.getObject(1).toString();
			String supplierName = rs.getObject(2).toString();
			String supplytype = rs.getObject(3).toString();

			System.out.println(branchid + " " + supplierName + " " + " " + supplytype);

		}

		DatabaseMetaData dbMetadata = conn.getMetaData();
		String driverversion = dbMetadata.getDriverVersion();
		System.out.println(driverversion);
		String dbversion = dbMetadata.getDatabaseProductVersion();

		System.out.println(dbversion);

		boolean unionAllisSupported = dbMetadata.supportsUnionAll();
		System.out.println(unionAllisSupported);
		String driverNames = dbMetadata.getDriverName();

		System.out.println(driverNames);

		String dbUrl = dbMetadata.getURL();

		System.out.println(dbUrl);

		boolean fulljoinisSupported = dbMetadata.supportsFullOuterJoins();

		System.out.println(fulljoinisSupported);

		// lets get some meta data about the resultSet
		ResultSetMetaData rsMetadata = rs.getMetaData();
		int cols = rsMetadata.getColumnCount();

		System.out.println(cols);

		int colsSize = rsMetadata.getColumnDisplaySize(2);
		System.out.println(colsSize);

		String col1 = rsMetadata.getColumnName(1);
		String col2 = rsMetadata.getColumnName(2);
		String col3 = rsMetadata.getColumnName(3);
		System.out.println(col1 + " " + col2 + " " + col3);

		String scn = rsMetadata.getSchemaName(1);
		System.out.println(scn);
		String tableName = rsMetadata.getTableName(2);

		System.out.println(tableName);

		for (int i = 1; i <= cols; i++) {

			String allColsNames = rsMetadata.getColumnName(i);
			System.out.println(allColsNames);
		}
		
		
		

	}

}
