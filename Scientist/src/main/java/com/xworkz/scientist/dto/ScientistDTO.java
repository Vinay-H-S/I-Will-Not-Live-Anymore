package com.xworkz.scientist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ScientistDTO {
	
	@NotEmpty(message = "Name cannot be Empty")
	@Size(min = 4, max = 10, message = "Name should be min 4 or max 10")
	private String scientsitName;

	@NotNull(message = "Field cannot be empty")
	private String field;

	@Min(value = 5,message = "Experience should min 5 or max 35" )
	@Max(value = 35, message = "Experience should min 5 or max 35")
	private Integer experience;

	@NotNull(message = "country cannot be empty")
	private String country;

	@NotEmpty(message = "achievements cannot be empty")
	private String achievements;
}
