class ButterflyRunner{
	public static void main(String[] args)
	{
		Butterfly cycle=new Butterfly("Egg","Caterpiller","Pupa(The Transition Stage)","Adult (The Reproductive Stage)");
		Butterfly.lifeCycleStatic();
		System.out.println("\n");
		cycle.lifeCycleInstance();
	}
}