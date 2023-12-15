package com.xworkz.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcFetch {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Connection is establishedd...");
		String fetchQuary = "Select * from location where id='1'";
		String fetchQurey1 = "Select * from location";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(fetchQurey1);
			while (rs.next()) {
				System.out.println("Result present in Result set");

				System.out.println(rs.getString("name"));

				System.out.println("Location Name-> " + rs.getString("name"));
				System.out.println("State -> " + rs.getString("state"));
				System.out.println("Pincode-> " + rs.getInt("pincode"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
