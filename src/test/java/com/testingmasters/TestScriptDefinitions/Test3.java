package com.testingmasters.TestScriptDefinitions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test3 
{
	public static void main(String[] args) throws Throwable {
		// step1 load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		// Create object for the statement.
		Statement stmt = con.createStatement();
		String StrQuery = "select * from DEPARTMENTS";
		// >>Fire a query from DB and store in the result set:
		ResultSet rs = stmt.executeQuery(StrQuery);

		// >>Fetching details by column name:
		rs.next();
		System.out.println(rs.getString("department_id") + "  " + rs.getString("department_name"));
		// >>Fetching details by column number:
		rs.next();
		System.out.println(rs.getString(1) + "  " + rs.getString(2));

		while(rs.next())  
		{
			System.out.println(rs.getString("department_id")+"  "+rs.getString("department_name"));  
		}

	}

}
