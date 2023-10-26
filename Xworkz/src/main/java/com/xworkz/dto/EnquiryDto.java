package com.xworkz.dto;

public class EnquiryDto {

	private String name;
	private String phoneNo;
	private String email;
	private String dob;
	private String location;
	private String password;
	private String confirmPassword;
	private String checkBox;
	
	public EnquiryDto() {
		// TODO Auto-generated constructor stub
	}

	public EnquiryDto(String name, String phoneNo, String email, String dob, String location, String password,
			String confirmPassword, String checkBox) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.dob = dob;
		this.location = location;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.checkBox = checkBox;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getCheckBox() {
		return checkBox;
	}

	public void setCheckBox(String checkBox) {
		this.checkBox = checkBox;
	}
	
}
