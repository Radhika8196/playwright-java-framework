package tests;

import utils.ConfigReader;
import pages.LoginPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class LoginTest extends BaseTest {
	LoginPage loginPage ;
	ConfigReader config ;
	@BeforeMethod
	public void beforeTest() {
//		page = context.newPage();
		loginPage = new LoginPage(page);
		config = new ConfigReader();
		page.navigate(config.get("baseUrl"));
	}

	@Test(priority=4)
	public void verifyLogin()
	{

		loginPage.login(config.get("username"), config.get("password"));
		String expText = "logged";
		String actText = page.locator("#flash").textContent();
		System.out.println(actText);        
		assertThat(page.locator("#flash")).containsText(expText);

	}


	@Test(priority=1)
	public void invalidLogin_wrongPassword() {

		loginPage.login(config.get("username"), "wrongPassword");
		System.out.println(page.locator("#flash").textContent());
		assertThat(page.locator("#flash")).containsText("Your password is invalid!");

	}


	@Test(priority=2)
	public void invalidLogin_wrongUsername() {

		loginPage.login("wrongUser", config.get("password"));
		System.out.println(page.locator("#flash").textContent());
		assertThat(page.locator("#flash")).containsText("invalid!");
	}


	@Test(priority=3)
	public void invalidLogin_emptyFields() {

		page.click("#submit-login");
		System.out.println(page.locator("#flash").textContent());
		assertThat(page.locator("#flash")).containsText("Your username is invalid!");
	}


}