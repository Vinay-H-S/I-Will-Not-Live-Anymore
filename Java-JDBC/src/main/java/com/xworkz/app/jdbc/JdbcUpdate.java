package com.xworkz.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Conncetion is established..");
		String upadateQurey1 = "update location set city='BANGLORE' where city='Banglore'";
		String upadateQurey2 = "update location set city='SHIVAMOGGA' where name='vidyanagar'";
		String upadateQurey3 = "update location set city='BHADRAVATHI' where name='Hosmane'";
		String upadateQurey4 = "update location set city='BHADRAVATHI' where name='Halappa Circle'";
		String upadateQurey5 = "update location set city='BANGLORE' where name='Vijayanagr'";
		String deleteQurey="delete from location where city='BANGLORE'";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			Statement statement = conn.createStatement();
			statement.executeUpdate(upadateQurey1);
			statement.executeUpdate(upadateQurey2);
			statement.executeUpdate(upadateQurey3);
			statement.executeUpdate(upadateQurey4);
			statement.executeUpdate(upadateQurey5);
			statement.execute(deleteQurey);
			System.out.println("Data is updated...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
