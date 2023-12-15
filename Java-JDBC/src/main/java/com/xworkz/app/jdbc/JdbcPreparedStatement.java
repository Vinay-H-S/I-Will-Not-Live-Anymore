package com.xworkz.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String insertQurey = "INSERT INTO location(id,name,city,state,pincode) values (?,?,?,?,?)";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "Xworkzodc@123");
			PreparedStatement statement = conn.prepareStatement(insertQurey);
			statement.setInt(1, 6);
			statement.setString(2, "Malavagoppa");
			statement.setString(3, "Shivamogga");
			statement.setString(4, "Karnataka");
			statement.setInt(5, 577652);
			statement.execute();
			System.out.println("Data is inserted..");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
