package com.xworkz.engineer.app.dto;

import java.io.Serializable;
import java.util.Objects;

public class EngineerDTO implements Serializable{

	private int id;
	private String name;
	private String collegeName;
	
	public EngineerDTO() {
	}

	public EngineerDTO(int id, String name, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof EngineerDTO)
			{
				EngineerDTO dto=(EngineerDTO)obj;
				if(this.name.equals(dto.name) && this.id==dto.id && this.collegeName.equals(dto.collegeName))
				{
					System.err.println("Instance are same "+dto);
					return true;
				}
			}
		}
		
		return super.equals(obj);
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

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
}
