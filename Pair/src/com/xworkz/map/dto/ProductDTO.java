package com.xworkz.map.dto;

import java.time.LocalDate;
import java.util.Objects;

public class ProductDTO implements Comparable<ProductDTO>{

	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;
	private LocalDate mfgDte;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Integer id, String name, Double price, Integer quantity, LocalDate mfgDte) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.mfgDte = mfgDte;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", mfgDte="
				+ mfgDte + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, mfgDte, name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(mfgDte, other.mfgDte) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) && Objects.equals(quantity, other.quantity);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public LocalDate getMfgDte() {
		return mfgDte;
	}

	public void setMfgDte(LocalDate mfgDte) {
		this.mfgDte = mfgDte;
	}
	
	@Override
	public int compareTo(ProductDTO o) {
		return this.id.compareTo(o.id);
	}
	
}
