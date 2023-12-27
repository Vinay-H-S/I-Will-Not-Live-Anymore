package com.xworkz.cake.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CakeDTO {

	@NotEmpty(message = "Customer name cannot be empty")
	private String customerName;

	@Email(message = "Enter valid email")
	private String email;

	@NotEmpty(message = "Flavour cannot be empty")
	private String flavour;

	@NotEmpty(message = "Weigth cannot be empty")
	private String weigth;

	@Min(value = 200)
	@Max(value = 1000, message = "Price should be min 200 and max 1000")
	private int price;

	private String takeAway;

}
