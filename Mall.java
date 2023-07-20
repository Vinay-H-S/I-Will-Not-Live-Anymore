class Mall{
	String name;
	int openingYear;
	String location;
	int noOfFloors;
	String architect;
	boolean homeDelivery;
	String developer;
	int totalRetailFloorArea;
	String website;
	
	Mall(String name)
	{
		this.name=name;
		System.out.println("invoking String const of Mall");
	}
	Mall(String name,int openingYear)
	{
		this(name);
		this.openingYear=openingYear;
		System.out.println("invoking String and int const of Mall");
	}
	Mall(String name,int openingYear,String location)
	{
		this(name,openingYear);
		this.location=location;
		System.out.println("invoking String,int and String const of Mall");
	}
	Mall(String name,int openingYear,String location,int noOfFloors)
	{
		this(name,openingYear,location);
		this.noOfFloors=noOfFloors;
		System.out.println("invoking String,int,String and int const of Mall");
	}
	Mall(String name,int openingYear,String location,int noOfFloors,String architect)
	{
		this(name,openingYear,location,noOfFloors);
		this.architect=architect;
		System.out.println("invoking String,int,String,int and String const of Mall");
	}
	Mall(String name,int openingYear,String location,int noOfFloors,String architect,boolean homeDelivery)
	{
		this(name,openingYear,location,noOfFloors,architect);
		this.homeDelivery=homeDelivery;
		System.out.println("invoking String,int,String,int,String and boolean const of Mall");
	}
	Mall(String name,int openingYear,String location,int noOfFloors,String architect,boolean homeDelivery,String developer)
	{
		this(name,openingYear,location,noOfFloors,architect,homeDelivery);
		this.developer=developer;
		System.out.println("invoking String,int,String,int,String,boolean and String const of Mall");
	}
	Mall(String name,int openingYear,String location,int noOfFloors,String architect,boolean homeDelivery,String developer,int totalRetailFloorArea)
	{
		this(name,openingYear,location,noOfFloors,architect,homeDelivery,developer);
		this.totalRetailFloorArea=totalRetailFloorArea;
		System.out.println("invoking String,int,String,int,String,boolean,String and int const of Mall");
	}
	Mall(String name,int openingYear,String location,int noOfFloors,String architect,boolean homeDelivery,String developer,int totalRetailFloorArea,String website)
	{
		this(name,openingYear,location,noOfFloors,architect,homeDelivery,developer,totalRetailFloorArea);
		this.website=website;
		System.out.println("invoking String,int,String,int,String,boolean,String,int and String const of Mall");
	}
	
	
}