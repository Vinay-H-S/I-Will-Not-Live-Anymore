package com.xworkz.app.dto;

import java.util.Objects;

public class HotelDTO {

	private int id;
	private String name;
	private String ownerName;
	private String gstNo;
	private String location;

	public HotelDTO() {
		// TODO Auto-generated constructor stub
	}

	public HotelDTO(int id, String name, String ownerName, String gstNo, String location) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.gstNo = gstNo;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", gstNo=" + gstNo + ", location="
				+ location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gstNo, id, location, name, ownerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDTO other = (HotelDTO) obj;
		return Objects.equals(gstNo, other.gstNo) && id == other.id && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name) && Objects.equals(ownerName, other.ownerName);
	}

}
