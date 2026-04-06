package pages;

import com.microsoft.playwright.Page;

public class BasePage {
	protected Page page;

	public BasePage(Page page) { // assigning here the page created in the page factory
		this.page = page;
	}

	public void navigate(String url) {
		page.navigate(url);
	}

	public String getTitle() {
		return page.title();
	}
}


