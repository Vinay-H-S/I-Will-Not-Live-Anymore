package com.xworkz.app.dto;

public class RobotDTO implements Comparable<RobotDTO>{

	private String manafactureCompany;
	private String founder;
	private double cost;

	public RobotDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getManafactureCompany() {
		return manafactureCompany;
	}

	public void setManafactureCompany(String manafactureCompany) {
		this.manafactureCompany = manafactureCompany;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public RobotDTO(String manafactureCompany, String founder, double cost) {
		super();
		this.manafactureCompany = manafactureCompany;
		this.founder = founder;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Robot [manafactureCompany=" + manafactureCompany + ", founder=" + founder + ", cost=" + cost + "]";
	}

	@Override
	public int compareTo(RobotDTO robotDTO) {
		RobotDTO current=this;
		if(current.cost==robotDTO.cost) {
			return 0;
		}
		if (current.cost>robotDTO.cost) {
			return 8;
		}
		if(current.cost<robotDTO.cost) {
			return -1;
		}
		return 0;
	}

}
