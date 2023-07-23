class Power{
	
	static char symbol;
	static String dimension;
	String siUnit;
	String baseUnit;
	Power(char symbol,String dimension,String siUnit,String baseUnit)
	{
		this.symbol=symbol;
		this.dimension=dimension;	
		this.siUnit=siUnit;
		this.baseUnit=baseUnit;
	}
	static{
		symbol='P';
		dimension="L^2 MT^-3";	
	}
	static void printStatic()
	{
		System.out.println("invoking the printstatic in Power");
		System.out.println("Symbol :"+symbol);
		System.out.println("Dimension :"+dimension);
	}
	
	void printInstance()
	{
		System.out.println("invoking the printInstance in Power");
		System.out.println("SI Unit :"+siUnit);
		System.out.println("Base Unit :"+baseUnit);
	}
	
	
}