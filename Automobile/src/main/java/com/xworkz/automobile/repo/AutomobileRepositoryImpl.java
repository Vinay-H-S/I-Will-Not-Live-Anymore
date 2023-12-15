package com.xworkz.automobile.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.automobile.dto.VehicleDTO;

public class AutomobileRepositoryImpl implements AutomobileRepository {

	public void saveVehicleDetails(VehicleDTO vehicleDTO) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String insertQurey = "Insert into automobile(name,color,type,model) values (?,?,?,?)";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile", "root",
					"Xworkzodc@123");
			PreparedStatement st = conn.prepareStatement(insertQurey);
			st.setString(1, vehicleDTO.getName());
			st.setString(2, vehicleDTO.getColor());
			st.setString(3, vehicleDTO.getType());
			st.setInt(4, vehicleDTO.getModel());
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void saveVehicleDetails(List<VehicleDTO> vehicleDTO1) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String insertQurey = "Insert into automobile(name,color,type,model) values (?,?,?,?)";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile", "root",
					"Xworkzodc@123");
			PreparedStatement st = conn.prepareStatement(insertQurey);
			for (VehicleDTO vehicle : vehicleDTO1) {
				st.setString(1, vehicle.getName());
				st.setString(2, vehicle.getColor());
				st.setString(3, vehicle.getType());
				st.setInt(4, vehicle.getModel());
				st.execute();
			}
//			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateAndSaveVehicle(VehicleDTO updateVehicle) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String insertQurey = "update automobile set color=?,model=? where name=?";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile", "root",
					"Xworkzodc@123");
			PreparedStatement st = conn.prepareStatement(insertQurey);

			st.setString(1, updateVehicle.getColor());
			st.setInt(2, updateVehicle.getModel());
			st.setString(3, updateVehicle.getName());
			st.executeUpdate();
//			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateAndSaveVehicle(List<VehicleDTO> updateVehicle) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String insertQurey = "update automobile set color=?,model=? where name=?";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile", "root",
					"Xworkzodc@123");
			PreparedStatement st = conn.prepareStatement(insertQurey);
			for (VehicleDTO vehicle : updateVehicle) {
				st.setString(1, vehicle.getColor());
				st.setInt(2, vehicle.getModel());
				st.setString(3, vehicle.getName());
				st.executeUpdate();
			}
//			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<VehicleDTO> fetchAllDetails() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String fetchQurey = "select * from automobile";
		List<VehicleDTO> vehicle=new ArrayList<VehicleDTO>();

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile", "root",
					"Xworkzodc@123");
			PreparedStatement st = conn.prepareStatement(fetchQurey);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				VehicleDTO dto = new VehicleDTO();
				dto.setModel(rs.getInt("model"));
				dto.setColor(rs.getString("color"));
				dto.setName(rs.getString("name"));
				dto.setType(rs.getString("type"));
				vehicle.add(dto);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicle;
	}
}
