package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class InputsPage extends BasePage  {

    private String display = "#btn-display-inputs";
    private String clear = "#btn-clear-inputs";
    private String numberIn = "input[name='input-number']";
    private String textIn = "#input-text";
    private String passwordFieldIn = "#input-password";
    private String dateIn = "#input-date";

	
    public InputsPage(Page page) {
    	 super(page);
    }

    public void inputNumber(String num) {
    	
    	page.fill(numberIn, num);
    	page.click(display);
 
    }
    
    public void inputText(String txt) {
    	
    	page.fill(textIn, txt);
    	page.click(display);
 
    }
    
    public void inputPwd(String pwd) {
    	
    	page.fill(passwordFieldIn, pwd);
    	page.click(display);
 
    }
    
    
    public Locator dateField() { 
    	return page.locator("#input-date"); 
    	}
    
    public void inputdate(String dt) {
    	
    	page.click(display);
 
    }
    
}