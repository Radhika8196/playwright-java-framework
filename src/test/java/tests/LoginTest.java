package tests;

import utils.ConfigReader;
import pages.LoginPage;

import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin()
    {
        LoginPage loginPage = new LoginPage(page);

        ConfigReader config = new ConfigReader();

        loginPage.navigate(config.get("baseUrl"));
        loginPage.login(config.get("username"), config.get("password"));
        

        String expText = "logged";
        String actText = page.locator("#flash").textContent();
        

        System.out.println(actText);        
        assertThat(page.locator("#flash")).containsText(expText);
       
          
        }
}