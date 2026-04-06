package pages;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {

    private String username = "#username";
    private String password = "#password";
    private String loginBtn = "#submit-login";

    public LoginPage(Page page) {
        super(page);
    }

    public void login(String user, String pass) {
        page.fill(username, user);
       
        page.fill(password, pass);
        page.click(loginBtn);
        
    }
}