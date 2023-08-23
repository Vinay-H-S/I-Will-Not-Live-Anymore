package com.xworkz.task.app;

public interface Metro {

	 public abstract void dontCarryExplosiveMaterials(String materials);
	
	 public abstract boolean takeTokenOrSmartCard(boolean noEntry);
	
	 public abstract boolean prohibatedFromCarryingLiquorBottles(boolean ruleWillbeBreak);
	
}
