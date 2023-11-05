package com.xworkz.app.dto;

import java.time.LocalDate;
import java.util.Objects;

public class CameraDTO {

	private int id;
	private String brand;
	private String model;
	private double cost;
	private LocalDate manufacturedDate;

	public CameraDTO() {
		// TODO Auto-generated constructor stub
	}

	public CameraDTO(int id, String brand, String model, double cost, LocalDate manufacturedDate) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cost = cost;
		this.manufacturedDate = manufacturedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, cost, id, manufacturedDate, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CameraDTO other = (CameraDTO) obj;
		return Objects.equals(brand, other.brand)
				&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(manufacturedDate, other.manufacturedDate) && Objects.equals(model, other.model);
	}

	@Override
	public String toString() {
		return "CameraDTO [id=" + id + ", brand=" + brand + ", model=" + model + ", cost=" + cost
				+ ", manufacturedDate=" + manufacturedDate + "]";
	}

	

}
