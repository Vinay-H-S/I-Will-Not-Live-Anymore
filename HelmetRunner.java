class HelmetRunner{
	public static void main(String[] args)
	{
		Helmet item=new Helmet("Steel Bird",1499f,"Black","ISI");
		Helmet.topStatic();
		System.out.println("\n");
		item.topInstance();
	}
}