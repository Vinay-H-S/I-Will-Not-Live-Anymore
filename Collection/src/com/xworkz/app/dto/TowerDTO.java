package com.xworkz.app.dto;

public class TowerDTO implements Comparable<TowerDTO>{

	private String name;
	private String owner;
	private int height;
	
	public TowerDTO() {
		// TODO Auto-generated constructor stub
	}

	public TowerDTO(String name, String owner, int height) {
		super();
		this.name = name;
		this.owner = owner;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "TowerDTO [name=" + name + ", owner=" + owner + ", height=" + height + "]";
	}

	@Override
	public int compareTo(TowerDTO towerDTO) {
	TowerDTO current=this;
	if(current.height==towerDTO.height) {
		return 0;
	}
	if (current.height>towerDTO.height) {
		return 8;
	}
	if(current.height<towerDTO.height) {
		return -1;
	}
		return 0;
	}
	
	
}
