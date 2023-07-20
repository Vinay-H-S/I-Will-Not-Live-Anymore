class Park{
	String name;
	int inscription;
	String location;
	int area;
	String partOf;
	int aboveSeaLevel;
	double parkStreches;
	
	Park(String name)
	{
		this.name=name;
		System.out.println("invoking String const of Park");
	}
	Park(String name,int inscription)
	{
		this(name);
		this.inscription=inscription;
		System.out.println("invoking String and int const of Park");
	}
	Park(String name,int inscription,String location)
	{
		this(name,inscription);
		this.location=location;
		System.out.println("invoking String,int and String comst of Park");
	}
	Park(String name,int inscription,String location,int area)
	{
		this(name,inscription,location);
		this.area=area;
		System.out.println("invoking String,int,String and int const of Park");
	}
	Park(String name,int inscription,String location,int area,String partOf)
	{
		this(name,inscription,location,area);
		this.partOf=partOf;
		System.out.println("invoking String,int,String,int and String const of Park");
	}
	Park(String name,int inscription,String location,int area,String partOf,int aboveSeaLevel)
	{
		this(name,inscription,location,area,partOf);
		this.aboveSeaLevel=aboveSeaLevel;
		System.out.println("invoking String ,int,String,int,String and int const of Park");
	}
	Park(String name,int inscription,String location,int area,String partOf,int aboveSeaLevel,double parkStreches)
	{
		this(name,inscription,location,area,partOf,aboveSeaLevel);
		this.parkStreches=parkStreches;
		System.out.println("invoking String,int,String,int,String,int and double const of Park");
	}
	
}