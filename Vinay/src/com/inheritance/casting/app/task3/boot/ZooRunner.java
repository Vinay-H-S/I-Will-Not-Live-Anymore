package com.inheritance.casting.app.task3.boot;

import com.inheritance.casting.app.task3.app.*;
public class ZooRunner {

	public static void main(String[] args) {
		Zoo cage=new Zoo();
		StateZoo cage1=new StateZoo();
		NationalZoo cage2=new NationalZoo();
		
		ZooUtil.zebra(cage);
		System.out.println("-----------------");
		ZooUtil.zebra(cage1);
		System.out.println("---------------------");
		ZooUtil.zebra(cage2);
		
	}

}
