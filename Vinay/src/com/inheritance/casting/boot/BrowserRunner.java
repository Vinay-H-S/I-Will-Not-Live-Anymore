package com.inheritance.casting.boot;

import com.inheritance.casting.app.*;

public class BrowserRunner {

	public static void main(String[] args) {
		Browser web=new Browser();
		ChromeBrowser web1=new ChromeBrowser();
		OperaBrowser web2=new OperaBrowser();
		FireFoxBrowser web3=new FireFoxBrowser();
		MicrosoftEdgeBrowser web4=new MicrosoftEdgeBrowser();
		
		BrowserUtil.run(web);
		System.out.println("------------------------");
		BrowserUtil.run(web1);
		System.out.println("------------------------");
		BrowserUtil.run(web2);
		System.out.println("------------------------");
		BrowserUtil.run(web3);
		System.out.println("------------------------");
		BrowserUtil.run(web4);
		System.out.println("------------------------");

	}

}
