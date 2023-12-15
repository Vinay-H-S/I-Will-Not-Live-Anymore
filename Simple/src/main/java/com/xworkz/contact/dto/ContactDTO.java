package com.xworkz.contact.dto;

public class ContactDTO {

	private String userName;
	private String email;
	private String mobile;
	private String comment;
	
	public ContactDTO() {
		// TODO Auto-generated constructor stub
	}

	public ContactDTO(String userName, String email, String mobile, String comment) {
		super();
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "ContactDTO [userName=" + userName + ", email=" + email + ", mobile=" + mobile + ", comment=" + comment
				+ "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
