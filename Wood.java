class Wood{
	
	String name;
	String color;
	int hardness;
	float cost;
	String commonUses;
	
	Wood(String name)
	{
		this.name=name;
		System.out.println("invoking main in Wood");
	}
	Wood(String name,String color)
	{
		this(name);
		System.out.println("invoking String,String const of Wood");
		this.color=color;
	}
	Wood(String name,String color,int hardness)
	{
		this(name,color);
		System.out.println("invoking String,String and int const of Wood");
		this.hardness=hardness;
	}
	Wood(String name,String color,int hardness,float cost)
	{
		this(name,color,hardness);
		System.out.println("invoking String,String,int and float const of Wood");
		this.cost=cost;
	}
	Wood(String name,String color,int hardness,float cost,String commonUses)
	{
		this(name,color,hardness,cost);
		System.out.println("invoking String,String,int,float and String const of Wood");
		this.commonUses=commonUses;
	}
	
}