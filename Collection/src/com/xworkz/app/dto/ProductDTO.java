package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductDTO implements Serializable,Comparable<ProductDTO>{

	private int id;
	private String name;
	private double price;
	private LocalDate manfDate;
	private LocalDate expDate;
	private double discount;
	private String description;
	private String quantity;
	private int rating;
	private int totalPeopleRated;
	private int peopleRatedFive;
	private int peopleRatedFour;
	private int peopleRatedThree;
	private int peopleRatedTwo;
	private int peopleRatedOne;
	private String packer;
	private String 	temWeight;
	private String included;
	private String genericName;
	private LocalDate dateFirstAvailble;
	private String asin;
	private boolean damaged;
	private String countryOfOrigin;
	private String modelNo;
	private String serialNo;
	private boolean returnable;
	private String warranty;
	private LocalDate primeDelivery;
	private LocalDate deliveryExpectedDate;
	private LocalDate returnBy;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(int id, String name, double price, LocalDate manfDate, LocalDate expDate, double discount,
			String description, String quantity, int rating, int totalPeopleRated, int peopleRatedFive,
			int peopleRatedFour, int peopleRatedThree, int peopleRatedTwo, int peopleRatedOne, String packer,
			String temWeight, String included, String genericName, LocalDate dateFirstAvailble, String asin,
			boolean damaged, String countryOfOrigin, String modelNo, String serialNo, boolean returnable,
			String warranty, LocalDate primeDelivery, LocalDate deliveryExpectedDate, LocalDate returnBy) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manfDate = manfDate;
		this.expDate = expDate;
		this.discount = discount;
		this.description = description;
		this.quantity = quantity;
		this.rating = rating;
		this.totalPeopleRated = totalPeopleRated;
		this.peopleRatedFive = peopleRatedFive;
		this.peopleRatedFour = peopleRatedFour;
		this.peopleRatedThree = peopleRatedThree;
		this.peopleRatedTwo = peopleRatedTwo;
		this.peopleRatedOne = peopleRatedOne;
		this.packer = packer;
		this.temWeight = temWeight;
		this.included = included;
		this.genericName = genericName;
		this.dateFirstAvailble = dateFirstAvailble;
		this.asin = asin;
		this.damaged = damaged;
		this.countryOfOrigin = countryOfOrigin;
		this.modelNo = modelNo;
		this.serialNo = serialNo;
		this.returnable = returnable;
		this.warranty = warranty;
		this.primeDelivery = primeDelivery;
		this.deliveryExpectedDate = deliveryExpectedDate;
		this.returnBy = returnBy;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", manfDate=" + manfDate + ", expDate="
				+ expDate + ", discount=" + discount + ", description=" + description + ", quantity=" + quantity
				+ ", rating=" + rating + ", totalPeopleRated=" + totalPeopleRated + ", peopleRatedFive="
				+ peopleRatedFive + ", peopleRatedFour=" + peopleRatedFour + ", peopleRatedThree=" + peopleRatedThree
				+ ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne=" + peopleRatedOne + ", packer=" + packer
				+ ", temWeight=" + temWeight + ", included=" + included + ", genericName=" + genericName
				+ ", dateFirstAvailble=" + dateFirstAvailble + ", asin=" + asin + ", damaged=" + damaged
				+ ", countryOfOrigin=" + countryOfOrigin + ", modelNo=" + modelNo + ", serialNo=" + serialNo
				+ ", returnable=" + returnable + ", warranty=" + warranty + ", primeDelivery=" + primeDelivery
				+ ", deliveryExpectedDate=" + deliveryExpectedDate + ", returnBy=" + returnBy + "]";
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

	public LocalDate getManfDate() {
		return manfDate;
	}

	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTotalPeopleRated() {
		return totalPeopleRated;
	}

	public void setTotalPeopleRated(int totalPeopleRated) {
		this.totalPeopleRated = totalPeopleRated;
	}

	public int getPeopleRatedFive() {
		return peopleRatedFive;
	}

	public void setPeopleRatedFive(int peopleRatedFive) {
		this.peopleRatedFive = peopleRatedFive;
	}

	public int getPeopleRatedFour() {
		return peopleRatedFour;
	}

	public void setPeopleRatedFour(int peopleRatedFour) {
		this.peopleRatedFour = peopleRatedFour;
	}

	public int getPeopleRatedThree() {
		return peopleRatedThree;
	}

	public void setPeopleRatedThree(int peopleRatedThree) {
		this.peopleRatedThree = peopleRatedThree;
	}

	public int getPeopleRatedTwo() {
		return peopleRatedTwo;
	}

	public void setPeopleRatedTwo(int peopleRatedTwo) {
		this.peopleRatedTwo = peopleRatedTwo;
	}

	public int getPeopleRatedOne() {
		return peopleRatedOne;
	}

	public void setPeopleRatedOne(int peopleRatedOne) {
		this.peopleRatedOne = peopleRatedOne;
	}

	public String getPacker() {
		return packer;
	}

	public void setPacker(String packer) {
		this.packer = packer;
	}

	public String getTemWeight() {
		return temWeight;
	}

	public void setTemWeight(String temWeight) {
		this.temWeight = temWeight;
	}

	public String getIncluded() {
		return included;
	}

	public void setIncluded(String included) {
		this.included = included;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public LocalDate getDateFirstAvailble() {
		return dateFirstAvailble;
	}

	public void setDateFirstAvailble(LocalDate dateFirstAvailble) {
		this.dateFirstAvailble = dateFirstAvailble;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public boolean isDamaged() {
		return damaged;
	}

	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public boolean isReturnable() {
		return returnable;
	}

	public void setReturnable(boolean returnable) {
		this.returnable = returnable;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public LocalDate getPrimeDelivery() {
		return primeDelivery;
	}

	public void setPrimeDelivery(LocalDate primeDelivery) {
		this.primeDelivery = primeDelivery;
	}

	public LocalDate getDeliveryExpectedDate() {
		return deliveryExpectedDate;
	}

	public void setDeliveryExpectedDate(LocalDate deliveryExpectedDate) {
		this.deliveryExpectedDate = deliveryExpectedDate;
	}

	public LocalDate getReturnBy() {
		return returnBy;
	}

	public void setReturnBy(LocalDate returnBy) {
		this.returnBy = returnBy;
	}

	@Override
	public int compareTo(ProductDTO o) {
		
		return Integer.compare(this.id, o.id);
	}
}
