class WardrobeRunner{
	public static void main(String[] args)
	{
		Wardrobe item=new Wardrobe("Woodbuzz","Brown",1,"Engineered Wood");
		Wardrobe.itemStatic();
		System.out.println("\n");
		item.itemInstance();
	}
}