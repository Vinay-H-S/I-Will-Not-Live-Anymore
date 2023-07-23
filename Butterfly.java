class Butterfly{
	
	static String stage1;
	static String stage2;
	String stage3;
	String stage4;
	
	Butterfly(String stage1,String stage2,String stage3,String stage4)
	{
		this.stage1=stage1;
		this.stage2=stage2;
		this.stage3=stage3;
		this.stage4=stage4;
	}
	static{
		stage1="Egg";
		stage2="Caterpiller (The Feeding Stage)";
		}
		static void lifeCycleStatic()
		{
			System.out.println("invoking life Cycle Static in Butterfly");
			System.out.println("Stage 1 :"+stage1);
			System.out.println("Stage 2 :"+stage2);
		}
		void lifeCycleInstance()
		{
			System.out.println("invoking life Cycle Instance in Butterfly");
			System.out.println("Stage 3 :"+stage3);
			System.out.println("Stage 4 :"+stage4);
		}
}