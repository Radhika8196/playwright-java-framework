package utils;

import java.util.Arrays;

import com.microsoft.playwright.*;


public class PlaywrightFactory {
	
	Playwright playwright;
	
	Browser browser;
	
	BrowserContext context;
	
	Page page;
	
	public Page initBrowser()
	{
		
		playwright = Playwright.create(); // initiating the playwright server
		browser = playwright.chromium()
							.launch(new BrowserType.LaunchOptions()
												   .setHeadless(false)
									               .setArgs(Arrays.asList("--start-maximized")));
							// initializing browser
		
        // 2. Set viewport to null in the context
        context = browser.newContext(new Browser.NewContextOptions()
        										.setViewportSize(null));
		 
		page = context.newPage();  // actual creation of page
		 
		return page;			
		
	}
	
	public void close()
	{
		browser.close();
		page.close();
	}

}
