package com.xworkz.app.dto;

public class OceanDTO implements Comparable<OceanDTO>{

	private String oceanName;
	private int depth;
	private String location;
	private String shape;

	public OceanDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OceanDTO [oceanName=" + oceanName + ", depth=" + depth + ", location=" + location + ", shape=" + shape
				+ "]";
	}

	public String getOceanName() {
		return oceanName;
	}

	public void setOceanName(String oceanName) {
		this.oceanName = oceanName;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public OceanDTO(String oceanName, int depth, String location, String shape) {
		super();
		this.oceanName = oceanName;
		this.depth = depth;
		this.location = location;
		this.shape = shape;
	}

	@Override
	public int compareTo(OceanDTO ocean) {
		OceanDTO current=this;
		if(current.depth==ocean.depth) {
			return 0;
		}
		if(current.depth>ocean.depth) {
			return 88;
		}
		if(current.depth<ocean.depth) {
			return -1;
		}
		
		return 0;
	}

}
