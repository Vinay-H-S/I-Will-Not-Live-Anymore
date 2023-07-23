class Brick{
	static String method1;
	static String method2;
	String method3;
	String method4;
	
	Brick(String method1,String method2,String method3,String method4)
	{
		this.method1=method1;
		this.method2=method2;
		this.method3=method3;
		this.method4=method4;
	}
	static{
		method1="Preparation of clay";
		method2="Molding";
	}
	static void processStatic()
	{
		System.out.println("invoking Process Static in Brick");
		System.out.println("Method 1 :"+method1);
		System.out.println("Method 2 :"+method2);
	}
	void processInstance()
	{
		System.out.println("invoking Process Instance in Brick");
		System.out.println("Method 3 :"+method3);
		System.out.println("Method 4 :"+method4);
	}
}