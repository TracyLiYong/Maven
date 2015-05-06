package com.mtr.android.Maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection("jdbc:sqlite:db/test.db");
		Statement stmt = conn.createStatement();

		stmt.executeUpdate("DROP TABLE IF EXISTS person");
		stmt.executeUpdate("CREATE TABLE person(id INTEGER, name STRING)");
		stmt.executeUpdate("INSERT INTO person VALUES(1, 'john')");
		stmt.executeUpdate("INSERT INTO person VALUES(2, 'david')");
		stmt.executeUpdate("INSERT INTO person VALUES(3, 'henry')");
		ResultSet rs = stmt.executeQuery("SELECT * FROM person");

		while (rs.next()) {
			System.out.println("id=>" + rs.getInt("id") + ", name=>"
					+ rs.getString("name"));
		}
		stmt.close();
		conn.close();
	}

}
