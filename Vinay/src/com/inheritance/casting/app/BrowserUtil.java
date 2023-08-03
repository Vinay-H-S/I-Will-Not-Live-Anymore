package com.inheritance.casting.app;

public class BrowserUtil {
	public static void run(Browser browser) 
	{
		System.out.println(browser.type);
		browser.web();
		
		if(browser instanceof ChromeBrowser)
		{
			ChromeBrowser browse=(ChromeBrowser)browser;
			System.out.println("Chrome Browser engines :"+browse.engines);
			browse.chrome();
		}
		
		if(browser instanceof OperaBrowser)
		{
			OperaBrowser browse1=(OperaBrowser)browser;
			System.out.println("Opera Browser engines :"+browse1.engines);
			browse1.opera();
		}
		
		if(browser instanceof FireFoxBrowser)
		{
			FireFoxBrowser browse2=(FireFoxBrowser)browser;
			System.out.println("FireFox Browser engines :"+browse2.engines);
			browse2.fireFox();
		}
		
		if(browser instanceof MicrosoftEdgeBrowser)
		{
			MicrosoftEdgeBrowser browse3=(MicrosoftEdgeBrowser)browser;
			System.out.println("Microsoft Edge Browser engines :"+browse3.engines);
			browse3.edge();
		}
		
		
		
		
		
	}

}
