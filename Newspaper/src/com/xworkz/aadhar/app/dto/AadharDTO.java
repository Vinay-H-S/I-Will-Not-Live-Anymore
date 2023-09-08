package com.xworkz.aadhar.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable{

	private String name;
	private long aadharno;
	private String state;
	
	public AadharDTO()
	{
		
	}
	
	public AadharDTO(String name,long aadharno,String state)
	{
		this.name=name;
		this.aadharno=aadharno;
		this.state=state;
	}
	
	@Override
	public String toString()
	{
		return "AadharDTO [name=" + name +", aadharno="+ aadharno +", state="+ state +"]";
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public long getAadharno()
	{
		return aadharno;
	}
	
	public void setAadharno(long aadharno)
	{
		this.aadharno=aadharno;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state=state;
	}
}
