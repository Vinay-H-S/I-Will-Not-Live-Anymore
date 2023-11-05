package com.xworkz.app.dto;

import java.util.Objects;

public class SaloonItemDTO {

	private int id;
	private String name;
	private double price;
	private String usage;
	private boolean usedForMan;
	
	public SaloonItemDTO() {
		
	}
	
	public SaloonItemDTO(int id, String name, double price, String usage, boolean usedForMan) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.usage = usage;
		this.usedForMan = usedForMan;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public boolean isMan() {
		return usedForMan;
	}

	public void setMan(boolean usedForMan) {
		this.usedForMan = usedForMan;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaloonItemDTO other = (SaloonItemDTO) obj;
		return id == other.id && usedForMan == other.usedForMan && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(usage, other.usage);
	}

	@Override
	public String toString() {
		return "SaloonItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", usage=" + usage + ", usedForMan="
				+ usedForMan + "]";
	}

	
}
