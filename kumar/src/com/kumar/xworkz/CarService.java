package com.kumar.xworkz;

public class CarService {
	
	String brand;
	String carName;
	float cost;
	double spares;
	int extraMaterials;
	char specification;
	
	
	
	public void service()
	{
		this.brand=brand;
		this.carName=carName;
		this.cost=cost;
		this.spares=spares;
		this.extraMaterials=extraMaterials;
		this.specification=specification;
		
	}
	
	
	
	@Override
	public String toString() {
		return "CarService [brand=" + brand + ", carName=" + carName + ", cost=" + cost + ", spares=" + spares
				+ ", extraMaterials=" + extraMaterials + ", specification=" + specification + "]";
	}



	public CarService(String brand, String carName, float cost, double spares, int extraMaterials, char specification) {
		super();
		this.brand = brand;
		this.carName = carName;
		this.cost = cost;
		this.spares = spares;
		this.extraMaterials = extraMaterials;
		this.specification = specification;
	}

	}
	


