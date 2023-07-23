class Wardrobe{
	static String brand;
	static String color;
	int warranty;
	String material;
	
	Wardrobe(String brand,String color,int warranty,String material)
	{
		this.brand=brand;
		this.color=color;
		this.warranty=warranty;
		this.material=material;
	}
	static{
		brand="Woodbuzz";
		color="Brown";
	}
	static void itemStatic()
	{
		System.out.println("invoking Item Static in Wardrobe");
		System.out.println("Wardrobe Brand :"+brand);
		System.out.println("Color :"+color);
	}
	void itemInstance()
	{
		System.out.println("invoking Item Instance in Wardrobe");
		System.out.println("Warranty :"+warranty);
		System.out.println("Material :"+material);
	}
}