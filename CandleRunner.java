class CandleRunner{
	
	public static void main(String[] args)
	{
	Candle details=new Candle("Bella Vita Organic",240,"Rose,vanila,Cinnamon",4);
	Candle.detailsStatic();
	System.out.println("\n");
	details.detailsInstance();
	}
}