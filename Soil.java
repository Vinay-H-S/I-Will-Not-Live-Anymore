class Soil{
	
	static String property1;
	static String property2;
	String property3;
	String property4;
	
	Soil(String property1,String property2,String property3,String property4)
	{
		this.property1=property1;
		this.property2=property2;
		this.property3=property3;
		this.property4=property4;
	}
	
	static{
		property1="Soil Texture";
		property2="Water Absorption";
	}
	static void propertiesStatic()
	{
		System.out.println("invoking roperties Static in Soil");
		System.out.println("Property 1 :"+property1);
		System.out.println("Property 2 :"+property2);
	}
	void propertiesInstance()
	{
		System.out.println("invoking roperties Instance in Soil");
		System.out.println("Property 3 :"+property3);
		System.out.println("Property 4 :"+property4);
	}
}