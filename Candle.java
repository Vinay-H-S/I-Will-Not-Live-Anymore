class Candle{
	static String name;
	static int weight;
	String scent;
	int noOfItem;
	
	Candle(String name,int weight,String scent,int noOfItem)
	{
		this.name=name;
		this.weight=weight;
		this.scent=scent;
		this.noOfItem=noOfItem;
	}
	static{
		name="Bella Vita Organic";
		weight=240;
	}
	static void detailsStatic()
	{
		System.out.println("invoking details Static in Candle");
		System.out.println("Candle name :"+name);
		System.out.println("Item Weight :"+weight);
	}
	void detailsInstance()
	{
		System.out.println("invoking details Instance in Candle");
		System.out.println("Scent :"+scent);
		System.out.println("No of item :"+noOfItem);
	}
	
}