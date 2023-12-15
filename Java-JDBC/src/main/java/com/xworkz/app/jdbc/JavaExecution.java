package com.xworkz.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaExecution {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Establishing a connection..");
		String query = "INSERT INTO location(id,name,city,state,pincode) values (1,'Rajajinagar','Banglore','Karnataka',560096)";
		String qurey1 = "INSERT INTO location  values (2,'Vidyanagar','Shivamogga','Karnataka',577005)";
		String query2 = "INSERT INTO location  values (3,'Hosmane','Bhadravathi','Karnataka',577301)";
		String query3 = "INSERT INTO location  values (4,'Halappa Circle','Bhdravathi','Karnataka',577301)";
		String query4 = "INSERT INTO location  values (5,'Vijayanagar','Banglore','Karnataka',5770016)";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
			Statement statement = connection.createStatement();
			statement.execute(query);
			statement.execute(qurey1);
			statement.execute(query2);
			statement.execute(query3);
			statement.execute(query4);
			System.out.println("Data is inserted....");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
