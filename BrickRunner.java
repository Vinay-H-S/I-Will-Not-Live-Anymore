class BrickRunner{
	public static void main(String[] args)
	{
		Brick process=new Brick("Preparation of clay","Molding","Drying","Burning");
		Brick.processStatic();
		System.out.println("\n");
		process.processInstance();
	}
}