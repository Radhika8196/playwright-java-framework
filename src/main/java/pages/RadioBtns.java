package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class RadioBtns extends BasePage  {

    private String blueRB = "#blue";
    private String redRB = "#red";
    private String yellowRB = "#yellow";
    private String blackRB = "#black";
    private String greenRB = "#green";

	
    public RadioBtns(Page page) {
    	 super(page);
    }

    public void clickRB(String rb) {
    	
    page.locator(rb).check();
 
    }

}