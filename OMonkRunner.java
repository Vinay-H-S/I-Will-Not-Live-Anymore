class OMonkRuuner{
	public static void main(String[] args)
	{
		System.out.println("---------------------------------------------");
		System.out.println("--------------------WOOD---------------------");
		System.out.println("---------------------------------------------");
		
		Wood piece=new Wood("Maple");
		System.out.println("\n");
		Wood piece1=new Wood("Maple","White with some reddish-brown",1450);
		System.out.println("\n");
		Wood piece2=new Wood("Maple","White with some reddish-brown",1450,6560,"Furniture, flooring and sport equipment");
		
		System.out.println("\n");
		
		System.out.println("---------------------------------------------");
		System.out.println("--------------------MALL---------------------");
		System.out.println("---------------------------------------------");
		
		Mall mall=new Mall("Beary's City Centre Mall",2014,"Shivamogga");
		System.out.println("\n");
		Mall mall1=new Mall("Beary's City Centre Mall",2014,"Shivamogga",4,"KSRTC",true);
		System.out.println("\n");
		Mall mall2=new Mall("Beary's City Centre Mall",2014,"Shivamogga",4,"KSRTC",true,"EKK Group",85000,"cityshimoga.com");
		
		System.out.println("\n");
		
		System.out.println("---------------------------------------------");
		System.out.println("--------------------PARK---------------------");
		System.out.println("---------------------------------------------");
		
		Park area=new Park("Valley of flowers national park",1988,"Uttarakhand");
		System.out.println("\n");
		Park area1=new Park("Valley of flowers national park",1988,"Uttarakhand",8750,"Nandi devi and valley of flowers national park");
		System.out.println("\n");
		Park area2=new Park("Valley of flowers national park",1988,"Uttarakhand",8750,"Nandi devi and valley of flowers national park",3658,87.58);
	}
}