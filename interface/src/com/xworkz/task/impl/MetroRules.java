package com.xworkz.task.impl;

import com.xworkz.task.app.Metro;

public class MetroRules implements Metro {

	@Override
	public void dontCarryExplosiveMaterials(String materials) {
		System.out.println("invoking Don't carry explosive materials in Metro rules...");
		System.out.println("Materials :"+materials);
	}

	@Override
	public boolean takeTokenOrSmartCard(boolean noEntry) {
		System.out.println("invoking take Token Or SmartCard in Metro rules..");
		System.out.println("No Entry :"+noEntry);
		return false;
	}

	@Override
	public boolean prohibatedFromCarryingLiquorBottles(boolean ruleWillbeBreak) {
		System.out.println("invoking prohibated From Carrying Liquor Bottles in Metro rules..");
		System.out.println("Rule Will be break :"+ruleWillbeBreak);
		return false;
	}

}
