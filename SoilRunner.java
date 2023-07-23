class SoilRunner{
	public static void main(String[] args)
	{
		Soil properties=new Soil("Soil Texture","Water Absorption","Soil Color","Soil Permeability");
		Soil.propertiesStatic();
		System.out.println("\n");
		properties.propertiesInstance();
		
	}
}