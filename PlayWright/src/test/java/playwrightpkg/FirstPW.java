package playwrightpkg;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirstPW {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		
		lp.setChannel("chrome");
		lp.setHeadless(false);
		
		Browser browser = playwright.chromium().launch(lp);
		
		Page page = browser.newPage();
		
		page.navigate("https://www.google.com");
		
		System.out.println("title-->" +page.title());
		
		System.out.println("url-->" +page.url());
		
		page.close();
		browser.close();
		playwright.close();

	}

}
