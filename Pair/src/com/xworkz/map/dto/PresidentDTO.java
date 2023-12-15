package com.xworkz.map.dto;

import java.util.Objects;

public class PresidentDTO {

	private int id;
	private String name;

	public PresidentDTO() {
		// TODO Auto-generated constructor stub
	}

	public PresidentDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PresidentDTO other = (PresidentDTO) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "PresidentDTO [id=" + id + ", name=" + name + "]";
	}
	

}
