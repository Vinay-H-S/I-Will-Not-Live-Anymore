package com.xworkz.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcNewTabelUsingPS {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		String createQurey = "create table Details (id int,name varchar(20),mobileNumber bigint,email varchar(30),address varchar(20))";

		String insertQurey = "insert into Details(id,name,mobileNumber,email,address) values (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement st=null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Xworkzodc@123");
			st = con.prepareStatement(insertQurey);
			st.setInt(1, 1);
			st.setString(2, "Vinay H S");
			st.setLong(3, 7026220424L);
			st.setString(4, "vinayshudedar383@gmail.com");
			st.setString(5, "Shivamogga");
			st.execute();
			st.setInt(1, 2);
			st.setString(2, "Sagar K");
			st.setLong(3, 9591465232L);
			st.setString(4, "sagarsmg@gmail.com");
			st.setString(5, "Shivamogga");
			st.execute();
			st.setInt(1, 3);
			st.setString(2, "Jeevan K");
			st.setLong(3, 898845152L);
			st.setString(4, "jeevanmoriya@gmail.com");
			st.setString(5, "Bhadravathi");
			st.execute();
			st.setInt(1, 4);
			st.setString(2, "Harshith Kumar N R");
			st.setLong(3, 9481526314L);
			st.setString(4, "harshith83@gmail.com");
			st.setString(5, "N R Pura");
			st.execute();
			st.setInt(1, 5);
			st.setString(2, "Darshan R");
			st.setLong(3, 7854512636L);
			st.setString(4, "darshanR@gmail.com");
			st.setString(5, "Sagara");
			st.execute();

			System.out.println("Data is inserted...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
					st.close();
					System.out.println("Costly resources is closed..");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
